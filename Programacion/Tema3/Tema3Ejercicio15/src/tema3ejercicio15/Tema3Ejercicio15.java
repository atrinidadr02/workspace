package tema3ejercicio15;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio15 {

    public static void main(String[] args) {
        int num, resultado, i;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Introduce un numero: ");//pregunto un número
        num = entrada.nextInt();//le doy el valor que introduzca a la variable num
        
        for(i=0; i<=10; i++){//creo el bucle
            resultado = num * i;//le doy valor a la variable resultado
            System.out.println(num + " * " + i + " = " +resultado);//imprimo por pantalla el rsultado
        }
        
    }
    
}
