package uni1a;
// la creacion de esta clase clase cumple con la relacion de composicion porque temporadas vienen dentro de las series 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Temporada {
	private int numero;
	private List<String> episodios = new ArrayList<>();

	public Temporada(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void agregarEpisodio(String titulo) {
		if (titulo != null && !titulo.isBlank())
			episodios.add(titulo);
	}

	public List<String> getEpisodios() {
		return Collections.unmodifiableList(episodios);
	}

	@Override
	public String toString() {
		return "T" + numero + " eps=" + episodios.size();
	}

}
