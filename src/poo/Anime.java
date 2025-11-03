package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Anime extends ContenidoAudiovisual {

	private String estudioAnimacion;
	private String publicoObjetivo; // Shonen, Seinen, Shojo...
	private int numeroEpisodios;
	private final List<String> idiomasDisponibles = new ArrayList<>();
	private boolean tieneDoblaje;

	public Anime(String titulo, int duracionEnMinutos, String genero, String estudioAnimacion, String publicoObjetivo,
			int numeroEpisodios, boolean tieneDoblaje) {
		super(titulo, duracionEnMinutos, genero);
		this.estudioAnimacion = estudioAnimacion;
		this.publicoObjetivo = publicoObjetivo;
		this.numeroEpisodios = numeroEpisodios;
		this.tieneDoblaje = tieneDoblaje;
	}

	public void agregarIdioma(String idioma) {
		if (idioma != null && !idioma.isBlank())
			idiomasDisponibles.add(idioma);
	}

	public void mostrarIdiomas() {
		System.out.println("Idiomas disponibles: " + idiomasDisponibles);
	}

	public void reproducirOpening() {
		System.out.println("🎵 Reproduciendo opening de " + getTitulo() + "...");
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del Anime:");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Género: " + getGenero());
		System.out.println("Duración promedio (min): " + getDuracionEnMinutos());
		System.out.println("Estudio de animación: " + estudioAnimacion);
		System.out.println("Público objetivo: " + publicoObjetivo);
		System.out.println("Episodios: " + numeroEpisodios);
		System.out.println("Tiene doblaje: " + (tieneDoblaje ? "Sí" : "No"));
		mostrarIdiomas();
		System.out.println();
	}

}
