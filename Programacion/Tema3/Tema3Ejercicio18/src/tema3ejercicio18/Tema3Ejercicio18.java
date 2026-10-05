package tema3ejercicio18;

import java.util.Scanner;

public class Tema3Ejercicio18 {

    public static void main(String[] args) {
        int contraseña, intentos=3, contraseñaCorrecta=1714;
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.print("Introduce la contraseña :");
            contraseña = entrada.nextInt();
            
            if(contraseña==contraseñaCorrecta){
                System.out.println("La contraseña es correcta");
                
            }else{
                intentos--;
                System.out.println("La contraseña es incorrecta, te quedan " + intentos + " intentos");
            }
  
        }while(intentos>0 && contraseñaCorrecta!=contraseña);
        if(contraseña==contraseñaCorrecta){
            System.out.println("Enhorabuena acceso permitido");
          
        }else{
            System.out.println("Acceso denegado");
        }
        
        

        
    }
    
}
