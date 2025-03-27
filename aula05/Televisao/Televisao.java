package aula05.Televisao;

public class Televisao {
	
	
	public Televisao(String n, int t) {		
		if(valida(n, t) < 0) {
			throw new IllegalArgumentException("error");
		}
		no = n;
		tamanho = t;
	}
	
	
	
	
	
	
	// valida os dados da televisao
	private int valida(String n, int t) {		
		if(n.equals("") || (t < 0 || t > 100)) {
			return -1; // error
		}else {
			return 1; // ok
		}
	}
	
	
	String no; // nome da tv
	int tamanho; // tamanho
	
}
