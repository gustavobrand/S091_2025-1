package aula17.ThreadHelloWorld;

public class MainThread {

	public static void main(String[] args) {
		MinhaThread threadExemplo = new MinhaThread("P1 simples");
		threadExemplo.start();
		MinhaThread threadExemplo2 = new MinhaThread("P2 simples");
		threadExemplo2.start();
		MinhaThread threadExemplo3 = new MinhaThread("P3 simples");
		threadExemplo3.start();
		
		MinhaThread2 threadExemplo4 = new MinhaThread2("P4 com loop");
		threadExemplo4.start();

		MinhaThread3 threadExemplo5 = new MinhaThread3("P5 com sleep");
		threadExemplo5.start();

	}
}
