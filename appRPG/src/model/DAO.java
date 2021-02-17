package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {

	public DAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/apprpg?useTimezone=true&serverTimezone=UTC";
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
			
			Connection con = conectar();
			
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
	
	public ArrayList<String> popularCombobox(){
		String sql = "SELECT MUNICIPIO FROM apprpg.municipios;";
		ArrayList<String> municipios = new ArrayList<>();
		
		try {
			Connection con = conectar();
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery(sql);
			
			while(rs.next()) {
				municipios.add(rs.getString(1));
			}
			
			pst.close();
			con.close();
			
			return municipios;
			
		} catch (Exception e) {
			System.out.println("Não foi possível carregar os municípios: " + e);
			return null;
		}
	}
}
