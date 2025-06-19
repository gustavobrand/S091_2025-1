package aula16.CamadasCalculadora;

import java.util.ArrayList;

public class CalculadoraRepositorio {
	ArrayList<OperacaoModelo> listaSoma = new ArrayList<>();
	ArrayList<OperacaoModelo> listaSubtrair = new ArrayList<>();

	public void salvarSoma(OperacaoModelo modelo) {
		listaSoma.add(modelo);
	}

	public void salvarSubtracao(OperacaoModelo modelo) {
		listaSubtrair.add(modelo);
	}
}
