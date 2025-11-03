package poo;

import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
		/*
		 * System.out.println("Hello from Eclipse!");
		 * 
		 * // Crear instancias de las subclases ContenidoAudiovisual[] contenidos = new
		 * ContenidoAudiovisual[3]; contenidos[0] = new Pelicula("Avatar", 125,
		 * "Accion", "20th Century Studios"); contenidos[1] = new
		 * SerieDeTV("Game of Thrones", 60, "Fantasy", 8); contenidos[2] = new
		 * Documental("Cosmos", 45, "Science", "Astronomy");
		 * 
		 * // Mostrar los detalles de cada contenido audiovisual for
		 * (ContenidoAudiovisual contenido : contenidos) { contenido.mostrarDetalles();
		 * }
		 */

		// Película + Actores (AGREGACIÓN)
		Pelicula p = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
		p.agregarActor(new Actor("Sam Worthington", 48, "Australia"));
		p.agregarActor(new Actor("Zoe Saldana", 47, "EE.UU."));

		// Serie + Temporadas (COMPOSICIÓN)
		SerieDeTV s = new SerieDeTV("Game of Thrones", 60, "Fantasía", 8);
		Temporada t1 = s.crearTemporada(1);
		t1.agregarEpisodio("Winter Is Coming");
		s.crearTemporada(2).agregarEpisodio("The North Remembers");

		// Documental + Investigadores (ASOCIACIÓN)
		Documental d = new Documental("Cosmos", 45, "Ciencia", "Astronomía");
		d.agregarInvestigador(new Investigador("Neil deGrasse Tyson", "Astrofísica", "AMNH"));

		// Nuevo: Anime
		Anime a = new Anime("Attack on Titan", 24, "Acción", "MAPPA", "Seinen", 87, true);
		a.agregarIdioma("Japonés");
		a.agregarIdioma("Inglés");
		a.agregarIdioma("Español Latino");
		a.reproducirOpening();

		// Nuevo: Concierto en vivo
		ConciertosEnVivo c = new ConciertosEnVivo("Live in Tokyo", 90, "Rock", "Coldplay", "Tokyo Dome", "2023-11-01",
				55000);
		c.agregarCancion("Viva la Vida");
		c.agregarCancion("Fix You");
		c.iniciarConcierto();

		// Polimorfismo
		ContenidoAudiovisual[] lista = { p, s, d, a, c };
		for (ContenidoAudiovisual ca : lista) {
			ca.mostrarDetalles();
		}
	}

}