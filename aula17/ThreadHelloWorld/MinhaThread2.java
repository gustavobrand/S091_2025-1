package aula17.ThreadHelloWorld;

public class MinhaThread2 extends Thread {
	public MinhaThread2(String nome) {
		setName(nome);
	}
	
	public void run() {
		for (int i=0; i<2; i++) {
			System.out.println("Hello World da thread " + this.getName());
		}
	}
}
