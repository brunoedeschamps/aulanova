package br.com.projetoMVC.DAO;

import java.util.List;

public interface GenericDAO {
	
	/*
	 * Criando as assinaturas dos m�todos que ser�o
	 * 
	 */
	
	public List<Object> listarTodos();
	
	public Object listarPodId(int id);
	
	public Boolean cadastrar (Object object);
	
	public Boolean alterar (Object object);
	
	public void excluir (int id);
}
