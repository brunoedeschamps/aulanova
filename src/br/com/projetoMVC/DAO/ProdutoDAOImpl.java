package br.com.projetoMVC.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projetoMVC.model.Produto;
import br.com.projetoMVC.util.ConnectionFactory;

public class ProdutoDAOImpl implements GenericDAO {
	
	private Connection conn;
	
	public ProdutoDAOImpl() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
			System.out.println("Conectado com sucesso!");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	public List<Object> listarTodos() {
		//Criando a lista de objetos que será retornada;
		List<Object> lista = new ArrayList<Object>();
		//Criando um objeto de PreparedStatement para envio de informação ao banco;
		PreparedStatement stmt = null;
		//Criando um objeto de ResultSet para obter o retorno da query executada;
		ResultSet rs = null;
		
		//Criando a SQL que será executada no banco;
		String sql = "SELECT * FROM Produto ORDER BY descricao";
		
		try {
			//Preparar a SQL para ser executada;
			stmt = conn.prepareStatement(sql);
			//Executar a Query;
			rs = stmt.executeQuery();
			//Percorrer cada linha do resultado da Query;
			while(rs.next()) {
				//Instanciando a classe Produto;
				Produto produto = new Produto();
				
				//Inserir em cada atributo do objeto a coluna correspondente do banco de dados;
				produto.setId(rs.getInt("id"));
				produto.setDescrição(rs.getString("descricao"));
				lista.add(produto);
			}	
		}catch (SQLException ex) {
				System.out.println("Problemas na DAO ao listar Produto!" + ex.getMessage());
				ex.printStackTrace();
				
				} finally {
					//Fechar a conexão com o banco de dados independente se obteve retorno positivo ou não;
				try {
					ConnectionFactory.closeConnection(conn, stmt, rs);
					
				} catch (Exception ex) {
					System.out.println("Probelmas ao fechar a conexao!" + ex.getMessage());
				}
			}
				
		return lista;
	}

	@Override
	public Object listarPodId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cadastrar(Object object) {
		
		// Convertendo um objeto do tipo genérico para um objetico da classe Produto;
		// Conversão tipo CAST;
		Produto produto = (Produto) object;
		PreparedStatement stmt = null;
		// Passando os VALUES de forma dinamica para a Query;
		String sql = "INSERT INTO produto (descricao) " + "VALUES (?) ";
		try { 
			stmt = conn.prepareStatement(sql);
			
			//Vinculando o primeiro ponto de interrogação com o primeiro parametro do stmt
			stmt.setString(1, produto.getDescrição());
			//Executando a Query;
			stmt.execute();
			return true;
			
		}catch (SQLException ex) {
			System.out.println("Problemas na DAO ao cadastrar Produto!" + ex.getMessage());
			ex.printStackTrace();
			return false;
		} finally {
			try {
				ConnectionFactory.close(conn, stmt, null);
			}catch (Exception e) {
				System.out.println("Problemas ao fechar a conexão!" + e.getMessage());
			}
		}
	}

	@Override
	public Boolean alterar(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
		
	}

}
