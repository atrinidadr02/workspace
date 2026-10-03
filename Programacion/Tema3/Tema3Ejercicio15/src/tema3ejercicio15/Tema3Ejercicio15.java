package tema3ejercicio15;

import java.util.Scanner;

public class Tema3Ejercicio15 {

    public static void main(String[] args) {
        int num, resultado, i;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        num = entrada.nextInt();
        
        for(i=0; i<=10; i++){
            resultado = num * i;
            System.out.println(num + " * " + i + " = " +resultado);
        }
        
    }
    
}
