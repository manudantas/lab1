package atividadetests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import atividade.LinhaPedido;
import atividade.Pedido;
import atividade.Produto;
import junit.framework.Assert;

public class Pedidotest {

	@Test
	public void adicionarLinhatest() {
		Pedido p = new Pedido();
		Produto produto = new Produto();
		LinhaPedido linha = new LinhaPedido(produto, 4);
		ArrayList<LinhaPedido> linhas = new ArrayList<LinhaPedido>();
		Assert.assertTrue(p.adicionarLinha(linha, linhas));

	}
	
	@Test
	public void removerLinhatest(){
		Pedido p = new Pedido();
		Produto produto = new Produto();
		Produto produto2 = new Produto();
		LinhaPedido linha = new LinhaPedido(produto, 4);
		ArrayList<LinhaPedido> linhas = new ArrayList<LinhaPedido>();
		
		p.adicionarLinha(linha, linhas);
		Assert.assertTrue(p.removerLinha(produto, linhas));
		Assert.assertFalse(p.removerLinha(produto2, linhas));
		
	}
	
	@Test
	public void totalFinaltest(){
		ArrayList<LinhaPedido> linhas = new ArrayList<LinhaPedido>();
		Pedido p = new Pedido();
		Produto produto = new Produto();
		produto.nome = "Resma";
		produto.preco = 12.0;
		LinhaPedido linha = new LinhaPedido(produto, 4);
		LinhaPedido linha2 = new LinhaPedido(produto,3);
		p.adicionarLinha(linha, linhas);
		p.adicionarLinha(linha2, linhas);
		Assert.assertEquals(84.0, p.totalFinal(linhas));
	}
	
	
	
	
}
