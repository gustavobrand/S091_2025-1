package aula08.PassagemOnibus;

public class DiscoLocalPersistencia implements PersistaPassagem {

	@Override
	public void persistir(Passagem passagem) {
		System.out.println("Persistindo informa��o no disco local...");
	}

}
