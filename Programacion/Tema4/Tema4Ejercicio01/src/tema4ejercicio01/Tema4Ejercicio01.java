package tema4ejercicio01;

import java.util.Scanner;//importo el Scanner

public class Tema4Ejercicio01 {
        
    public static void compruebaPosNeg(int num){//creo el metodo que comprobara si es positivo o negativo
        if(num<0){
            System.out.println("El numero es " + num + " negativo");
        }else{
            System.out.println("El numero es " + num + " positivo");
        }//creo una condición para que imprima el resultado correcto
        
    }

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);//declaro variables y creo el Scanner
        
        System.out.println("Por favor, introduzca un número: ");
        numero = entrada.nextInt();//solicito el número y le doy el valor a la variable
        
        compruebaPosNeg(numero);//llamo al metodo que hace la comprobación y imprime por pantalla el resultado 
        
    }
    
}
