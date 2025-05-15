package aula11.NotaFiscal;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		NotaFiscal nf1 = new NotaFiscal();
		nf1.AdicionarLinha(new ItemNotaFiscal("Nro nota", "001"));
		nf1.AdicionarLinha(new ItemNotaFiscal("Total", "R$ 1590"));
		nf1.AdicionarLinha(new ItemNotaFiscal("Obs.", "1o teste"));
		nf1.mostrar();
		
		NotaFiscal nf2 = new NotaFiscal();
		nf2.AdicionarLinha(new ItemNotaFiscal("Nro nota", "002"));
		ArrayList<String> itens = new ArrayList<String>();
		itens.add("Item 1");
		itens.add("Item 2");
		itens.add("Item 3");		
		nf2.AdicionarLinha(new ItensNotaFiscal(itens, "teste 2"));
		nf2.mostrar();
	}

}
