package aula01.pessoaEndereco;

public class PessoaTeste {

	public static void main(String[] args) {
		// Forma recomendada com construtores, obtendo
		// objetos consistentes em que podemos executar os
		// seus métodos sem problemas.
		Endereco endereco = new Endereco("Rua ABC", 100);
		Pessoa Joao = new Pessoa("Joao da Silva", endereco);
//		System.out.println(Joao);
		
		// System.out.println(Joao.end.getRua());
//		System.out.println(Joao.getEnd().getRua());
		
		// Passo a passo para demonstrar o porque a execucao 
		// de Maria.getEnd().setRua(...) estava quebrando
		// ao nao ter um objeto de Endereco criado.
		Pessoa Maria = new Pessoa();
		System.out.println(Maria);
		Maria.setNome("Maria da Silva");
		System.out.println(Maria);
//		Endereco e = new Endereco("Rua Abc", 100);
		Endereco e = new Endereco();
		// Nesse momento nós garantimos que existe um objeto 
		// da classe endereco disponivel para uso
		Maria.setEnd(e);
		System.out.println(Maria);
		Maria.getEnd().setRua("Rua Abc");
		Maria.getEnd().setNumero(100);
		System.out.println(Maria);
		
		
	}
}
