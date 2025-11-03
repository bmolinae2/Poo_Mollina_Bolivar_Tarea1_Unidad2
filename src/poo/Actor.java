package uni1a;

import java.util.Objects;

// La creacion de esta clase: (Actor) cumple con la relación de agregacion. 
public class Actor {
	private String nombre;
	private int edad;
	private String nacionalidad;

	public Actor(String nombre, int edad, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;

	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	@Override
	public String toString() {
		return nombre + " (" + nacionalidad + ", " + edad + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Actor)) {
			return false;
		}
		Actor a = (Actor) o;
		return Objects.equals(nombre, a.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

}
