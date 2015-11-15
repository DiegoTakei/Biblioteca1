package br.edu.ifpb;

import javax.persistence.*;

@Entity
public class Volume {
	
	@Id
	private String titulo;
	private String descricao;
	private String tipo_volume;
	private Integer pags;
	private String ano_publicacao;
	private String editora;
	private String autor;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo_volume() {
		return tipo_volume;
	}
	public void setTipo_volume(String tipo_volume) {
		this.tipo_volume = tipo_volume;
	}
	public Integer getPags() {
		return pags;
	}
	public void setPags(Integer pags) {
		this.pags = pags;
	}
	public String getAno_publicacao() {
		return ano_publicacao;
	}
	public void setAno_publicacao(String ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
