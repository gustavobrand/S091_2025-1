package aula07.Telefones;

public class Smartphone implements Internet, Ligacoes, Mensagens {

	@Override
	public void enviarMsg(String msg) {
		System.out.println("Mensagem enviada: " + msg);
	}

	@Override
	public void receberMsg(String msg) {
		System.out.println("Mensagem recebida: " + msg);
	}

	@Override
	public void ligar() {
		System.out.println("Realizando uma ligação");
	}

	@Override
	public void conectarInternet() {
		System.out.println("Conectando a internet ..............");
	}

}
