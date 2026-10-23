
package tema4ejercicio09;

import java.util.Scanner;//importo el Scanner

public class PedirNumeros {

    public static int pedirNumeros(){//Creo el metodo que pide y almacena los numeros
        int num;
        Scanner entrada = new Scanner(System.in);//declaro la variable y creo el Scanner
        
        System.out.println("Indicame un número: ");
        num = entrada.nextInt();//pregunto por un numero y lo almaceno
        
        return num;//devuelvo el valor del numero
        
    }
}
