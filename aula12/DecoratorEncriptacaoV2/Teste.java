package aula12.DecoratorEncriptacaoV2;

public class Teste {

	public static void main(String[] args) {
        String stringDeTeste; 
        stringDeTeste = "Nome,Salario\nJohn Smith,10000\nSteven Jobs,1000000";

//        DataSource codificado = new CompressionDecorator(
//                                      new EncryptionDecorator(
//                                      new FileDataSource("OutputDemo.txt")));
        FileDataSource f1 = new FileDataSource("OutputDemo.txt");
        EncryptionDecorator f2 = new EncryptionDecorator(f1);
        DataSource codificado = new CompressionDecorator(f2);

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
