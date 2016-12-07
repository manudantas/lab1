package atividade;

import java.util.ArrayList;

public class Pedido {

	ArrayList< LinhaPedido > Linhas = new ArrayList< LinhaPedido >();
	
	public boolean adicionarLinha(LinhaPedido linha){
		{	
			Linhas.add(linha);
			return true;
		}
	}
	
	public boolean removerLinha(Produto produto){
			for (int i=0;i<Linhas.size();i++){
				LinhaPedido linhas = Linhas.get(i);
				if(linhas.getProduto() == produto){
					Linhas.remove(linhas);
					return true;
				}
			}
		return false;
		
	}
	
	public double totalFinal(){
		double a=0;
		for (int i=0;i<Linhas.size();i++){
			LinhaPedido linhas = Linhas.get(i);
			a = a + linhas.totalLinha();
		}
		return a;
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
