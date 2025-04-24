package aula08.PassagemOnibus;

public class AWSPersistencia implements PersistaPassagem {

	@Override
	public void persistir(Passagem passagem) {
		System.out.println("Persistindo informação na nuvem...");
	}
}
