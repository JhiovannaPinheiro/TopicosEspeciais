package br.edu.pacotinho;

import java.io.Serializable;

public class Livros implements Serializable {

	private String titulo;
	private Integer ano;
	private String autor;
	
	public Livros() {}
		
		public String getTitulo() {
			return titulo;
		}
		
		public void setTitulo (String titulo) {
			this.titulo = titulo;
		}
		
		public Integer getAno() {
			return ano;
		}

		public void setAno(Integer ano) {
			this.ano = ano;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		
		}
		
		public String toString() {
			
			return "Título: " + titulo + ", ano: " + ano + ", autora: " + autor + "." + "<br>";
		}

	}
	

