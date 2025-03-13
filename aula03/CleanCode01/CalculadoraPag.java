package aula03.CleanCode01;
// alterar pacote se necessario



public class CalculadoraPag {
    
    float resu = 0; // resultado final
    public CalculadoraPag(String nome, int idade,
            String dataNascimento,float salario){
        Funcionario ff = new Funcionario();
        ff.dt = dataNascimento;
        ff.idade = idade;
        ff.no = nome;
        ff.s = salario;    
		
		if(validaFuncionario(ff) == -1){
			System.out.println("errro na validação");
		}else{
			resu = calcula(ff);
		}
    }
    
	private int validaFuncionario(Funcionario f) {
		if(f.no.equals("") || f.idade ==0){
			return -1;
		}else{
			return 1;
		}
	}
	
    public float retornaCalculoFuncionario(){
        return resu;
    }
    // esse metodo calcula o salario do funcionario
    private float calcula(Funcionario f){
		
		
        float r = 0;
        if(f.s < 1000){
            r = (f.s * 0.1f) + f.s;
        }
        if(f.s > 1000){
            r = (f.s * 0.2f) + f.s;
        }
        
        return r;        
    }

	
    
}




       



