package ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

    public static void main(String[] args) {
        
    	final int TAMANO = 10;
       
    	ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 1; i<=TAMANO ; i++){
            numeros.add(i);
        }
       
        for(int valor : numeros){
            System.out.print(valor + " ");
        }

        System.out.println();
        
        Collections.shuffle(numeros);
        
        for(int valor : numeros){
            System.out.print(valor + " ");
        }
    }
}
