package tema4ejercicio05;

import java.util.Scanner;//importo el Scanner

public class Tema4Ejercicio05 {

    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);//declaro la variable y creo el Scanner
        
        System.out.println("Introduce un numero y te dire si es par o impar: ");
        num = entrada.nextInt();//pregunto por un numero y le doy el valor a la variable
        
        comprobar.ParImpar.parimpar(num);//llamo al paquete que contiene la clase con el metodo que soluciona el problema
        
    }
    
}
