package atividade;

import java.util.ArrayList;

public class EstoqueDAO extends Pedido{
	
	public boolean inserirProduto(Produto produto, int quantidade, ArrayList< LinhaPedido > linhasPedido){
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			if(linhas.getProduto() == produto){
				linhas.setQuantidade(linhas.getQuantidade()+ quantidade);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean removerProduto(Produto produto, int quantidade, ArrayList< LinhaPedido > linhasPedido){
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			if(linhas.getProduto() == produto){
				if(linhas.getQuantidade() != 0){
					linhas.setQuantidade(linhas.getQuantidade()-quantidade);
					return true;
				}
			}
		}
		return false;
		
	}
	
	public boolean atualizarProduto(Produto prodAntigo, Produto prodNovo, ArrayList< LinhaPedido > linhasPedido){
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			if(linhas.getProduto() == prodAntigo){
				linhas.setProduto(prodNovo);
				return true;
			}
		}
		return false;
	}
	
	public boolean possuiProduto(Produto produto, ArrayList< LinhaPedido > linhasPedido){
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			if(linhas.getProduto() == produto){
				return true;
			}
		}
		return false;
	}
	
	public String procurarPorNome(String nomeproduto, ArrayList< LinhaPedido > linhasPedido){
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			String nome = linhas.getProduto().getNome();
			if(nome.equals(nomeproduto)){
				return nome;
			}
		}
		return " ";
	}


	
	

}
