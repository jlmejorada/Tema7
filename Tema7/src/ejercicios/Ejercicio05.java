package ejercicios;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio05 {

	 static LinkedHashMap<String, Integer> series = new LinkedHashMap<>();
	
	public static void main(String[] args) {
		int opc = 0;
		String nombre="";
		int nota=0;
		
		Scanner sc = new Scanner(System.in);
		do {

			mostrarMenu();
			opc = sc.nextInt();
			switch (opc) {
			case 1 -> {
				System.out.println("Dime el nombre de la serie");
				nombre=sc.nextLine();
				System.out.println("Dame la nota de la serie");
				nota=sc.nextInt();
				series.put(nombre, nota);
			}
			case 2 -> {
				System.out.println("Dime el nombre de la serie");
				nombre=sc.nextLine();
				series.get(nombre);
				System.out.println(nombre + " " + series.get(nombre));
			}
			case 3 -> {

			}
			case 4 -> {
				System.out.println("Saliendo...");
			}
			}
		} while (opc != 4);

	}

	public static void mostrarMenu() {
		System.out.println("1.Agregar serie:");
		System.out.println("2.Buscar serie:");
		System.out.println("3.Eliminar serie:");
		System.out.println("4.Salir:");
	}

}
