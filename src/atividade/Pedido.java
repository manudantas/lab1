package atividade;

import java.util.ArrayList;

public class Pedido {

	public boolean adicionarLinha(LinhaPedido linha, ArrayList< LinhaPedido > linhasPedido){
		{	
			linhasPedido.add(linha);
			return true;
		}
	}
	
	public boolean removerLinha(Produto produto, ArrayList< LinhaPedido > linhasPedido){
			for (int i=0;i<linhasPedido.size();i++){
				LinhaPedido linha = linhasPedido.get(i);
				if(linha.getProduto() == produto){
					linhasPedido.remove(linha);
					return true;
				}
			}
		return false;
		
	}
	
	public void mostrarTodasLinhas(ArrayList< LinhaPedido > linhasPedido){
		for(int i=0;i<linhasPedido.size();i++){
			System.out.println(linhasPedido.get(i).mostrarLinha(linhasPedido.get(i)));			
		}
	}
	
	public double totalFinal(ArrayList< LinhaPedido > linhasPedido){
		double a=0;
		for (int i=0;i<linhasPedido.size();i++){
			LinhaPedido linhas = linhasPedido.get(i);
			a = a + linhas.totalLinha(linhas.getProduto(),linhas);
		}
		return a;
	}
	
	
	

	

	
	
	
	
}
