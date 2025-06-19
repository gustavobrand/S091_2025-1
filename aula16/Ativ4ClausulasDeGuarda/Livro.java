package aula16.Ativ4ClausulasDeGuarda;

class Livro {
    private String titulo;
    private boolean disponivel;
    
	public Livro(String titulo) {
		this.titulo = titulo;
		this.disponivel = true;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", disponivel=" + disponivel + "]";
	}
    
}
