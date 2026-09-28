package tema2ejercicio27;

import java.util.Scanner;//importo el Scanner

public class Tema2Ejercicio27 {

    public static void main(String[] args) {
        int num;
        int cuadrado;
        int cubo;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Por favor, introduzca un numero entero: ");
        num = entrada.nextInt ();//pido al usuario que ponga un número y lo almaceno en la variables
        
        cuadrado = (num * num);//hago la operación del cuadrado y asigno el valor a la variable
        System.out.println("El cuadrado de " + num + " es: " + cuadrado);//imprimo por panatlla el resultado
        
        cubo = (num * num * num);//hago la operación del cubo y asigno el valor a la variable
        System.out.println("El cubo de " + num + " es: " + cubo);//imprimo por panatlla el resultado
        
        
        
    }
    
}
