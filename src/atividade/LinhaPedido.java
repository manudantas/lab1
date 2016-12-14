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

	public LinhaPedido(Produto produto, int quantidade){
		if(quantidade > 0){
			this.produto = produto;
			this.quantidade = quantidade;
		}else{
			System.out.println("Nao é possivel criar uma linha sem produto !");
		}
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double totalLinha(Produto produto, LinhaPedido linha){
		double total = linha.quantidade*produto.preco;
		return total;
	}
	
	public String mostrarLinha(LinhaPedido linha){
		String a = linha.getProduto().getNome() +" "+ Integer.toString(linha.getQuantidade());
		String b = Double.toString(linha.getProduto().getPreco());
		String c = Double.toString(linha.totalLinha(linha.getProduto(), linha));
		
		return a + " " +b+ " " + c;
	}
	
	

}
