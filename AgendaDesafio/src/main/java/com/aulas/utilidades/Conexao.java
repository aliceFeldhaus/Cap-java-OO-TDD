package com.aulas.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	static Connection con = null;

	public static Connection conectar() {
		// "jdbc:postgresql://host:port/database"
		String url = "jdbc:postgresql://ec2-3-224-164-189.compute-1.amazonaws.com:5432/dauselurqd46lc";
		String user = "ddjfpwejdvkhvg";
		String password = "a04c7c75dcd8d4a6f173dffb4d848ed5fd7498a7dbbef13b1c81996b0978de9e";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void closeConexao() {
		con = null;
	}
}
