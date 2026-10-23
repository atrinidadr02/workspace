package tema4ejercicio13;

import static tema4ejercicio13.PedirNumero.pedirNumero;

public class ComprobarNumero {
    public static boolean comprobarNumero(){
        boolean mayor;
        int num;
        
        num = pedirNumero();
        if(num>1){
            mayor=true;
            return mayor;
        }else{
            mayor=false;
            return mayor;
        }
    }
        
}
