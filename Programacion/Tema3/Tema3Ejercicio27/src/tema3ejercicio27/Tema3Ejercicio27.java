package tema3ejercicio27;

import java.util.Scanner;

public class Tema3Ejercicio27 {

    public static void main(String[] args) {
        int num1, num2, resultado, opcion;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        num1 = entrada.nextInt();
        System.out.println("Introduce otro número: ");
        num2 = entrada.nextInt();
        
        System.out.println("¿Qué quieres hacer con los números?\n" + "1.- Sumar los números.\n" + "2.- Restar los números.\n" + "3.- Multiplicar los números.\n" + "4.- Dividir los números.\n" + "5.- Salir del programa");
        opcion = entrada.nextInt();
        
        do{
            switch (opcion) {
                case 1 -> {
                    resultado=num1+num2;
                    System.out.println("La suma de " + num1 + " y " + num2 + " es: " +resultado);
                }
                case 2 -> {
                    resultado=num1-num2;
                    System.out.println("La resta de " + num1 + " y " + num2 + " es: " +resultado);
                }
                case 3 -> {
                    resultado=num1*num2;
                    System.out.println("El producto de " + num1 + " y " + num2 + " es: " +resultado);
                }
                case 4 -> {
                    resultado=num1/num2;
                    System.out.println("La división de " + num1 + " y " + num2 + " es: " +resultado);
                }
        

            }
        }while(opcion)
    }
    
}
