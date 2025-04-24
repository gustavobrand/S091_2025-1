package aula08.PassagemOnibus;

public class Teste {

	public static void main(String[] args) {
		AWSPersistencia gravacaoNaNuvem = new AWSPersistencia();
		BancoDeDadosPersistencia gravacaoNoBD = new BancoDeDadosPersistencia();
		DiscoLocalPersistencia gravacaoNoDisco = new DiscoLocalPersistencia();

		Passagem passagem1 = new Passagem(50f, "Rio de Janeiro");
		Passagem passagem2 = new Passagem(60f, "Sao Paulo");
		
		PassagemServico servicoDePassagens = new PassagemServico(gravacaoNaNuvem);
		servicoDePassagens.persitirPassagem(passagem1);
		
		servicoDePassagens.setPersistaPassagem(gravacaoNoBD);
		servicoDePassagens.persitirPassagem(passagem1);
		
		servicoDePassagens.setPersistaPassagem(gravacaoNoDisco);
		servicoDePassagens.persitirPassagem(passagem1);
		
		
	}

}
