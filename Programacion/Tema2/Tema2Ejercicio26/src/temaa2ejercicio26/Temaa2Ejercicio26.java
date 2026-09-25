package temaa2ejercicio26;

import java.util.Scanner;

public class Temaa2Ejercicio26 {

    public static void main(String[] args) {
        int numero;
        int x;
        int y;
        int z;
        int w;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduca un numero de 4 cifras: ");
        numero = entrada.nextInt ();
        
        x = (numero/1000);
        y = (numero/100) % 10;
        z = (numero/10) % 10;
        w = (numero % 10);
        
        System.out.println("La primera cifra es: " + x);
        System.out.println("La segunda cifra es: " + y);
        System.out.println("La tercera cifra es: " + z);
        System.out.println("La cuarta cifra es: " + w);
        
        
        
        
    }
    
}
