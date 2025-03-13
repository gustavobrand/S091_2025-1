package aula03.ExemploDeExcessao;

public class Teste {
	private int id;	
	public Teste(int id) {
		this.id = id;
	}
	public int buscaChave(String id) {
		if (id == null || id == "") {
			return -1;
		}
		return 0;
	}
	public int buscaChaveComExcessao(String id) throws Exception {
//		if (id == null || id == "") {
//			throw new Exception("Parametro invalido");
//		}
		if (id == null) {
			throw new Exception("Parametro invalido - id nulo");
		}
		if (id == "") {
			throw new Exception("Parametro invalido - id vazio");
		}
		return 0;
	}

	public static void main(String[] args) throws Exception {
		Teste verificacaoDeExcessao = new Teste(10);
		System.out.println("Executando programa");
//		int retorno = verificacaoDeExcessao.buscaChave("");
//		if (retorno < 0) {
//			System.out.println("Erro ao executar a busca pela chave");
//		}
		try {
			verificacaoDeExcessao.buscaChaveComExcessao("");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de array");
		} catch (Exception e) {
			System.out.println("Erro com excessao ao executar a busca pela chave");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
		
	}

}
