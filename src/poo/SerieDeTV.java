/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
	private int temporadas;
	private final List<Temporada> temporadasC = new ArrayList<>();

	public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
		super(titulo, duracionEnMinutos, genero);
		this.temporadas = temporadas;
	}

	public Temporada crearTemporada(int numero) {
		Temporada t = new Temporada(numero);
		temporadasC.add(t);
		return t;
	}

	public List<Temporada> getTemporadasC() {
		return Collections.unmodifiableList(temporadasC);
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	@Override
	public void mostrarDetalles() {

		System.out.println("Detalles de la serie de TV:");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Temporadas declaradas: " + getTemporadas());
		System.out.println("Temporadas (composición): " + temporadasC);
		System.out.println();

	}
}