package tema3ejercicio5;

import java.util.Scanner;

public class Tema3Ejercicio5 {

    public static void main(String[] args) {
        int num, resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca un numero entero: ");
        num = entrada.nextInt();
        
        resultado = num % 2;
        if(resultado == 1){
            System.out.println("El numero " + num + " es impar");
        }
        
        else{
            System.out.println("El numero " + num + " es par");
        }
    }
    
}
