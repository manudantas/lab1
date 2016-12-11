package atividade;

import java.util.ArrayList;

public class EstoqueDAO extends Pedido{
	
	public void inserirProduto(Produto produto, int quantidade, ArrayList< LinhaPedido > linhasPedido){
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			if(linhas.getProduto() == produto){
				linhas.setQuantidade(linhas.getQuantidade()+ quantidade);
			}
		}
	}
	
	
	public boolean removerProduto(Produto produto, int quantidade, ArrayList< LinhaPedido > linhasPedido){
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			if(linhas.getProduto() == produto){
				linhas.setQuantidade(linhas.getQuantidade()-quantidade);
				return true;
			}
		}
		return false;
		
	}
	
	public void atualizarProduto(Produto prodAntigo, Produto prodNovo, ArrayList< LinhaPedido > linhasPedido){
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			if(linhas.getProduto() == prodAntigo){
				linhas.setProduto(prodNovo);
			}
		}
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
			if(linhas.getNome().equals(nomeproduto)){
				return linhas.getNome();
			}
		}
		return null;
	}


	
	

}
