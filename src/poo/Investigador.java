package uni1a;

//la creacion de esta clase cumple con la relacion de asociacion 

public class Investigador {

	private String nombre;
	private String especialidad;
	private String afiliacion;

	public Investigador(String nombre, String especialidad, String afiliacion) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.afiliacion = afiliacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public String getAfiliacion() {
		return afiliacion;
	}

	@Override
	public String toString() {
		return nombre + " - " + especialidad + " (" + afiliacion + ")";
	}

}
