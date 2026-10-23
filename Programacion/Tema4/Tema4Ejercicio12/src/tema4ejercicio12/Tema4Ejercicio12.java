package tema4ejercicio12;

import static tema4ejercicio12.ComprobarContrasenia.comprobarContrasenia;//importo la clase que comprueba si la contraseña es correcta

public class Tema4Ejercicio12 {

    public static void main(String[] args) {
        int intentos = 3;
        boolean resultado;//declaro las variables e inicializo la que cuenta los intentos
        
        do{//creo un bucle que se repetira hasta que la contraseña sea correcta o no se superen los 3 intentos
            resultado = comprobarContrasenia();//llamo al metodo que comprueba si la contraseña es correcta o no
            if(resultado == false){
                --intentos;
                System.out.println("Contraseña incorrecta, te quedan " + intentos + " intentos");
            }
            
        }while(intentos>0 && resultado == false);//las condiciones para que el bucle siga repitiendose
        
        if(resultado == true){//si la contraseña es correcta lo imprime por pantalla
            System.out.println("Correcto, contraseña correcta!!");
        }else{//si la contraseña es incorrecta y se han superado el numero de 3 intentos imprime que le acceso ha sido denegado
            System.out.println("Erorr, acceso denegado");
        }
        
    }
    
}
