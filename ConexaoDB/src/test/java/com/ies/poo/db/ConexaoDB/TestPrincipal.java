package com.ies.poo.db.ConexaoDB;

import java.sql.ResultSet;

public class TestPrincipal {
	
	public static void main(String[] args) {
		
		Conexao con = new Conexao(); 
		
		String sql = "INSERT INTO pessoa (id, nome, idade) VALUES (default, 'Anatan', 20)";
		
		int res = con.executaSQL(sql); 
		
		if(res > 0) {
			
			System.out.println("Cadastrado com Sucesso!");
		}else {
			
			System.out.println("Erro ao Cadastrar!!");
		}
		
	String valor = "SELECT * FROM pessoa";
		
		ResultSet rs = con.executaBusca(valor);
		
		try { 
			while (rs.next()) {
				
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				int idade = rs.getInt("idade");
				
				System.out.println(id + " - " + nome + " - " + idade);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} 

}
