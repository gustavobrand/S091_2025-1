package aula07.Telefones;

public class Nokia6120i implements Ligacoes, Mensagens {

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

}
