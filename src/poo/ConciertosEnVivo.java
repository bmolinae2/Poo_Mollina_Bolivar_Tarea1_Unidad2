package uni1a;

import java.util.ArrayList;
import java.util.List;

public class ConciertosEnVivo extends ContenidoAudiovisual {

	private String artistaPrincipal;
	private String lugar;
	private String fechaEvento;
	private int asistentes;
	private final List<String> cancionesInterpretadas = new ArrayList<>();

	public ConciertosEnVivo(String titulo, int duracionEnMinutos, String genero, String artistaPrincipal, String lugar,
			String fechaEvento, int asistentes) {
		super(titulo, duracionEnMinutos, genero);
		this.artistaPrincipal = artistaPrincipal;
		this.lugar = lugar;
		this.fechaEvento = fechaEvento;
		this.asistentes = asistentes;
	}
	
	public void agregarCancion(String cancion) {
        if (cancion != null && !cancion.isBlank()) cancionesInterpretadas.add(cancion);
    }

    public void iniciarConcierto() {
        System.out.println("🎸 Iniciando concierto de " + artistaPrincipal + " en " + lugar + "...");
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Concierto en Vivo:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Género: " + getGenero());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Artista principal: " + artistaPrincipal);
        System.out.println("Lugar: " + lugar);
        System.out.println("Fecha: " + fechaEvento);
        System.out.println("Asistentes: " + asistentes);
        System.out.println("Canciones interpretadas: " + cancionesInterpretadas);
        System.out.println();
    }
	
	

}
