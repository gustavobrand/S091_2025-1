package aula13.CompositeSistemaDeArquivos;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements ComponenteSistemaArquivos {
	private String nome;
    private List<ComponenteSistemaArquivos> conteudos;    
    
	public Diretorio(String nome) {
		this.nome = nome;
		this.conteudos = new ArrayList<>();
	}
	
	public void adicionar(ComponenteSistemaArquivos componente) {
        conteudos.add(componente);
    }
    public void remover(ComponenteSistemaArquivos componente) {
        conteudos.remove(componente);
    }

	@Override
	public void listar(String indentacao) {
		System.out.println(indentacao + "+ Diretório: " + nome + "/");
        for (ComponenteSistemaArquivos componente : conteudos) {
            componente.listar(indentacao + "  ");
        }
	}

	@Override
	public long obterTamanhoBytes() {
        long tamanhoTotal = 0;
        for (ComponenteSistemaArquivos componente : conteudos) {
            tamanhoTotal += componente.obterTamanhoBytes();
        }
        return tamanhoTotal;
	}
}
