package aula08.Singleton;

public class ConfiguracaoDeSistema {
	private String nome;
    private String caminhoDeImagens;    
    private static ConfiguracaoDeSistema instancia;
    
	private ConfiguracaoDeSistema() {
		System.out.println("Criando um objeto de "
				+ this.getClass().getSimpleName()); 
	}
	
	public static ConfiguracaoDeSistema getInstancia() {
	    if(instancia == null) {
	    	System.out.println("Criando o objeto pela 1a vez");
	        instancia = new ConfiguracaoDeSistema();
	    }
	    return instancia;
	}
	
	public static ConfiguracaoDeSistema getInstancia(String nome, String imagens) {
	    if(instancia == null) {
	    	System.out.println("Criando o objeto pela 1a vez");
	        instancia = new ConfiguracaoDeSistema();
	    }
	    instancia.setCaminhoDeImagens(imagens);
	    instancia.setNome(nome);
	    return instancia;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCaminhoDeImagens() {
		return caminhoDeImagens;
	}
	public void setCaminhoDeImagens(String caminhoDeImagens) {
		this.caminhoDeImagens = caminhoDeImagens;
	}

}
