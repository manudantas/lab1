package atividade;

import java.util.ArrayList;

public class Pedido {

	ArrayList< LinhaPedido > Linhas = new ArrayList< LinhaPedido >();
	
	public boolean adicionarLinha(LinhaPedido linha){
		if(true){	
			Linhas.add(linha);
			return true;
		}
		return false;
	}
	
	public boolean removerLinha(String nomeproduto){
			for (int i=0;i<Linhas.size();i++){
				LinhaPedido linhas = Linhas.get(i);
				if(linhas.getNome().equals(nomeproduto)){
					Linhas.remove(linhas);
					return true;
				}
			}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
