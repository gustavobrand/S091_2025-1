package aula06.BancoDeDadosPessoa;

public class Teste {

	public static void main(String[] args) {
		BancoDadosPessoa bancoDeDados = new BancoDadosPessoa();
		Pessoa joao = new Pessoa("Joao", "2342346457");
		Pessoa maria = new Pessoa("Maria", "4356568789");
		bancoDeDados.salvarPessoa(joao);
		bancoDeDados.salvarPessoa(maria);
		
		Pessoa pessoa1 = bancoDeDados.buscarPessoaPorNome("joao");
		Pessoa pessoa2 = bancoDeDados.buscarPessoaPorCpf("4356568789");
		Pessoa pessoa3 = bancoDeDados.buscarPessoaPorNome("miguel");
		Pessoa joaoTeste = new Pessoa("Joao", "2342346457");
		Pessoa pessoa4 = bancoDeDados.buscarPessoa(joaoTeste);
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		System.out.println(pessoa4);
		
		System.out.println(bancoDeDados);
		bancoDeDados.removerPessoa(pessoa4);
		System.out.println(bancoDeDados);
	}

}
