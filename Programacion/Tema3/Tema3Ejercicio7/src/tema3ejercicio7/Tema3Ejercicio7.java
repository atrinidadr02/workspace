package tema3ejercicio7;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio7 {
    
    public static void main(String[] args) {
        int diasemana;
        boolean laborable = false;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Dime el numero de un dia de la semana y te dire si es laborable o no: ");
        diasemana = entrada.nextInt();//pregunto al usuario por un número y le doy ese valor a la variable
        
        switch(diasemana){
            case 1:
            case 2: 
            case 3: 
            case 4:
            case 5:laborable = true;
                break;//hago que se almacene true en boolean si el número introducido esta entre el 1 y el 5
            case 6:
            case 7:laborable = false;
                break;//hago que se almacene false en boolean si el número introducido es el 6 o el 7          
        }
        
        if (diasemana >=1 && diasemana <= 7){
            if (laborable == true){
                System.out.println("Tu dia de la semana es laborable");//si se almacena true imprime por pantalla que es laborable
            }
            else {
                System.out.println("Tu dia de la semana no es laborable");//si se almacena false imprime por pantalla que no es laborable
            }

        }
        else{
            System.out.println("El numero que has introducido no pertenece a ningun dia de la semana, debe estar entre 1 y 7");
        }//si el número no esta entre 1 y 7 imprime que el número no es valido
    }
    
}
