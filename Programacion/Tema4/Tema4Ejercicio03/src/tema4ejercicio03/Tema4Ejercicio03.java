package tema4ejercicio03;

import java.util.Scanner;//importo el Scanner
import comprobar.Mayor;//importo el paquete y la clase

public class Tema4Ejercicio03 {

    public static void main(String[] args) {
        double num1, num2, num3;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Por favor, introduzca un numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Por favor, introduzca un segundo numero: ");
        num2 = entrada.nextDouble();
        System.out.println("Por favor, introduzca un tercer numero: ");
        num3 = entrada.nextDouble();//pregunto por los números y le doy valor a cada variable
        
        Mayor.comprobar(num1, num2, num3);//llamo a la clase que tiene el metodo que dice cual es el mayor
    }
    
}
