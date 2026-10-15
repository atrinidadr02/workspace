package tema3ejercicio30;

import java.util.Scanner;//importo el Scanner
import java.util.InputMismatchException;//importo el Mismatch

public class Tema3Ejercicio30 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int num = 0, numAleatorio, intentos=0;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo el Scanner
        numAleatorio  = (int)(Math.random()*100+1);//doy un valor aleatorio entre 1 y 100 a la variable
        
        
        System.out.println("Dime números e intenta adivinar el número que ha pensado el programa, te ire diciendo si es mayor o menor.");
        //explico un poco al usuario de que va el programa
        do{//inicio el bucle
            
            try{
                System.out.println("¿Que numero crees que es?");
                num = entrada.nextInt();//pregunto por el numero y lo pongo en la variable
            

            }catch(InputMismatchException e){
                System.out.println("No puedes introducir letras, deben ser numeros");
                num=0;
            }
            if(num>numAleatorio){
            System.out.println("El número es menor.");
            intentos++;//si el numero es mayor, indico que es menor y sumo 1 a los intentos
            }else if(num<numAleatorio){
            System.out.println("El numero es mayor.");
            intentos++;//si el numero es menor, indico que es mayor y sumo 1 a los intentos
            }else{
            System.out.println("Correcto, el número es " + numAleatorio);
            System.out.println("Has intentado adivinar el numero " + intentos + " veces.");
             }//si se acierta el numero lo digo y imprimo por pantalla el numero de intentos utilizados
            
            
        }while(num != numAleatorio);//repetire el bucle mientras que no se acierte el numero
        
     
    }
    
}
