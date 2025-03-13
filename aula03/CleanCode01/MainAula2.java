package aula03.CleanCode01;;
// alterar pacote se necessario





public class MainAula2 {

	public static void main(String[] args) {
		CalculadoraPag c = new CalculadoraPag("maria",
                        30, "26/06/1990", 500);
                float ret = c.retornaCalculoFuncionario();
                System.out.println("salario: " + ret);
	}

}
