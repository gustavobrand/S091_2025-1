package aula05.FuncionarioServico;

public class FuncionarioServico {
	private Funcionario funcionario;
	
	public FuncionarioServico(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void editarFuncionario() {
		try {
			validarFuncionario();
			System.out.println("Validacao realizada com sucesso");
			processarEdicaoFuncionario();
			System.out.println("Processo de Edicao foi realizado com sucesso");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	private void validarFuncionario() throws Exception {
		if (idEhInvalido()) {
			throw new Exception("Funcionario deve ter um ID");
		}
	}
	
	public boolean idEhInvalido () {
		if (funcionario.getId() <= 0) {
			return true;
		}
		return false;
	}

	public void processarEdicaoFuncionario() throws Exception {
		// Simulacao do processamento da edicao do funcionario.
		boolean sucessoEdicao = true;
		
		if (sucessoEdicao == false) {
			throw new Exception("Processamento da edicao do funcionario falhou");			
		}
	}
}