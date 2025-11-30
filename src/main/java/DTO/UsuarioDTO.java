package DTO;

import model.Usuario;

public class UsuarioDTO {
	public int cod_usuario;
	public String nome;
	public String login;
	public String senha;

	public UsuarioDTO() {}

	public UsuarioDTO(int cod_usuario, String nome, String login, String senha) {
		this.cod_usuario = cod_usuario;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	public UsuarioDTO(Usuario usr) {
		this.cod_usuario = usr.getId();
		this.nome = usr.getNome();
		this.login = usr.getLogin();
		this.senha = usr.getSenha();
	}

	

}
