package ejercicios;


import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {
        
    	final int TAMANO = 10;
        
    	int ale;
        
    	Random rand = new Random();
       
    	LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        
    	while(numeros.size() != TAMANO){
            ale = rand.nextInt(1, 20);
            numeros.add(ale);
        }
        
    	for (int valor : numeros) {
            System.out.print(valor + " ");
        }
    }

}
