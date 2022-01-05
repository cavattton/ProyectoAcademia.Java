package app.Views;

import app.Models.Alumnos;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

public  class Crud {

	Scanner sc = new Scanner(System.in);

	public List<Alumnos> create(List<Alumnos> givenList) {
		System.out.println("Introduce el nombre del alumno:");
		String nombre = sc.nextLine();
		System.out.println("Introduce los apellidos del alumno:");
		String apellido = sc.nextLine();
		System.out.println("Introduce el DNI del alumno:");
		String dni = sc.next();
		System.out.println("Introduce la letra de la clase del alumno:");
		char clase = sc.next().toUpperCase().charAt(0);
		System.out.println("Introduce la modalidad que esta estudiando el alumno:");
		String modalidad = sc.nextLine();
		System.out.println("Introduce la altura del alumno:");
		float altura = sc.nextFloat();
		System.out.println("Introduce el peso del alumno:");
		float peso = sc.nextFloat();
		System.out.println("Introduce la edad del alumno:");
		int edad = sc.nextInt();
		System.out.println("Introduce el curso del alumno:");
		int curso = sc.nextInt();

		System.out.println("Introduce la evaluacion del alumno:");
		float evaluacion = sc.nextFloat();

		int id = givenList.size() + 1;
		Alumnos alums = new Alumnos(nombre, apellido, dni, altura, peso, edad, curso, id, clase, modalidad, evaluacion);
		givenList.add(alums);

		return givenList;

	}

	public void readAll(List<Alumnos> givenList) {

		for (Alumnos alumnos : givenList) {
			System.out.println(alumnos.toString());
		}

	}

	public Alumnos search(List<Alumnos> givenList) {
		System.out.println("Introduzca el DNI del Alumno que desea buscar");
		String dni = sc.next();
		Iterator<Alumnos> iterador = givenList.iterator();

		while (iterador.hasNext()) {
			Alumnos alumno = (Alumnos) iterador.next();

			if (alumno.getDni().equals(dni)) {
				return alumno;

			}

		}
		System.out.println("No se ha encontrado el dato ofrecido");
		return null;
	}

	public void read(List<Alumnos> givenList) {
		Alumnos alum = search(givenList);
		System.out.println(alum.toString());

	}

	public List<Alumnos> update(List<Alumnos> givenList) {
		boolean comp = true;
		int option;
		while (comp) {
			Alumnos alum = search(givenList);
		
			delete(givenList,alum.getDni());
			if (alum != null) {
				do {

					System.out.println("Elija el atributo que desea modificar del alumno" + alum.getNombre());
					System.out.println("1- Nombre");
					System.out.println("2- Apellido");
					System.out.println("3- Edad");
					System.out.println("4- Peso");
					System.out.println("5- Altura");
					System.out.println("6- Curso");
					System.out.println("0- Terminar de modificar");
					option = sc.nextInt();

					switch (option) {
					case 1:
						System.out.println("Introduzca el nombre");
						alum.setNombre(sc.nextLine());
						break;

					case 2:
						System.out.println("Introduzca el apellido");
						alum.setApellido(sc.nextLine());
						break;

					case 3:
						System.out.println("Introduzca el edad");
						alum.setEdad(sc.nextInt());
						break;

					case 4:
						System.out.println("Introduzca el peso");
						alum.setPeso(sc.nextFloat());
						break;

					case 5:
						System.out.println("Introduzca el altura");
						alum.setAltura(sc.nextFloat());
						break;

					case 6:
						System.out.println("Introduzca el curso");
						alum.setCurso(sc.nextInt());
						break;
											
					case 0:
						System.out.println("Modificación realizada con exito");
					
					default:
						System.out.println("La opcion no esta disponible");
						break;
					}

				} while (option != 0);
				comp = false;
			} else {
				System.out.println("¿Quiere intentalo de nuevo (Y/N)?");
				if (sc.next().equals("Y")) {
					comp =true;
				} else {
					givenList.add(alum);
					comp=false;
				}
			}
		}
	
		return givenList;

	}
	public List <Alumnos> delete(List<Alumnos> givenList,String dni){
		Iterator <Alumnos>it= givenList.iterator();
		while (it.hasNext()) {
			Alumnos alum = (Alumnos) it.next();
			if (alum.getDni().equals(dni)) {
				it.remove();
			}
		}
		return givenList;
		
	}
}
