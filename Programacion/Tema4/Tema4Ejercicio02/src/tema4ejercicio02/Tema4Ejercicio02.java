package tema4ejercicio02;

import java.util.Scanner;//importo el Scanner

public class Tema4Ejercicio02 {

    public static void main(String[] args) {
        double num1, num2;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Introduce un numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Introduce un segundo numero: ");
        num2 = entrada.nextDouble();//pregunto por los números y le doy valor a cada variable
        
        if (num1 > 10){//creo una condicional, segun el valor del numero que se introduzca llamara a un metodo u a otro
            Multiplicacion.multiplicacion(num1, num2);//llamo a la clase que tiene el metodo que los multiplica
        }
        else{
            Suma.suma(num1, num2);//llamo a la clase que tiene el metodo que los suma
           
        }//cada metodo se encuentra en una clase distinta
        
    }
    
}
