package aula08.Singleton;

public class Teste {

	public static void main(String[] args) {
		ConfiguracaoDeSistema sys1 = ConfiguracaoDeSistema.getInstancia();
		System.out.println("Objeto 1: " + sys1);
		sys1.setNome("Sistema 1");
		sys1.setCaminhoDeImagens("/tmp/imgs");
		
		ConfiguracaoDeSistema sys2;
		sys2 = ConfiguracaoDeSistema.getInstancia("Sistema 2", "/tmp/newimgs");
		System.out.println("Objeto 2: " + sys2);
		
		if (sys1 == sys2) {
			System.out.println("Ambas referencias estao apontando para o mesmo objeto.");
		}
		

	}

}
