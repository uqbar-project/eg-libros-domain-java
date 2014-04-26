package uqbar.libros.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Biblioteca {
	private static final Biblioteca instance = new Biblioteca();
	private Collection<Libro> libros = new ArrayList<Libro>();
	private int id = 0;

	public Biblioteca() {
		this.agregarLibro("Las venas abiertas de América Latina", "Eduardo Galeano");
		this.agregarLibro("Guerra y Paz", "León Tolstoi");
		this.agregarLibro("Patas Arriba", "Eduardo Galeano");
		this.agregarLibro("El fútbol a sol y a sombra", "Eduardo Galeano");
		this.agregarLibro("Historia del siglo XX", "Eric Hobsbawm");
		this.agregarLibro("Ficciones", "Jorge Luis Borges");
		this.agregarLibro("El Aleph", "Jorge Luis Borges");
		this.agregarLibro("La invención de Morel", "Adolfo Bioy Casares");
		this.agregarLibro("Rayuela", "Julio Cortázar");
		this.agregarLibro("El barón rampante", "Italo Calvino");
		this.agregarLibro("El vizconde demediado", "Italo Calvino");
		this.agregarLibro("100 años de soledad", "Gabriel García Márquez");
		this.agregarLibro("Un día en la vida de Ivan Denisovich", "Alexander Solyenitsin");
		this.agregarLibro("El día del arquero", "Juan Sasturain");
	}

	public static Biblioteca getInstance() {
		return instance;
	}

	public void agregarLibro(String titulo, String autor) {
		this.libros.add(new Libro(this.id++, titulo, autor));
	}

	public List<Libro> buscar(String titulo) {
		List<Libro> seleccionDeLibros = new ArrayList<Libro>();
		for (Libro libro : this.libros) {
			if (libro.getTitulo().contains(titulo)) {
				seleccionDeLibros.add(libro);
			}
		}
		return seleccionDeLibros;
	}

	public Libro getLibro(int id) {
		for (Libro libro : this.libros) {
			if (libro.getId() == id) {
				return libro;
			}
		}
		throw new RuntimeException("No tengo ese libro, man. (el del id = " + id + ")");
	}
	
	public void eliminarLibro(int id) {
		this.libros.remove(this.getLibro(id));
	}
	
	public Collection<Libro> todasLasInstancias() {
		return this.libros;
	}

}
