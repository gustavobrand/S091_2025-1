package aula08.PassagemOnibus;

public class BancoDeDadosPersistencia implements PersistaPassagem {

	@Override
	public void persistir(Passagem passagem) {
		System.out.println("Persistindo informa��o no Banco de dados...");
	}

}
