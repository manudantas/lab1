package atividadetests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;

import atividade.EstoqueDAO;
import atividade.LinhaPedido;
import atividade.Pedido;
import atividade.Produto;

public class EstoqueDAOtest {

	@Test
	public void inserirProdutotest() {
		Pedido p = new Pedido();
		EstoqueDAO estoque = new EstoqueDAO();
		Produto produto = new Produto();
		LinhaPedido linha = new LinhaPedido(produto, 4);
		ArrayList<LinhaPedido> linhas = new ArrayList<LinhaPedido>();
		p.adicionarLinha(linha, linhas);
		
		Assert.assertTrue(estoque.inserirProduto(produto, 1, linhas));
		//Assert.assertFalse(estoque.inserirProduto(produto, 1, linhas));		
	}
	
	@Test 
	public void removerProdutotest(){
		Pedido p = new Pedido();
		EstoqueDAO estoque = new EstoqueDAO();
		Produto produto = new Produto();
		LinhaPedido linha = new LinhaPedido(produto, 2);
		ArrayList<LinhaPedido> linhas = new ArrayList<LinhaPedido>();
		p.adicionarLinha(linha, linhas);
		
		Assert.assertTrue(estoque.removerProduto(produto, 2, linhas));
		//Assert.assertFalse(estoque.removerProduto(produto, 2, linhas));
	}
	
	@Test
	public void atualizarProduto(){
		Pedido p = new Pedido();
		EstoqueDAO estoque = new EstoqueDAO();
		Produto produto = new Produto();
		Produto produto2 = new Produto();
		LinhaPedido linha = new LinhaPedido(produto, 2);
		ArrayList<LinhaPedido> linhas = new ArrayList<LinhaPedido>();
		p.adicionarLinha(linha, linhas);
		
		//Assert.assertTrue(estoque.atualizarProduto(produto, produto2, linhas));	
	}
	
	@Test 
	public void possuiProdutotest(){
		Pedido p = new Pedido();
		EstoqueDAO estoque = new EstoqueDAO();
		Produto produto = new Produto();
		LinhaPedido linha = new LinhaPedido(produto, 2);
		ArrayList<LinhaPedido> linhas = new ArrayList<LinhaPedido>();
		
		//p.adicionarLinha(linha, linhas);
		//Assert.assertTrue(estoque.possuiProduto(produto, linhas));
		Assert.assertFalse(estoque.possuiProduto(produto, linhas));
		
	}
	
	@Test
	public void procurarPorNometest(){
		Pedido p = new Pedido();
		EstoqueDAO estoque = new EstoqueDAO();
		Produto produto = new Produto();
		produto.nome = "Resma";
		LinhaPedido linha = new LinhaPedido(produto, 2);
		ArrayList<LinhaPedido> linhas = new ArrayList<LinhaPedido>();
		p.adicionarLinha(linha, linhas);
		
		Assert.assertEquals("Resma", estoque.procurarPorNome("Resma", linhas));
		//Erro no metodo.
		
	}

}
