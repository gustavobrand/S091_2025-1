package aula11.NotaFiscal;

public class ItemNotaFiscal implements ComponenteNotaFiscal {
	private String nome;
    private String valor;

    public ItemNotaFiscal(String nome, String valor) {
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public void mostrar() {
		System.out.println(nome + ": " + valor);
	}

}
