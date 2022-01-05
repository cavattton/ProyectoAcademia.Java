package app.Models;

public class Alumnos extends Persona {

	int curso, id;
	char clase;
	String modalidad;
	float evaluacion;
	// generate constructor from super class

	public Alumnos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumnos(String nombre, String apellido, String dni, float altura, float peso, int edad, int curso, int id,
			char clase, String modalidad, float evaluacion) {
		super(nombre, apellido, dni, altura, peso, edad);
		// TODO Auto-generated constructor stub
		this.curso = curso;
		this.id = id;
		this.clase = clase;
		this.modalidad = modalidad;
		this.evaluacion = evaluacion;
	}
	// generamos etters and setters

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getClase() {
		return clase;
	}

	public void setClase(char clase) {
		this.clase = clase;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public float getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(float evaluacion) {
		this.evaluacion = evaluacion;
	}

	@Override
	public String toString() {
		return "Alumnos [curso=" + curso + ", id=" + id + ", clase=" + clase + ", modalidad=" + modalidad
				+ ", evaluacion=" + evaluacion + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", altura=" + altura + ", peso=" + peso + ", edad=" + edad + "]";
	}

}
