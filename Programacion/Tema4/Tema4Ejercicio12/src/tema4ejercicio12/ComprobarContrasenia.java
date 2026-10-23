package tema4ejercicio12;

import static tema4ejercicio12.PedirContrasenia.pedirContrasenia;//importo la clase que pide la contraseña

public class ComprobarContrasenia {
    public static boolean comprobarContrasenia(){//creo el metodo que comprueba si la contraseña es correcta o no
        int contraseniaCorrecta = 1234;
        int contrasenia;
        boolean resultado;//declaro las variables y asigno la contraseña correcta
        
        
        contrasenia = pedirContrasenia();//llamo al metodo que solicita la contraseña al usuario
        if(contrasenia == contraseniaCorrecta){
            resultado = true;
            return resultado;//si la contraseña es correcta devuelvo que es correcta para que otro metodo lo utilice
        }else{
            resultado = false;
            return resultado;//si la contraseña es incorrecta devuelvo que es incorrecta para que otro metodo lo utilice.
            
        }
    }
}

