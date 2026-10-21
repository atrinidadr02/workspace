
package tema4ejercicio09;

import java.util.Scanner;

public class PedirNumeros {

    public static int pedirNumeros(){
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indicame un número: ");
        num = entrada.nextInt();
        
        return num;
        
    }
}
