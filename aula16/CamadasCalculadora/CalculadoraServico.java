package aula16.CamadasCalculadora;

public class CalculadoraServico {
	CalculadoraRepositorio repositorio = new CalculadoraRepositorio();
	
	public double executarOperacao (OperacaoModelo operacaoModelo) 
			throws Exception {
		
		if(ehUmaOperacaoInvalida(operacaoModelo)) {
		    throw new Exception("Operacao inválida");
		}
		
		double resultado;
		if (operacaoModelo.operacao.equals("+")) {
		    resultado = operacaoModelo.valor1 + operacaoModelo.valor2;
		    repositorio.salvarSoma(operacaoModelo);
		    return resultado;
		}
		// Se nao for soma, sera uma subtracao
	    resultado = operacaoModelo.valor1 - operacaoModelo.valor2;
	    repositorio.salvarSubtracao(operacaoModelo);
	    return resultado;
	}
	
	private boolean ehUmaOperacaoInvalida(OperacaoModelo operacaoModelo) {
		return !(operacaoModelo.operacao.equals("+") ||
				operacaoModelo.operacao.equals("-"));
	}
}
