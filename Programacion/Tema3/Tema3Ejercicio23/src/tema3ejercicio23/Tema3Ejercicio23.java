package tema3ejercicio23;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio23 {

    public static void main(String[] args) {
        int num, aux;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        do{//inicio el bucle
            System.out.println("Indicame un número mayor que 1: ");
            num = entrada.nextInt();//pregunto al usuario un numero y lo almaceno en la variable
 
        }while(num<1);//repetire el bucle siempre que el numero que importe el usuario sea menor que 1
        
        System.out.println("Los numeros entre 1 y " + num + " son: ");//imprimo por pantalla lo que vamos a hacer
        
        for(aux=1; aux<=num; aux++){//creo el bucle e impongo la condición
             System.out.println(aux);//imprimp por pantalla los resultados
        }
        
        
    }
    
}
