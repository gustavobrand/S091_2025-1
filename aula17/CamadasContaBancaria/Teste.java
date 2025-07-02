package aula17.CamadasContaBancaria;

public class Teste {
    public static void main(String[] args) {
        // 1. Instanciar a camada de Dados (Repository)
        ContaBancariaRepository repository = new ContaBancariaRepository();

        // 2. Instanciar a camada de Negócio (Service), passando o Repository
        ContaBancariaService service = new ContaBancariaService(repository);

        // 3. Instanciar a camada de Apresentação (View), passando o Service
        ContaBancariaView view = new ContaBancariaView(service);

        // 4. Iniciar a interface gráfica
        view.exibirMenuPrincipal();
    }
}
