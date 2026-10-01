package tema3ejercicio5;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio5 {

    public static void main(String[] args) {
        int num, resultado;//declaro las variables
        Scanner entrada = new Scanner(System.in);//içcreo un nuevo Scanner
        
        System.out.println("Por favor, introduzca un numero entero: ");
        num = entrada.nextInt();//pregunto por un número entero y doy ese valor a la variable
        
        resultado = num % 2;//hago el módulo 2 del número y le doy ese valor a la variable resultado
        if(resultado == 1){
            System.out.println("El numero " + num + " es impar");
        }//si el resultado es 1, el número será impar y lo imprimo en pantalla
        
        else{
            System.out.println("El numero " + num + " es par");
        }//si el resultado es 0, el número será par y lo imprimo en pantalla
    }
    
}
