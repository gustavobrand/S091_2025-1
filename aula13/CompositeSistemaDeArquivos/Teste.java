package aula13.CompositeSistemaDeArquivos;

public class Teste {

	public static void main(String[] args) {
		Diretorio raiz = new Diretorio("C:");

        Diretorio pastaDocumentos = new Diretorio("Documentos");
        pastaDocumentos.adicionar(new Arquivo("carta.doc", 10240));
        pastaDocumentos.adicionar(new Arquivo("relatorio.pdf", 51200));

        Diretorio pastaImagens = new Diretorio("Imagens");
        pastaImagens.adicionar(new Arquivo("foto_ferias.jpg", 204800));
        pastaImagens.adicionar(new Arquivo("logo.png", 5000));
        pastaDocumentos.adicionar(pastaImagens); // Diret�rio dentro de outro diret�rio

        raiz.adicionar(pastaDocumentos);
        raiz.adicionar(new Arquivo("boot.ini", 256));
        raiz.adicionar(new Arquivo("readme.txt", 100));

        System.out.println("--- Listando Conte�do do Sistema de Arquivos ---");
        raiz.listar(""); // Come�a com indenta��o vazia
//        pastaDocumentos.listar("");
//        pastaImagens.listar("");
//        Arquivo exemplo = new Arquivo("logo.png", 5000);
//        exemplo.listar("");
        
        System.out.println("Tamanho total de 'C:': " + 
        		raiz.obterTamanhoBytes() + " bytes");
	}

}
