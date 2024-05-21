package ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio01 {

	public static void main(String[] args) {
		final int TAMANO=10;
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		for (int i=1 ; i<=TAMANO ; i++) {
			lista.add(i);
		}
		
		for (int numero: lista) {
			System.out.print(numero + " ");
		}
		System.out.println();
		
		Collections.shuffle(lista);
		
		for (int numero: lista) {
			System.out.print(numero + " ");
		}

	}

}
