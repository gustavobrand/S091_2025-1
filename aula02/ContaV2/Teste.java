package aula02.ContaV2;

public class Teste {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(0, "Joao", 1000, 10);
		ContaPoupanca cp = new ContaPoupanca(0, "Maria", 1);
		cc.depositar(100);
		System.out.println(cc);
		cc.sacar(50);
		System.out.println(cc);
		
		cp.depositar(500);
		System.out.println(cp);
		cp.sacar(100);
		System.out.println(cp);
	}

}
