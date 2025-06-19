package aula16.Ativ4ClausulasDeGuardaV2;

public class Teste {

	public static void main(String[] args) {
		// Criar clientes e livros
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");
        Livro livro1 = new Livro("Dom Quixote");
        Livro livro2 = new Livro("1984");
        Livro livro3 = new Livro("Orgulho e Preconceito");
        Livro livro4 = new Livro("O Senhor dos Anéis");

        // Criar biblioteca e cadastrar clientes e livros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarCliente(cliente1);
        biblioteca.cadastrarCliente(cliente2);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);

        // Realizar empréstimos
        try {
            System.out.println(biblioteca.emprestarLivro(cliente1, livro1)); // Sucesso
            System.out.println(biblioteca.emprestarLivro(cliente1, livro2)); // Sucesso
            System.out.println(biblioteca.emprestarLivro(cliente1, livro3)); // Sucesso
//            System.out.println(biblioteca.emprestarLivro(cliente1, livro4)); // Erro: Cliente com muitos livros
            System.out.println(biblioteca.emprestarLivro(cliente2, livro4)); // Sucesso
//            System.out.println(biblioteca.emprestarLivro(cliente2, livro4)); // Erro: Livro indisponível
            
        } catch (RuntimeException e) {
            System.out.println("Erro na execução: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro generico: " + e.getMessage());
        } 

        // Tentar emprestar livro nulo ou cliente nulo
        try {
            biblioteca.emprestarLivro(null, livro1); // Erro: Cliente nulo
        } catch (IllegalArgumentException e) {
            System.out.println("Erro bem especifico: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro menos especifico: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro generico: " + e.getMessage());
        }            
        
        try {
            biblioteca.emprestarLivro(cliente2, null); // Erro: Livro nulo
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
        	System.out.println("Erro generico: " + e.getMessage());
		}
	}
}
