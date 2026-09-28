package tema3ejercicio2;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio2 {

    public static void main(String[] args) {
        int num1, num2, resultado;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Introduce un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Introduce un segundo numero: ");
        num2 = entrada.nextInt();//pregunto por los números y le doy valor a cada variable
        
        if (num1 > 10){
            resultado = num1 * num2;
            System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es: " + resultado);
        }
        else{
            resultado = num1 + num2;
            System.out.println("La suma de " + num1 + " + " + num2 + " es: " + resultado);
        }
        /*creo una condicional en la que si el primer número es mayor que 10, multiplique ambos números e imprima por pantalla el resultado
        *si el primer número no es mayor que 10, los dos números se sumarán y se imprimira por pantalla el resultado
        */
        
        
    }
    
}
