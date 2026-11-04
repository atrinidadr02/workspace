package proyectocolacarniceria;

/**
 *
 * @author Ángel Trinidad Romero
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProyectoColaCarniceria {

    public static void main(String[] args) {
        int opcion;
        int numTicket=0;
        int cantidadLote;
        int tipoLote=0;//declaro las variables
        
        do{//creo un bucle que se mantendra siempre que no se pulse la opcion de salir
            mostrarMenu();//muestro el menu
            do{//creo un bucle para que se pregunte la opcion hasta que se introduzca un número que este dentro de nuestras opciones
                opcion=preguntarOpcion();
                if(opcion<1 || opcion>4){
                    System.out.println("El número que has introducido no se encuentra entre nuestras opciones, selecciona uno válido");
                }//si el usuario introduce una opcion que no tenemos se mostrara por pantalla
            }while(opcion<1 && opcion>4);
            
            
            switch (opcion) {//creo un switch para llamar al metodo correcto según la opcion que haya seleccionado el usuario
                case 1 -> {
                    numTicket=numCompra();
                    mostrarResultado(opcion, numTicket, tipoLote);//genero el numero y lo imprimo con su correspondiente letra
                }
                case 2 -> {
                    numTicket=numCompra();
                    mostrarResultado(opcion, numTicket, tipoLote);//genero el numero y lo imprimo con su correspondiente letra
                }
                case 3 -> {
                    do{
                        tipoLote=tipoLoteTickets();//pregunto el tipo de lote 
                    }while(tipoLote!=1 && tipoLote!=2);
                    
                    do{
                        cantidadLote=cantidadLoteTickets();//pregunto la cantidad de tickets del lote
                    }while((cantidadLote%2)!=0);

                    for(int i=1; i<=cantidadLote; i++){//creo un bucle que imprimira todos los tickets necesarios
                        numTicket=numCompra();
                        mostrarLote(opcion, numTicket, tipoLote);
                    }
                }
                
            }
        }while(opcion!=4);
        
        mostrarResultado(opcion, numTicket, tipoLote);//una vez el usuario pulse 4 para salir del programa, se llama a mostrar reltado para que muestre la despedida del programa
        }
    

    public static void mostrarMenu(){//Creo un metodo que muestra el menu de opciones
        System.out.println("-MENU DE OPCIONES-");
        System.out.println("1-Comprar");    
        System.out.println("2-Recoger");
        System.out.println("3-Generar lote de tickets");
        System.out.println("4-Salir");

    }
    
    public static int preguntarOpcion(){//Creo un metodo que pregunta la opcion
        int opcion;
        Scanner entrada = new Scanner(System.in);//declaro las variables y creo el Scanner
        
        try{
            System.out.println("Introduce el número con la opción que desees: ");
            opcion = entrada.nextInt();//pregunto la opcion y la almaceno
            
        }catch(InputMismatchException e){
            System.out.println("No se puede introducir letras, se te cerrara el programa");
            opcion=4;//se comprobara que no se haya introducido una letra y si es así se cerrara el programa
        }
        
        return opcion;//devuelvo el resultado
        
    }
    
    public static int numCompra(){//creo un metodo que genera el número de la compra
        int ticketCompra;//declaro la variable
        
        ticketCompra = (int ) (Math.random()*100 + 1);//le doy un valor aleatorio
        
        return ticketCompra;//devuelvo el numero
    }
    
    public static int numRecogida(){//creo un metodo que genera el número de la recogida
        int ticketRecogida;//declaro la variable
        
        ticketRecogida = (int ) (Math.random()*100 + 1);//le doy un valor aleatorio
        
        return ticketRecogida;//devuelvo el numero
    }
    
    public static int tipoLoteTickets(){//creo un metodo para preguntar el tipo de lote de tickets
        int opcion;
        Scanner entrada = new Scanner(System.in);//creo la variable y el Scanner
        
        System.out.println("¿Qué tipo de tickets quieres generar?");
        System.out.println("Pulse 1 si desea generar un lote de tickets para comprar");
        System.out.println("Pulse 2 si desea generar un lote de tickets para recoger");
        opcion=entrada.nextInt();//muestro las opciones y la almaceno
        
        return opcion;//devuelco el resultado
    }
    
    public static int cantidadLoteTickets(){//creo un metodo para preguntar la cantidad de tickets del lote
        int cantidad;
        Scanner entrada = new Scanner(System.in);//creo la variable y el Scanner
        
        do{
            System.out.println("Ahora introduce que cantidad de ticekts quieres en el lote, debe ser un número par");
            cantidad=entrada.nextInt();//Pregunto la cantidad de tickets que quiera hasra que sean pares con un bucle
            
        }while((cantidad%2)!=0);
        
        return cantidad;//devuelco el resultado
    }
    
    public static void mostrarResultado(int opcion, int numTicket, int tipoLote){//creo un metodo que mostrara el resultado de 3 opciones
        switch (opcion) {//mediante un switch detecto que tipo de ticket ha seleccionado el usuario y se lo imprimo o le doy una despedida si ha seleccionado salir
            case 1 -> {
                System.out.println("Su ticket de compra es C-" + numTicket);
            }
            case 2 -> {
                System.out.println("Su ticket de recogida es R-" + numTicket);
            }
        
            case 4 -> {
                System.out.println("Gracias por obtener tu ticket, espere su turno");
                
                
            }
        }
    }
    
    public static void mostrarLote(int opcion, int numTicket, int tipoLote){//creo un metodo que muestra el resultado si es un lote
        System.out.println("LOTE DE TICKETS");
        if(tipoLote==1){
            System.out.println("Su ticket de compra es C-" + numTicket);
        }else if(tipoLote==2){
            System.out.println("Su ticket de recogida es R-" + numTicket);
        }//según la opción muestro tickets de compra o de recogida
    }
    
}
