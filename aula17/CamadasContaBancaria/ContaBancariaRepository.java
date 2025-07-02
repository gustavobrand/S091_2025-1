package aula17.CamadasContaBancaria;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional; // Para lidar com a aus�ncia de um valor

/**
 * Camada de Dados (Repository) para manipular informa��es de Conta Banc�ria.
 * Simula um banco de dados em mem�ria usando um HashMap.
 * Fornece fun��es b�sicas de acesso �s entidades (CRUD).
 */
public class ContaBancariaRepository {

	// Simula um banco de dados em mem�ria onde a chave � o nome do correntista
	// e o valor � o objeto ContaBancaria.
	private Map<String, ContaBancaria> contas;

	public ContaBancariaRepository() {
		contas = new HashMap<>();
	}

	/**
	 * Salva uma nova conta banc�ria ou atualiza uma existente.
	 *
	 * @param conta A conta banc�ria a ser salva/atualizada.
	 * @return A conta banc�ria salva.
	 */
	public ContaBancaria save(ContaBancaria conta) {
		// Valida��o b�sica na camada de dados: garantir que o nome do correntista n�o � nulo/vazio
		if (conta.getNomeCorrentista() == null || 
			conta.getNomeCorrentista().trim().isEmpty()) {
			throw new IllegalArgumentException("Nome do correntista n�o pode ser vazio.");
		}
		contas.put(conta.getNomeCorrentista(), conta);
		return conta;
	}

	/**
	 * Busca uma conta banc�ria pelo nome do correntista.
	 *
	 * @param nomeCorrentista O nome do correntista.
	 * @return Um Optional contendo a ContaBancaria se encontrada, ou um Optional vazio.
	 */
	public Optional<ContaBancaria> findByNomeCorrentista(String nomeCorrentista) {
		// Retorna um Optional para indicar que a conta pode ou n�o existir
		return Optional.ofNullable(contas.get(nomeCorrentista));
	}

	/**
	 * Atualiza o saldo de uma conta existente.
	 * Esta fun��o � privada, pois a atualiza��o de saldo deve ser orquestrada pela camada de neg�cio.
	 *
	 * @param nomeCorrentista O nome do correntista da conta a ser atualizada.
	 * @param novoSaldo O novo saldo da conta.
	 * @return A conta banc�ria atualizada.
	 * @throws IllegalArgumentException Se a conta n�o for encontrada.
	 */
	public ContaBancaria updateSaldo(String nomeCorrentista, double novoSaldo) {
		ContaBancaria conta = contas.get(nomeCorrentista);
		if (conta == null) {
			throw new IllegalArgumentException("Conta n�o encontrada para o correntista: " + nomeCorrentista);
		}
		conta.setSaldo(novoSaldo);
		return conta;
	}

	/**
	 * Verifica se uma conta existe pelo nome do correntista.
	 *
	 * @param nomeCorrentista O nome do correntista.
	 * @return true se a conta existe, false caso contr�rio.
	 */
	public boolean existsByNomeCorrentista(String nomeCorrentista) {
		return contas.containsKey(nomeCorrentista);
	}
}


