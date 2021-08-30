package br.com.projetoMVC.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionFactory {
	
	//Criando as constantes que guardar�o os parametros para estabelecer a conexao;
	public static final String URL = "jdbc:postgresql://locahost:5432/turmajava";
	public static final String USER = "postgres";
	public static final String PASSWORD = "postgres";
	
	// M�todo para estabelecer a conexao com o banco;
	public static Connection getConnection() throws Exception{
		try {
			//Carrega o driver do postgresql;
			Class.forName("org.postgresql.Driver");
			
			// Retornar a conex�o estabelecida;
			return DriverManager.getConnection(URL, USER, PASSWORD);
		}catch (Exception e) {
			// Retorna uma mensagem de erro caso a conex�o n�o seja estabelecida;
			throw new Exception(e.getMessage());
		}
		
	}
	
	//Criando m�todos para fechar a conex�o
	
	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws Exception {
		close(conn, stmt, rs);
	}
	public static void closeConnection(Connection conn, Statement stmt) throws Exception {
		close(conn, stmt, null);
	}
	public static void closeConnection(Connection conn) throws Exception {
		close(conn, null, null);
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception {
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
