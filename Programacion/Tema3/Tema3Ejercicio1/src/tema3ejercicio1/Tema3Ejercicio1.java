package tema3ejercicio1;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio1 {

    public static void main(String[] args) {
        int num;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
       
        System.out.println("Escribe un numero: ");
        num = entrada.nextInt();//pregunto al usuario el número y le doy valor a la variable
        
        if(num < 0){
            System.out.println(num + " es negativo.");
        }
        
        else {
            System.out.println(num + " es positivo");
        /**hago una condición en la que si num es menor que 0, imprima en pantalla que es negativo
         * y si num no es menor que 0, imprima en pantalla que es positivo
         */
                
        }
    }
    
}
