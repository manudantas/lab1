package atividade;

import java.util.ArrayList;

public class main {

	public static void main(String[] args){
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		Pedido pedido1 = new Pedido();
		EstoqueDAO estoque = new EstoqueDAO();
		LinhaPedido linhapedido = new LinhaPedido(produto1,4);
		LinhaPedido linhapedido2 = new LinhaPedido(produto2,6);
		ArrayList< LinhaPedido > linhasPedido = new ArrayList<LinhaPedido>();
		
		produto1.nome = "Resma de Papel";
		produto1.preco = 15.00;
		
		produto2.nome = "Pincel";
		produto2.preco = 3.50;
		
		produto3.nome = "Apagador";
		produto3.preco = 3.00;
		
		pedido1.adicionarLinha(linhapedido, linhasPedido);
		pedido1.adicionarLinha(linhapedido2, linhasPedido);
		//Adicionar 2 linhas de pedido ao vetor de linhas.
		pedido1.mostrarTodasLinhas(linhasPedido);
		System.out.println("--------------------------------------------------");
		
		System.out.println(estoque.possuiProduto(produto1, linhasPedido));
		//deverá retornar true.
		estoque.inserirProduto(produto1, 2, linhasPedido);
		//Adicionamos mais uma resma de papel a linha do produto, mas primeiro vamos ver se a resma de papel esta no pedido.
		estoque.removerProduto(produto2, 2, linhasPedido);
		//Removemos dois Pinceis da linha, antes tinhamos 6 e agora temos 4.
		pedido1.mostrarTodasLinhas(linhasPedido);
		
		System.out.println("--------------------------------------------------");
		estoque.atualizarProduto(produto1, produto3, linhasPedido);
		//iremos agora atualizar o produto, trocando o produto 1 que é a resma pelo produto 2 que é o apagador. 
		pedido1.mostrarTodasLinhas(linhasPedido);
		System.out.println("--------------------------------------------------");
		//por fim vamos mostrar as linhas do pedido e o total a pagar.
		pedido1.mostrarTodasLinhas(linhasPedido);
		System.out.println("Total: " + pedido1.totalFinal(linhasPedido));
		//a sequencia é: nome do produto, quantidade, preço e total.
		
		
		
		
	}

}
