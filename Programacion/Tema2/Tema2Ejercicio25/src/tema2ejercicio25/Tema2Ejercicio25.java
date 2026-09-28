package tema2ejercicio25;

import java.util.Scanner;

public class Tema2Ejercicio25 {

    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        float suma;
        float producto;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introdzca el primer numero: ");
        num1 = entrada.nextFloat ();
        
        System.out.println("Por favor, introdzca el segundo numero: ");
        num2 = entrada.nextFloat ();
        
        System.out.println("Por favor, introdzca el tercer numero: ");
        num3 = entrada.nextFloat ();
        
        
        suma = (num1 + num2 + num3);
        producto = (num1 * num2 * num3);
        
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El producto de los numeros es: " + producto);
        
    
    }
    
}