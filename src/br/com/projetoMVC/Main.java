package br.com.projetoMVC;

import java.util.List;

import br.com.projetoMVC.controller.ProdutoController;
import br.com.projetoMVC.model.Produto;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
	/*	Connection connection = ConnectionFactory.getConnection();		
		
		// Testando a conex�o;
			if(connection != null) {
				System.out.println("CONEX�O OK!");
			}else {
				System.out.println("PROBLEMA NA CONEX�O!");
			}
			connection.close(); */
		
		ProdutoController controller = new ProdutoController();
		
		List<Produto> lista = controller.listarTodos();
		
		System.out.println("LISTA DE PRODUTOS");
		for(Produto produto : lista) {
			System.out.println("ID: " + produto.getId());
			System.out.println("Descri��o: " + produto.getDescri��o());
		}
		
		}
		
	}


