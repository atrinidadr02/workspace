package tema4ejercicio21;

import java.util.Scanner;

public class Tema4Ejercicio21 {

    public static void main(String[] args) {

        comprobar();
        System.out.println("Los numeros pares comprendidos entre " + num1 + " y " + num2 + " son: ");
    }
    
    public static int pedirNumero(){
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        num = entrada.nextInt();
        
        return num;
    }
    
    public static void comprobar(int num1, int num2){
        
        num1=pedirNumero();
        num2=pedirNumero();
        
        if(num1>num2){
        }    
    }
    
}
