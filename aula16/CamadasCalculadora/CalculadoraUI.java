package aula16.CamadasCalculadora;

import javax.swing.JOptionPane;

public class CalculadoraUI {
	CalculadoraServico servico = new CalculadoraServico();

	public static void main(String[] args) throws Exception {
		new CalculadoraUI().iniciar();
	}

	public void iniciar() throws Exception {
		while(true) {
			String op =JOptionPane.
//					showInputDialog("Digite a operaçao [+,-]");
					showInputDialog(menuPrincipal());

			String v1 =JOptionPane.
					showInputDialog("Digite o valor 1");
			String v2 =JOptionPane.
					showInputDialog("Digite o valor 2");

			OperacaoModelo operacao = new OperacaoModelo();
			operacao.valor1 = Double.parseDouble(v1);
			operacao.valor2 = Double.parseDouble(v2);
			operacao.operacao = op;
			double resultado = servico.executarOperacao(operacao);

			JOptionPane.showMessageDialog(null, resultado);
		}
	}
	
	// Exemplo de uso para menu com StringBuilder
	public static String menuPrincipal() {
		StringBuilder m = new StringBuilder();
		m.append("selecione uma opcao\n");
		m.append("1. cadastro pessoa fisica\n");
		m.append("2. cadastro pessoa juridica\n");
		m.append("3. mostra salario pessoa fisica\n");
		m.append("4. remover uma opcao\n");
		m.append("5. sair\n");
		return m.toString();
	}
}
