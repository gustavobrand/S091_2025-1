package aula12.DecoratorEncriptacao;

public class Teste {

	public static void main(String[] args) {
        String stringDeTeste; 
        stringDeTeste = "Nome,Salario\nJohn Smith,10000\nSteven Jobs,1000000";
        DataSourceDecorator codificado = new CompressionDecorator(
                                      new EncryptionDecorator(
                                      new FileDataSource("OutputDemo.txt")));
        
        codificado.EscreverDados(stringDeTeste);
        DataSource textoPuro = new FileDataSource("OutputDemo.txt");

        System.out.println("- Entrada original ------------------");
        System.out.println(stringDeTeste);
        
        System.out.println("- Entrada codificada ----------------");
        System.out.println(textoPuro.LerDados());
        
        System.out.println("- Entrada decodificada --------------");
        System.out.println(codificado.LerDados());
	}

}
