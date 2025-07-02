package aula17.CamadasContaBancaria;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional; // Para lidar com a ausência de um valor

/**
 * Camada de Dados (Repository) para manipular informações de Conta Bancária.
 * Simula um banco de dados em memória usando um HashMap.
 * Fornece funções básicas de acesso às entidades (CRUD).
 */
public class ContaBancariaRepository {

	// Simula um banco de dados em memória onde a chave é o nome do correntista
	// e o valor é o objeto ContaBancaria.
	private Map<String, ContaBancaria> contas;

	public ContaBancariaRepository() {
		contas = new HashMap<>();
	}

	/**
	 * Salva uma nova conta bancária ou atualiza uma existente.
	 *
	 * @param conta A conta bancária a ser salva/atualizada.
	 * @return A conta bancária salva.
	 */
	public ContaBancaria save(ContaBancaria conta) {
		// Validação básica na camada de dados: garantir que o nome do correntista não é nulo/vazio
		if (conta.getNomeCorrentista() == null || 
			conta.getNomeCorrentista().trim().isEmpty()) {
			throw new IllegalArgumentException("Nome do correntista não pode ser vazio.");
		}
		contas.put(conta.getNomeCorrentista(), conta);
		return conta;
	}

	/**
	 * Busca uma conta bancária pelo nome do correntista.
	 *
	 * @param nomeCorrentista O nome do correntista.
	 * @return Um Optional contendo a ContaBancaria se encontrada, ou um Optional vazio.
	 */
	public Optional<ContaBancaria> findByNomeCorrentista(String nomeCorrentista) {
		// Retorna um Optional para indicar que a conta pode ou não existir
		return Optional.ofNullable(contas.get(nomeCorrentista));
	}

	/**
	 * Atualiza o saldo de uma conta existente.
	 * Esta função é privada, pois a atualização de saldo deve ser orquestrada pela camada de negócio.
	 *
	 * @param nomeCorrentista O nome do correntista da conta a ser atualizada.
	 * @param novoSaldo O novo saldo da conta.
	 * @return A conta bancária atualizada.
	 * @throws IllegalArgumentException Se a conta não for encontrada.
	 */
	public ContaBancaria updateSaldo(String nomeCorrentista, double novoSaldo) {
		ContaBancaria conta = contas.get(nomeCorrentista);
		if (conta == null) {
			throw new IllegalArgumentException("Conta não encontrada para o correntista: " + nomeCorrentista);
		}
		conta.setSaldo(novoSaldo);
		return conta;
	}

	/**
	 * Verifica se uma conta existe pelo nome do correntista.
	 *
	 * @param nomeCorrentista O nome do correntista.
	 * @return true se a conta existe, false caso contrário.
	 */
	public boolean existsByNomeCorrentista(String nomeCorrentista) {
		return contas.containsKey(nomeCorrentista);
	}
}


