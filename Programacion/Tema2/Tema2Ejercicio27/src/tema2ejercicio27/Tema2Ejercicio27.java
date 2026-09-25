package tema2ejercicio27;

import java.util.Scanner;

public class Tema2Ejercicio27 {

    public static void main(String[] args) {
        int num;
        int cuadrado;
        int cubo;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca un numero entero: ");
        num = entrada.nextInt ();
        
        cuadrado = (num * num);
        System.out.println("El cuadrado de " + num + " es: " + cuadrado);
        
        cubo = (num * num * num);
        System.out.println("El cubo de " + num + " es: " + cubo);
        
        
        
    }
    
}
