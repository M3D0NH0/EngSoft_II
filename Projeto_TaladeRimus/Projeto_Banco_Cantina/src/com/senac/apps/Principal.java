package com.senac.apps;

import java.sql.SQLException;

import com.senac.conexao.ConexaoBanco;
import com.senac.view.TelaLogin;

public class Principal extends ConexaoBanco{
	static TelaLogin login;
	static ConexaoBanco conexao;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		login = new TelaLogin();
		
		ConexaoBanco.getConexaoPostgres();
		
		login.iniciaTelaLogin();
	}
}
