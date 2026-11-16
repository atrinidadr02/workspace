package organizacionevento;

import java.util.InputMismatchException;
import java.util.Scanner;//importo el Scanner y el control de excepciones

public class OrganizacionEvento {
    public static double PI = 3.1416;//declaro la constante PI
    
    public static void main(String[] args) {
        int opcion;
        int asistentes, numeroGrupos;
        int actuacion1, actuacion2, actuacion3;
        double radio, superficie;//declaro las variables
        
        do{
            mostrarMenu();
            opcion = preguntarOpcion();
            if(opcion<1 || opcion>4){
                System.out.println("Opción no valida");//muestro el menu con un bucle y si se introduce una opcion no valida doy un mensaje de aviso
            }
            switch(opcion){//creo el menu con un switch para que se realice lo que el usuario desee
                case 1 -> {
                    asistentes = preguntarAsistentes();//le doy el valor a asistentes con el número que introduzca el usuario
                    numeroGrupos = distribuirAsistentes(asistentes);//doy valor con el número de personas por grupo
                    mostrarResultadoGrupos(numeroGrupos, asistentes);//muestro el resultado
                }
                case 2 -> {
                    System.out.println("Primera actuación");
                    actuacion1=preguntarDuracion();
                    System.out.println("Segunda actuación");
                    actuacion2=preguntarDuracion();
                    System.out.println("Tercera actuación");
                    actuacion3=preguntarDuracion();//almaceno las 3 duraciones de los 3 eventos
                    
                    mostrarActuaciones(actuacion1, actuacion2, actuacion3);//ordeno y muestro el resultado
                    
                }
                case 3 -> {
                    radio = preguntarRadio();//almaceno el valor del radio
                    superficie = calcularSuperficie(radio);//calculo la superficie con el valor del radio
                    System.out.println("La superficie del escenario son " + superficie + " metros cuadrados.");//muestro por pantalla el resultado
                }
                case 4 -> {
                    System.out.println("Gracias por utilizar el programa");//doy un mensaje de despedida cuando el usuario desea salirse
                }
            }
        }while(opcion!=4);//repito esto hasta que el usuario desee salirse y pulse 4
    }
    
    public static void mostrarMenu(){//creo el metodo que muestra el menu
        System.out.println("MENU DE OPCIONES");
        System.out.println("1-Distribuidor de asistentes");
        System.out.println("2-Organizador de horarios");
        System.out.println("3-Calculador de superficie del escenario");
        System.out.println("4-Salir");       
    }
    
    public static int preguntarOpcion(){//creo el metodo que pregunta la opcion al usuario
        int opcion;
        Scanner entrada = new Scanner(System.in);//creo las variables y el Scanner
        
        try{
            System.out.println("Seleccione la opción que desee: ");
            opcion = entrada.nextInt();
        }catch(InputMismatchException e){//creo una excepcion, si el usuario introduce una letra en vez de un número selecciona directamente la opcion de salir
            System.out.println("Dato introducido no valido, no se puede introducir letras");
            System.out.println("Cerrando programa");
            opcion = 4;
        }

        return opcion;        
    }
    
    public static int preguntarAsistentes(){//creo un metodo para preguntar los asistentes
        Scanner entrada = new Scanner(System.in);
        int asistentes;//creo las variables y el Scanner
        
        System.out.println("Introduce el número de asistentes del evento");
        asistentes = entrada.nextInt();//pregunto al usuario y le doy valor a la variable
        
        return asistentes;//devuelvo el resultado
    }
    
    public static int distribuirAsistentes(int asistentes){//creo un metodo para distribuir a los asistentes en grupos
        int resto=1;
        int i=2;
        int numeroGrupos;//creo las variables
        
        while(resto!=0 && i<asistentes){//creo un bucle que buscara entre que número se podra dividir
            resto=asistentes%i;
            if(resto!=0){
                i = i+1;
            }
            
    
        }
        if(resto==0){//si se pueden hacer grupos calculo de cuanto es el grupo
            numeroGrupos=asistentes/i;
        }else{
            numeroGrupos=asistentes;
        }
        return numeroGrupos;
    }
    
    public static void mostrarResultadoGrupos(int numeroGrupos, int asistentes){//creo un metodo para mostrar el resultado
        if(numeroGrupos!=asistentes){//dependiendo de si es posible hacer rupos o no se muestra una respuesta 
            System.out.println("Se deberá dividir los " + asistentes + " asistentes en grupos de " + numeroGrupos + " asistentes.");
        }else{
            System.out.println("Los " + asistentes + " no se pueden divir en grupos sin que sobre ninguna persona");
        }
    }
    
    public static int preguntarDuracion(){//creo un metodo para preguntar la duracion de las actuaciones
        Scanner entrada = new Scanner(System.in);
        int duracion;//creo las variables y el Scanner
        
        System.out.println("Introduce la duración en minutos");
        duracion = entrada.nextInt();//pregunto al usuario y le doy valor a la variable
        
        return duracion;//devuelvo el resultado
    }
    
    public static void mostrarActuaciones(int actuacion1, int actuacion2, int actuacion3){
        int auxiliar;//declaro la variable para ayudarme a ordenarlo
        
        if(actuacion1>actuacion2){
            auxiliar=actuacion1;
            actuacion1=actuacion2;
            actuacion2=auxiliar;
        }else if(actuacion2>actuacion3){
            auxiliar=actuacion2;
            actuacion2=actuacion3;
            actuacion3=auxiliar;
        }else if(actuacion1>actuacion2){
            auxiliar=actuacion1;
            actuacion1=actuacion2;
            actuacion2=auxiliar;
        }//mediante el metodo de la burbuja ordeno los resultados
        System.out.println("El orden de duración de menor a mayor es " + actuacion1 + " minutos, " + actuacion2 + " minutos y " + actuacion3 + " minutos");
    }
    
    public static double preguntarRadio(){//creo un metodo para preguntar el radio
        double radio;
        Scanner entrada = new Scanner(System.in);//creo las variables y el Scanner
        
        System.out.println("Introduce el radio del escenario en metros");
        radio = entrada.nextInt();//pregunto al usuario y le doy valor a la variable
        
        return radio;//devuelvo el resultado
    }
    
    public static double calcularSuperficie(double radio){//creo un metodo para calcular la superficie
        double superficie;//declaro la variable
        
        superficie = PI * (radio * radio);//hago el calculo
        
        return superficie;//devuelvo el resultado
    }
    
}
