package tema4ejercicio12;

import java.util.Scanner;//importo el Scanner

public class Tema4Ejercicio12 {
    public static int contraseña = 1234;//declaro la constante de la contraseña
    public static void main(String[] args) {
        int contraseñaUsuario;
        boolean resultado;
        int intentos=2;//declaro las variables
        do{
            contraseñaUsuario=pedirContraseña();
        
            resultado=comprobarContraseña(contraseñaUsuario);
        
            mostrarResultado(resultado, intentos);
            intentos--;
        }while(intentos>=0 && !resultado);//creo un bucle para contabilizar el número de intentos de los subprogramas
        
        if(intentos>=0){
            System.out.println("ACCESO PERMITIDO");
        }else{
            System.out.println("ACCESO DENEGADO, SUPERASTE EL NÚMERO DE INTENTOS");
        }//doy un mensaje según el resultado
    }
    
    public static int pedirContraseña(){//creo un metodo para pedir la contraseña
        int contraseñaUsuario;
        Scanner entrada = new Scanner(System.in);//declaro las variables
        
        System.out.println("Introduce la contraseña: ");
        contraseñaUsuario = entrada.nextInt();//pregunto y doy valor a la variable
        
        return contraseñaUsuario;//devuelvo la contraseña del usuario
    }
    
    public static boolean comprobarContraseña(int contraseñaUsuario){//creo un metodo para comprobar la contraseña
        boolean resultado=false;//declaro la variable 
        
        if(contraseñaUsuario == contraseña){
            resultado=true;
        }else{//doy true o false según si la contraseña esta bien o no
            
        }
        return resultado;//devuelvo el resultado
    }
    
    public static void mostrarResultado(boolean resultado, int intentos){//creo un metodo para mostrar el resultado
        if(resultado==true){
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta, te quedan " + intentos + " intentos");
        }
        
    }
}
