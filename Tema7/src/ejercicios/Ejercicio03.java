package ejercicios;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio03 {

	public static void main(String[] args) {
		String texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		TreeMap<Character, Integer> lista = new TreeMap<>();

		
		for (char letra: texto.toCharArray()) {
			if (Character.isLetter(letra)) {
				letra=Character.toLowerCase(letra);
				lista.put(letra, lista.getOrDefault(letra, 0)+1);
			}
		}
		for (Map.Entry<Character, Integer> pos : lista.entrySet()) {
			System.out.println(pos.getKey() + " " + pos.getValue());
		}
	}

}
