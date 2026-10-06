package tema3ejercicio18;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio18 {

    public static void main(String[] args) {
        int contraseña, intentos=3, contraseñaCorrecta=1714;//declaro las variables e inicializo las necesarias
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        do{//creo un bucle
            System.out.print("Introduce la contraseña :");
            contraseña = entrada.nextInt();//pregunto por la contraseña y la almaceno en la variable
            
            if(contraseña==contraseñaCorrecta){//si la contraseña es correcta lo imprimo por pantalla
                System.out.println("La contraseña es correcta");
                
            }else{//si la contraseña no es correcta se restara 1 a intentos e immprimira que la contraseña es incorrecta y los intentos que le quedan al usuario
                intentos--;
                System.out.println("La contraseña es incorrecta, te quedan " + intentos + " intentos");
            }
  
        }while(intentos>0 && contraseñaCorrecta!=contraseña);//el bucle se repetira siempre que los intentos sean mayores que 0 y que la contraseña puesta sea distinta a la establecida
        if(contraseña==contraseñaCorrecta){
            System.out.println("Enhorabuena acceso permitido");//si la contraseña es correcta se te dará la enhorabuena
          
        }else{
            System.out.println("Acceso denegado");//si la contraseña es incorrecta se te denegara el acceso
        }
        
        

        
    }
    
}
