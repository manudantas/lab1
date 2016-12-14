package atividadetests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import atividade.LinhaPedido;
import atividade.Produto;

public class LinhaPedidotest {

	@Test
	public void totalLinhatest() {
		Produto produto = new Produto();
		LinhaPedido linha = new LinhaPedido(produto, 3);
		produto.nome = "Resma";
		produto.preco = 2.5;
		Assert.assertEquals(7.5, linha.totalLinha(produto, linha), 0);
		
	}

}
