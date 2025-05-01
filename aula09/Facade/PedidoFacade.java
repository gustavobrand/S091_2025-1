package aula09.Facade;

public class PedidoFacade implements PedidoFacadeAbstract {
	private ModuloEstoque moduloEstoque;
	private ModuloFinanceiro moduloFinanceiro;
	private ModuloPosVenda moduloPosVenda;
    
	public PedidoFacade() {
		moduloEstoque = new ModuloEstoque();
		moduloFinanceiro = new ModuloFinanceiro();
		moduloPosVenda = new ModuloPosVenda();
	}

	@Override
	public void realizarPedido(Pedido pedido) {
		moduloEstoque.enviarPedido(pedido);
		moduloFinanceiro.faturar(pedido);
		moduloPosVenda.agendarContatoCliente(pedido);
	}
}
