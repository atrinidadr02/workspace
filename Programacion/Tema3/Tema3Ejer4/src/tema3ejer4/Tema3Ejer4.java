package Tema3Ejer4;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejer4 {

    public static void main(String[] args) {
        double num1, num2, num3;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Por favor, introduzca un numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Por favor, introduzca un segundo numero: ");
        num2 = entrada.nextDouble();
        System.out.println("Por favor, introduzca un tercer numero: ");
        num3 = entrada.nextDouble();//pregunto por los números y le doy valor a cada variable
        
        if (num1 < num2 && num1 < num3){
            System.out.println("El numero menor de los introducidos es: " + num1);  
        }/**veo que el número 1 sea menor que los otros dos, si es así, imprimo por pantalla que el número 1 será el menor
         * si no es así, paso a comprobarlo con el número 2
         */
        
        else if (num2 < num1 && num2 < num3){
            System.out.println("El numero menor de los introducidos es: " + num2);
        }/**veo que el número 2 sea menor que los otros dos, si es así, imprimo por pantalla que el número 2 será el menor
         * si no es así, paso a comprobarlo con el número 3
         */
        
        else{
            System.out.println("El numero menor de los introducidos es: " + num3);
        }//veo que el número 3 sea menor que los otros dos, si es así, imprimo por pantalla que el número 3 será el menor
    }
        
    
}