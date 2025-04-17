package aula07.Telefones;

public class Teste {

	public static void main(String[] args) {
		
		Nokia6120  nokia6120 = new Nokia6120();
		Nokia6120i nokia6120i = new Nokia6120i();
		Smartphone smartphone = new Smartphone();
		
		Ligacoes  TelefoneBasico;
		Mensagens TelefoneComSMS;
		Internet  TelefoneComInternet;
				
		TelefoneBasico = nokia6120;
		TelefoneBasico.ligar();
		TelefoneBasico = nokia6120i;
		TelefoneBasico.ligar();
		TelefoneBasico = smartphone;
		TelefoneBasico.ligar();
		
		TelefoneComSMS = nokia6120i;
		TelefoneComSMS.enviarMsg("Teste do Nokia 6120i");
		TelefoneComSMS = smartphone;
		TelefoneComSMS.enviarMsg("Teste do Smartphone");

		TelefoneComInternet = smartphone;
		TelefoneComInternet.conectarInternet();		
	}

}
