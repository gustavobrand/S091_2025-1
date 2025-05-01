package aula09.Facade;

public class Teste {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(100, 1000f);
		PedidoFacade pedidoFacade = new PedidoFacade();
		PedidoFacadeProxy pedidoFacadeProxy = new PedidoFacadeProxy();
		
		pedidoFacade.realizarPedido(pedido1);
		pedidoFacadeProxy.realizarPedido(pedido1);

	}

}
