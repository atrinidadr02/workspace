package tema3ejercicio21;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio21 {

    public static void main(String[] args) {
        double num1, num2, resultado;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Introduce un número");
        num1 = entrada.nextInt();
        System.out.println("Introduce otro número");
        num2 = entrada.nextDouble();//preguntamos al usuario que número quiere y le damos ese valor a las variables
        
        try{
            resultado = num1/num2;//realizo la operacion
            
        }catch(ArithmeticException e){
            System.out.println("El número que has introducido no es válido, no puede ser 0");
            resultado=0;//si se introduce un 0, dira que se debe introducir otro número y le dara a la operación el resultado de 0
        }
        
        System.out.println("El resultado de divir " + num1 + " entre " + num2 + " es: " + resultado);//imprimo el resultado
    }
    
}
