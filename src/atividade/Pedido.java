package atividade;

import java.util.ArrayList;

public class Pedido {

	ArrayList< LinhaPedido > linhasPedido = new ArrayList< LinhaPedido >();
	
	public boolean adicionarLinha(LinhaPedido linha){
		{	
			linhasPedido.add(linha);
			return true;
		}
	}
	
	public boolean removerLinha(Produto produto){
			for (int i=0;i<linhasPedido.size();i++){
				LinhaPedido linha = linhasPedido.get(i);
				if(linha.getProduto() == produto){
					linhasPedido.remove(linha);
					return true;
				}
			}
		return false;
		
	}
	
	public double totalFinal(){
		double a=0;
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			a = a + linhas.totalLinha();
		}
		return a;
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
