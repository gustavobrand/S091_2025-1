package aula05.Televisao;

public class Main2 {

	public static void main(String[] args) {
		Televisao tv1 = new Televisao("samsung",42);
		Cadastrar c = new Cadastrar();
		c.adiciona(tv1);
		
		System.out.println(c.buscaTelevisao("cce"));
		

	}

}
