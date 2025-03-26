package aula03.CleanCode02;

public class CalculadoraPagamento {
    private float resultado = 0;
    private final float reajusteFaixaSalarial1 = 1.1f;
    private final float reajusteFaixaSalarial2 = 1.2f;
    private final float limiteDeFaixaSalarial = 1000f;
    
    public CalculadoraPagamento(String nome, int idade,
            String dataNascimento,float salario) {
    	
        Funcionario funcionario = new Funcionario(nome, idade, 
        		dataNascimento, salario);
		try {
			validarFuncionario(funcionario);
			resultado = calcularSalario(funcionario);
		} catch (Exception e) {
			System.out.println("Erro na validação");
			e.printStackTrace();
		}
    }
    
	private void validarFuncionario(Funcionario funcionario) throws Exception {
		if (funcionario.getNome().equals("")) {
			throw new Exception("Parametro de nome em branco");
		} 
		if (funcionario.getDataDeNascimento().equals("")) {
			throw new Exception("Parametro de data de nascimento em branco");
		} 
		if (funcionario.getIdade() <= 0) {
			throw new Exception("Parametro de idade invalido");
		}
		if (funcionario.getSalario() <= 0) {
			throw new Exception("Parametro de salario invalido");
		}
	}
	
    public float retornarCalculoFuncionario(){
        return resultado;
    }
    
    private float calcularSalario(Funcionario funcionario){
        float resultado = 0;
        
        if (ehSalarioAbaixoDaFaixaDeLimiteSalarial(funcionario)) {
            resultado = (funcionario.getSalario() * reajusteFaixaSalarial1);
        } else {
            resultado = (funcionario.getSalario() * reajusteFaixaSalarial2);
        }
        return resultado;
    }
    
    private boolean ehSalarioAbaixoDaFaixaDeLimiteSalarial(Funcionario funcionario) {
    	if (funcionario.getSalario() < limiteDeFaixaSalarial) {
    		return true;
    	}
    	return false;
    }
}
