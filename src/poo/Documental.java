/**
 * Class Documental
 */
package uni1a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private final List<Investigador> investigadores = new ArrayList<>();
    
    

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }
    
    
    public void agregarInvestigador(Investigador inv) {
        if (inv != null) investigadores.add(inv);
    }

    public List<Investigador> getInvestigadores() {
        return Collections.unmodifiableList(investigadores);
    }
    

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
    	 System.out.println("Detalles del documental:");
    	    System.out.println("ID: " + getId());
    	    System.out.println("Título: " + getTitulo());
    	    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    	    System.out.println("Género: " + getGenero());
    	    System.out.println("Tema: " + this.getTema());
    	    System.out.println("Investigadores: " + investigadores);
    	    System.out.println();
       
    }
}