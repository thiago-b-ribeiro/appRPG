package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {

	public DAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/apprpg?useTimezone=true&serverTimezone-UTC";
	private String user = "root";
	private String password = "Recomeco137!";
	
		
	
	
	
	private Connection conectar() {
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println("Falha na conexão: " + e);
			return null;
		}
	}
	
	
	
	
	
	public void createUsuario(Usuarios usuario) {
		String sql = "INSERT INTO usuarios(nomeUsuario, cidadeUsuario, emailUsuario, senhaUsuario) VALUES(?, ?, ?,?)";
		
		try {
			
			Connection con = this.conectar();
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, usuario.getNomeUsuario());
			pst.setString(2, usuario.getCidadeUsuario());
			pst.setString(3, usuario.getEmailUsuario());
			pst.setString(4, usuario.getSenhaUsuario());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
