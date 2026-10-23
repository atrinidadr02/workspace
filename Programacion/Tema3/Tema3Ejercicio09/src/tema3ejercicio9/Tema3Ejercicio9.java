package tema3ejercicio9;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio9 {

    public static void main(String[] args) {
        int num1, num2, num3, num4, aux;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        System.out.println("Por favor, introduzca el cuarto numero: ");
        num4 = entrada.nextInt();
        //pido al usuario que me de los cuatro números y les doy el valor a cada variable
        
        
        if (num1>num2){
            aux=num1;
            num1=num2;
            num2=aux;              
        }
        if (num2>num3){
            aux=num2;
            num2=num3;
            num3=aux;
        }
        if (num3>num4){
            aux=num3;
            num3=num4;
            num4=aux;
        }
        //mediante el metodo de la burbuja, muevo siemrpre que sea mayor que el siguiente, el primer número una posición a la derecha
  
        
        if (num1>num2){
            aux=num1;
            num1=num2;
            num2=aux;
        }
        if (num2>num3){
            aux=num2;
            num2=num3;
            num3=aux;
        }
        //mediante el metodo de la burbuja, muevo siemrpre que sea mayor que el siguiente, el segundo número una posición a la derecha
        
        if (num1>num2){
            aux=num1;
            num1=num2;
            num2=aux;
        }
        //mediante el número de la burbuja coloco el tercer número en ultima posición, siempre que sea mayor que este, así acabaran todos colocados
        
        
        System.out.println("El orden de los numeros introducidos es " + num1 + " - " + num2 + " - " + num3 + " - " + num4 + ".");
    }   //imprimo por pantalla los números de forma ordenada
    
}
