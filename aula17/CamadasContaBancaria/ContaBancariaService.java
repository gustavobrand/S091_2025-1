package aula17.CamadasContaBancaria;

import java.util.Optional;

/**
 * Camada de Negócio (Service) para operações em Conta Bancária.
 * Contém as regras de negócio e validações.
 * Interage com a camada de dados (Repository).
 */
public class ContaBancariaService {

	private ContaBancariaRepository repository;

	// Construtor que recebe a instância do repositório (Injeção de Dependência manual)
	public ContaBancariaService(ContaBancariaRepository repository) {
		this.repository = repository;
	}

	/**
	 * Cadastra uma nova conta bancária.
	 *
	 * @param nomeCorrentista Nome do correntista.
	 * @param saldoInicial Saldo inicial da conta.
	 * @return A conta bancária cadastrada.
	 * @throws IllegalArgumentException Se o saldo inicial for negativo ou a conta já existir.
	 */
	public ContaBancaria cadastrarConta(String nomeCorrentista, double saldoInicial) {
		// Validação de negócio: Saldo inicial não pode ser negativo
		if (saldoInicial < 0) {
			throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
		}
		// Validação de negócio: Não pode haver duas contas com o mesmo nome de correntista (simulando um ID único)
		if (repository.existsByNomeCorrentista(nomeCorrentista)) {
			throw new IllegalArgumentException("Já existe uma conta para o correntista: " + nomeCorrentista);
		}
		ContaBancaria novaConta = new ContaBancaria(nomeCorrentista, saldoInicial);
		return repository.save(novaConta);
	}

	/**
	 * Realiza um saque de uma conta bancária.
	 *
	 * @param nomeCorrentista Nome do correntista da conta.
	 * @param valorSaque Valor a ser sacado.
	 * @return A conta bancária atualizada após o saque.
	 * @throws IllegalArgumentException Se o valor do saque for inválido, a conta não existir ou o saldo for insuficiente.
	 */
	public ContaBancaria sacar(String nomeCorrentista, double valorSaque) {
		// Validação de negócio: Valor do saque deve ser positivo
		if (valorSaque <= 0) {
			throw new IllegalArgumentException("Valor do saque deve ser positivo.");
		}

		Optional<ContaBancaria> contaOpt = repository.findByNomeCorrentista(nomeCorrentista);
		if (contaOpt.isEmpty()) {
			throw new IllegalArgumentException("Conta não encontrada para o correntista: " + nomeCorrentista);
		}

		ContaBancaria conta = contaOpt.get();
		// Validação de negócio: Saldo insuficiente para o saque
		if (conta.getSaldo() < valorSaque) {
			throw new IllegalArgumentException("Saldo insuficiente para realizar o saque de R$ " + String.format("%.2f", valorSaque) + ". Saldo atual: R$ " + String.format("%.2f", conta.getSaldo()));
		}

		double novoSaldo = conta.getSaldo() - valorSaque;
		return repository.updateSaldo(nomeCorrentista, novoSaldo);
	}

	/**
	 * Realiza um depósito em uma conta bancária.
	 *
	 * @param nomeCorrentista Nome do correntista da conta.
	 * @param valorDeposito Valor a ser depositado.
	 * @return A conta bancaria atualizada após o depósito.
	 * @throws IllegalArgumentException Se o valor do depósito for inválido ou a conta não existir.
	 */
	public ContaBancaria depositar(String nomeCorrentista, double valorDeposito) {
		// Validação de negócio: Valor do depósito deve ser positivo
		if (valorDeposito <= 0) {
			throw new IllegalArgumentException("Valor do depósito deve ser positivo.");
		}

		Optional<ContaBancaria> contaOpt = repository.findByNomeCorrentista(nomeCorrentista);
		if (contaOpt.isEmpty()) {
			throw new IllegalArgumentException("Conta não encontrada para o correntista: " + nomeCorrentista);
		}

		ContaBancaria conta = contaOpt.get();
		double novoSaldo = conta.getSaldo() + valorDeposito;
		return repository.updateSaldo(nomeCorrentista, novoSaldo);
	}

	/**
	 * Busca uma conta bancária pelo nome do correntista.
	 *
	 * @param nomeCorrentista O nome do correntista.
	 * @return Um Optional contendo a ContaBancaria se encontrada, ou um Optional vazio.
	 */
	public Optional<ContaBancaria> buscarConta(String nomeCorrentista) {
		return repository.findByNomeCorrentista(nomeCorrentista);
	}
}
