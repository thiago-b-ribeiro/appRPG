package model;

public class Usuarios {
	
	private String nomeUsuario;
	private String cidadeUsuario;
	private String emailUsuario;
	private String senhaUsuario;	

	
	
	
	
	public Usuarios() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Usuarios(String nomeUsuario, String cidadeUsuario, String emailUsuario, String senhaUsuario) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.cidadeUsuario = cidadeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
	}





	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getCidadeUsuario() {
		return cidadeUsuario;
	}

	public void setCidadeUsuario(String cidadeUsuario) {
		this.cidadeUsuario = cidadeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

}
