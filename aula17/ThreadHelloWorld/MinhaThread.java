package aula17.ThreadHelloWorld;

public class MinhaThread extends Thread {
	public MinhaThread(String nome) {
		setName(nome);
	}
	
	public void run() {
		System.out.println("Hello World da thread " + this.getName());
	}
}
