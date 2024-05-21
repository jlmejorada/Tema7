package ejercicios;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {
		final int TAMANO=10;
		int num=0;
		Random rand = new Random();
		
		LinkedHashSet<Integer> lista = new LinkedHashSet<>();

		while (lista.size() != TAMANO) {
			num = rand.nextInt(1,20);
			lista.add(num);
		}
		
		for (int numero: lista) {
			System.out.print(numero + " ");
		}
	}

}
