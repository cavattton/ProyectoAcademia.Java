package app.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.Models.Alumnos;
import app.Views.Crud;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Alumnos> listAlumnos = new ArrayList<Alumnos>();
		int option;
		Crud crud = new Crud ();
		Alumnos alum1 = new Alumnos("Cristian", "Cavatton", "12121121G", 1.75f, 75.3f, 24, 2, listAlumnos.size() + 1,
				'A', "Programación", 7f);
		listAlumnos.add(alum1);
		Alumnos alum2 = new Alumnos("Pablo", "Torres", "88888888F", 1.49f, 50.3f, 29, 2, listAlumnos.size() + 1,
				'B', "Programación", 6.5f);
		listAlumnos.add(alum2);
		Alumnos alum3 = new Alumnos("Laura", "Diaz", "60606000D", 1.55f, 55.3f, 24, 1, listAlumnos.size() + 1,
				'C', "Sistemas", 7f);
		listAlumnos.add(alum3);
		
		do {
			System.out.println("Elija une opcion" );
			System.out.println("1- Crear un registro");
			System.out.println("2- Leer un registro");
			System.out.println("3- Leer todos los registros");
			System.out.println("4- Modificar");
			System.out.println("5- Eliminar");

			System.out.println("0- Salir");
			option = sc.nextInt();

			switch (option) {
			case 1:
				crud.create(listAlumnos);
				break;
				
			case 2:
				crud.read(listAlumnos);
				break;
				
			case 3:
				crud.readAll(listAlumnos);
				break;
				
			case 4:
				crud.update(listAlumnos);
				break;
				
			case 5:
				System.out.println("Introduzca el DNI del registro que quiera eliminar:");
				crud.delete(listAlumnos,sc.next());
		
				break;
				
			
			default:
				break;
			}
		} while (option!=0);
	}

}
