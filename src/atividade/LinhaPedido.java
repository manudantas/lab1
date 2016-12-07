package atividade;

public class LinhaPedido extends Produto{
	private Produto produto;
	private int quantidade;
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	LinhaPedido(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	double totalLinha(){
		double total = quantidade*preco;
		return total;
	}

	
	
	
	

}
