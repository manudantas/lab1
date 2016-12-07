package atividade;

public class EstoqueDAO extends Pedido{
	
	public void inserirProduto(Produto produto, int quantidade){
		for (int i=0;i<Linhas.size();i++){
			LinhaPedido linhas = Linhas.get(i);
			if(linhas.getProduto() == produto){
				linhas.setQuantidade(linhas.getQuantidade()+ quantidade);
			}
		}
	}
	
	public boolean removerProduto(Produto produto, int quantidade){
		for (int i=0;i<Linhas.size();i++){
			LinhaPedido linhas = Linhas.get(i);
			if(linhas.getProduto() == produto){
				linhas.setQuantidade(linhas.getQuantidade()-quantidade);
				return true;
			}
		}
		return false;
		
	}
	
	public void atualizarProduto(Produto prodAntigo, Produto prodNovo){
		for (int i=0;i<Linhas.size();i++){
			LinhaPedido linhas = Linhas.get(i);
			if(linhas.getProduto() == prodAntigo){
				linhas.setProduto(prodNovo);
			}
		}
	}
	
	public Produto procurarPorNome(String nomeproduto){
		for (int i=0;i<Linhas.size();i++){
			LinhaPedido linhas = Linhas.get(i);
			if(linhas.getNome().equals(nomeproduto)){
				return linhas;
			}
		}
		return null;
	}


	
	

}
