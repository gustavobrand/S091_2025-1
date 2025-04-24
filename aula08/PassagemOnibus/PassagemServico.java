package aula08.PassagemOnibus;

public class PassagemServico {
    private PersistaPassagem persistaPassagem;

	public PassagemServico(PersistaPassagem persistaPassagem) {
		this.persistaPassagem = persistaPassagem;
	}
	public void setPersistaPassagem(PersistaPassagem persistaPassagem) {
		this.persistaPassagem = persistaPassagem;
	}
	
	// Parte fundamental da solucao para mudar
	// o comportamento de como iremos persistir a informação
	public void persitirPassagem(Passagem passagem) {
		this.persistaPassagem.persistir(passagem);
	}
}
    
