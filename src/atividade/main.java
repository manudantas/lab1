package atividade;

import java.util.ArrayList;

public class main {
	//nha
	public static void main(String[] args){
		
		Produto produto1 = new Produto();
//		Produto produto2 = new Produto();
//		Produto produto3 = new Produto();
//		Produto produto4 = new Produto();
		Pedido pedido1 = new Pedido();
		EstoqueDAO estoque = new EstoqueDAO();
		LinhaPedido linhapedido = new LinhaPedido(produto1,4);
		
		produto1.nome = "Resma de Papel";
		produto1.preco = 15.00;
		
//		produto2.nome = "Pincel";
//		produto2.preco = 3.50;
//		
//		produto3.nome = "Apagador";
//		produto3.preco = 3.00;
//		
//		produto4.nome = "Cartucho de impressão";
//		produto4.preco = 58.00;
//		
		//pedido1.adicionarLinha(linhapedido);
		System.out.println(pedido1.adicionarLinha(linhapedido));
		ArrayList< LinhaPedido > linhasPedido = new ArrayList<LinhaPedido>();
		linhasPedido.add(linhapedido);
		System.out.println(estoque.inserirProduto(produto1,2, linhasPedido));
		//pedido1.removerLinha(produto1);
		
		
		
	}

}
