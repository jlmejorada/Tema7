package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		final int TAMANO = 5;
		String texto="";
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> nombres = new ArrayList<>();
		
		while (nombres.size()<5) {
			System.out.print("Dime un nombre: ");
			texto=sc.nextLine();
			if (nombres.contains(texto)) {
				System.out.println("Ese nombre ya está introducido");			
			} else nombres.add(texto);	
		}
		
		System.out.println(nombres);
		
		Collections.reverse(nombres);
		
		System.out.println(nombres);

	}

}
