package atividade;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pedidotest {
//nha
	@Test
	public void adicionarLinhatest() {
		fail("Not yet implemented");
		Produto produto1 = new Produto();
		produto1.nome = "Resma de Papel";
		produto1.preco = 15.00;
		
		LinhaPedido linhapedido = new LinhaPedido(produto1,4);
		
		Pedido pedido1 = new Pedido();
		
		pedido1.adicionarLinha(linhapedido);
	}

}
