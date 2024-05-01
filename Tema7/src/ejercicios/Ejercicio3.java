package ejercicios;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        String texto = "En un agujero en el suelo, vivía un hobbit." 
                        + "No un agujero húmedo, sucio, repugnante, con restos" 
                        + " de gusanos y olor a fango, ni tampoco un agujero, seco,"
                        + " desnudo y arenoso, sin nada en que sentarse o que comer:"
                        + " era un agujero-hobbit, y eso significa comodidad";

        
        HashMap<Character, Integer> frecuencia = new HashMap<>();

        for(char letra : texto.toCharArray()){
            if(Character.isLetter(letra)){
                letra = Character.toLowerCase(letra);
                frecuencia.put(letra, frecuencia.getOrDefault(letra, 0) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : frecuencia.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        } 

    }

}