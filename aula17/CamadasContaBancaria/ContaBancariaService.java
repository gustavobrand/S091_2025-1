package aula17.CamadasContaBancaria;

import java.util.Optional;

/**
 * Camada de Neg�cio (Service) para opera��es em Conta Banc�ria.
 * Cont�m as regras de neg�cio e valida��es.
 * Interage com a camada de dados (Repository).
 */
public class ContaBancariaService {

	private ContaBancariaRepository repository;

	// Construtor que recebe a inst�ncia do reposit�rio (Inje��o de Depend�ncia manual)
	public ContaBancariaService(ContaBancariaRepository repository) {
		this.repository = repository;
	}

	/**
	 * Cadastra uma nova conta banc�ria.
	 *
	 * @param nomeCorrentista Nome do correntista.
	 * @param saldoInicial Saldo inicial da conta.
	 * @return A conta banc�ria cadastrada.
	 * @throws IllegalArgumentException Se o saldo inicial for negativo ou a conta j� existir.
	 */
	public ContaBancaria cadastrarConta(String nomeCorrentista, double saldoInicial) {
		// Valida��o de neg�cio: Saldo inicial n�o pode ser negativo
		if (saldoInicial < 0) {
			throw new IllegalArgumentException("Saldo inicial n�o pode ser negativo.");
		}
		// Valida��o de neg�cio: N�o pode haver duas contas com o mesmo nome de correntista (simulando um ID �nico)
		if (repository.existsByNomeCorrentista(nomeCorrentista)) {
			throw new IllegalArgumentException("J� existe uma conta para o correntista: " + nomeCorrentista);
		}
		ContaBancaria novaConta = new ContaBancaria(nomeCorrentista, saldoInicial);
		return repository.save(novaConta);
	}

	/**
	 * Realiza um saque de uma conta banc�ria.
	 *
	 * @param nomeCorrentista Nome do correntista da conta.
	 * @param valorSaque Valor a ser sacado.
	 * @return A conta banc�ria atualizada ap�s o saque.
	 * @throws IllegalArgumentException Se o valor do saque for inv�lido, a conta n�o existir ou o saldo for insuficiente.
	 */
	public ContaBancaria sacar(String nomeCorrentista, double valorSaque) {
		// Valida��o de neg�cio: Valor do saque deve ser positivo
		if (valorSaque <= 0) {
			throw new IllegalArgumentException("Valor do saque deve ser positivo.");
		}

		Optional<ContaBancaria> contaOpt = repository.findByNomeCorrentista(nomeCorrentista);
		if (contaOpt.isEmpty()) {
			throw new IllegalArgumentException("Conta n�o encontrada para o correntista: " + nomeCorrentista);
		}

		ContaBancaria conta = contaOpt.get();
		// Valida��o de neg�cio: Saldo insuficiente para o saque
		if (conta.getSaldo() < valorSaque) {
			throw new IllegalArgumentException("Saldo insuficiente para realizar o saque de R$ " + String.format("%.2f", valorSaque) + ". Saldo atual: R$ " + String.format("%.2f", conta.getSaldo()));
		}

		double novoSaldo = conta.getSaldo() - valorSaque;
		return repository.updateSaldo(nomeCorrentista, novoSaldo);
	}

	/**
	 * Realiza um dep�sito em uma conta banc�ria.
	 *
	 * @param nomeCorrentista Nome do correntista da conta.
	 * @param valorDeposito Valor a ser depositado.
	 * @return A conta bancaria atualizada ap�s o dep�sito.
	 * @throws IllegalArgumentException Se o valor do dep�sito for inv�lido ou a conta n�o existir.
	 */
	public ContaBancaria depositar(String nomeCorrentista, double valorDeposito) {
		// Valida��o de neg�cio: Valor do dep�sito deve ser positivo
		if (valorDeposito <= 0) {
			throw new IllegalArgumentException("Valor do dep�sito deve ser positivo.");
		}

		Optional<ContaBancaria> contaOpt = repository.findByNomeCorrentista(nomeCorrentista);
		if (contaOpt.isEmpty()) {
			throw new IllegalArgumentException("Conta n�o encontrada para o correntista: " + nomeCorrentista);
		}

		ContaBancaria conta = contaOpt.get();
		double novoSaldo = conta.getSaldo() + valorDeposito;
		return repository.updateSaldo(nomeCorrentista, novoSaldo);
	}

	/**
	 * Busca uma conta banc�ria pelo nome do correntista.
	 *
	 * @param nomeCorrentista O nome do correntista.
	 * @return Um Optional contendo a ContaBancaria se encontrada, ou um Optional vazio.
	 */
	public Optional<ContaBancaria> buscarConta(String nomeCorrentista) {
		return repository.findByNomeCorrentista(nomeCorrentista);
	}
}
