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
        
        do{
            System.out.println("-MENU DE OPCIONES-");
            System.out.println("1-Sumar los numeros");
            System.out.println("2-Restar los numeros");
            System.out.println("3-Multiplicar los numeros");
            System.out.println("4-Dividir los numeros");
            System.out.println("5-Salir del programa");
            
            opcion = entrada.nextInt();
            
            
            switch (opcion){
                case 1 -> System.out.println("La suma es: " + (num1+num2));
                
                case 2 -> System.out.println("La resta es: " + (num1-num2));
                
                case 3 -> System.out.println("La multiplicación es: " + (num1*num2));
                
                case 4 -> {
                    try{
                        resultado = num1/num2;
                        System.out.println("La división es: " + resultado);
                    }catch(ArithmeticException e){
                        System.out.println("ERROR. No se puede dividir entre 0");
                    }
                }
                
                case 5 -> System.out.println("Saliendo del programa");
                
                default -> System.out.println("Elige una de las opciones, numeros del 1 al 5");
            }
            
        }while(opcion != 5);
   
            
    }
    
}
