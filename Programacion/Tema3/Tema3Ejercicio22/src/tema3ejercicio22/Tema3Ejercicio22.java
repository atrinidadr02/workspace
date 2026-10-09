package tema3ejercicio22;

import java.util.Scanner;//importo el Scanner
import java.util.InputMismatchException;//importo el Mismatch

public class Tema3Ejercicio22 {

    public static void main(String[] args) {
        double num1=0, num2=0, resultado=0;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        try{
            System.out.println("Introduce un número");
            num1 = entrada.nextInt();
            System.out.println("Introduce otro número");
            num2 = entrada.nextInt();//preguntamos al usuario que número quiere y le damos ese valor a las variables
            resultado = num1+num2;//realizo la operacion
            
        }catch(InputMismatchException e){
            System.out.println("No se puede introducir letras");
            resultado=0;//si se introduce un 0, dira que se debe introducir otro número y le dara a la operación el resultado de 0
        }finally{
            System.out.println("El resultado de sumar " + num1 + " mas " + num2 + " es: " + resultado);//imprimo el resultado
        }
        
    }
    
}
