package tema4ejercicio12;

import java.util.Scanner;//importo el Scanner

public class PedirContrasenia {
    public static int pedirContrasenia(){//creo el metodo que solicita la contraseña
        int contrasenia;
        Scanner entrada = new Scanner(System.in);//creo la variable y el Scanner
        
        System.out.print("Introduce la contraseña: ");
        contrasenia = entrada.nextInt();//pido la contraseña y la almaceno
        
        return contrasenia;//devuelvo la contraseña para que otro metodo la utilice
    }
        
}
