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
	
	public boolean removerProduto(Produto produto, int quantidade){
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			if(linhas.getProduto() == produto){
				linhas.setQuantidade(linhas.getQuantidade()-quantidade);
				return true;
			}
		}
		return false;
		
	}
	
	public void atualizarProduto(Produto prodAntigo, Produto prodNovo){
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			if(linhas.getProduto() == prodAntigo){
				linhas.setProduto(prodNovo);
			}
		}
	}
	
	public Produto procurarPorNome(String nomeproduto){
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			if(linhas.getNome().equals(nomeproduto)){
				return linhas;
			}
		}
		return null;
	}


	
	

}
