package uqbar.libros.domain;

public class Libro {
	private String titulo;
	private String autor;
	private int id;

	public Libro(int id, String titulo, String autor) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	// solo para Json.fromObject (backend en play)
	public Libro() {
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public int getId() {
		return this.id;
	}
}
