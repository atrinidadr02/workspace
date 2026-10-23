package tema4ejercicio13;

import static tema4ejercicio13.ComprobarNumero.comprobarNumero;
import static tema4ejercicio13.PedirNumero.pedirNumero;

public class Tema4Ejercicio13 {

    public static void main(String[] args) {
        boolean resultado;
        int num;
        
        do{
            resultado = comprobarNumero();
            if(resultado==false){
                System.out.println("Error, debes introducir un numero mayor que 1");
            }
            
        }while(resultado==false);
        
        num = pedirNumero();
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
        
    }
    
}
