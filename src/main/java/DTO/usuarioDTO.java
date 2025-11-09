package DTO;

public class usuarioDTO {
	private int cod_usuario;
	private String nome;
	private String login;
	private String senha;
	
	
	
	
	public usuarioDTO() {
	}
	
	
	public usuarioDTO(int cod_usuario, String nome, String login, String senha) {
		this.cod_usuario = cod_usuario;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}



	public int getCod_usuario() {
		return cod_usuario;
	}
	public void setCod_usuario(int cod_usuario) {
		this.cod_usuario = cod_usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
