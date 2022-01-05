package app.Models;

public class Profesor extends Persona {

	float sueldo;
	int id;
	String modalidad;
	//Constructores
	public Profesor() {
		super();
	}
	public Profesor(String nombre, String apellido, String dni, float altura, float peso, int  edad, float  sueldo, int id, String modalidad) {
		super(nombre, apellido , dni, altura, peso, edad);
		this.sueldo = sueldo;
		this.id = id;
		this.modalidad = modalidad;
		
		
		
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	@Override
	public String toString() {
		return "Profesor [sueldo=" + sueldo + ", id=" + id + ", modalidad=" + modalidad + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", dni=" + dni + ", altura=" + altura + ", peso=" + peso + ", edad=" + edad
				+ "]";
	}
	
	
	
	

}
