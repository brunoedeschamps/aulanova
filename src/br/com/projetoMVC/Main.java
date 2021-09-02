package br.com.projetoMVC;

import java.util.List;

import br.com.projetoMVC.controller.ProdutoController;
import br.com.projetoMVC.model.Produto;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
	/*	Connection connection = ConnectionFactory.getConnection();		
		
		// Testando a conexão;
			if(connection != null) {
				System.out.println("CONEXÃO OK!");
			}else {
				System.out.println("PROBLEMA NA CONEXÃO!");
			}
			connection.close(); */
		
		ProdutoController controller = new ProdutoController();
		
		List<Produto> lista = controller.listarTodos();
		
		System.out.println("LISTA DE PRODUTOS");
		for(Produto produto : lista) {
			System.out.println("ID: " + produto.getId());
			System.out.println("Descrição: " + produto.getDescrição());
		}
		
		}
		
	}


