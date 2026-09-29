package tema3ejercicio3;

import java.util.Scanner;

public class Tema3Ejercicio3 {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Por favor, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Por favor, introduzca un tercer numero: ");
        num3 = entrada.nextInt();
        
        if (num1 > num2){
            if (num1 > num3){
                System.out.println("El numero mayor de los introducidos es: " + num1);
            }
            else{
                System.out.println("El numero mayor de los introducidos es: " + num3);
        
            }
        }
        else if (num2 > num3){ 
            System.out.println("El numero mayor de los introducidos es: " + num2);
            
            
        }
    }
        
    
}
