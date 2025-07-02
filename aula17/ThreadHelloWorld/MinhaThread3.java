package aula17.ThreadHelloWorld;

public class MinhaThread3 extends Thread {
	public MinhaThread3(String nome) {
		setName(nome);
	}
	
	public void run() {
		for (int i=0; i<2; i++) {
			System.out.println("Hello World da thread " + this.getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
