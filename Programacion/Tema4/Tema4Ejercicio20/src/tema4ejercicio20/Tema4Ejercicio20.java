package tema4ejercicio20;

import java.util.Scanner;

public class Tema4Ejercicio20 {
    
    public static String capitalEspaña = "Madrid";
    public static String descubridorAmerica = "Cristobal Colón";//declaro las costantes

    public static void main(String[] args) {
        int nota=0;
        boolean comprobacion;//declaro las variables
        
        comprobacion=comprobarCapital(preguntarCapital());//llamo al metodo que comprueba la preguta de la capital
        
        if(comprobacion==true){
            nota=nota+5;
        }//si la respuesta es correcta sumo 5 a la nota
        
        
        comprobacion=comprobarDescubridor(preguntarDescubridor());//llamo al metodo que comprueba la preguta del conquistador
       
        if(comprobacion==true){
           nota=nota+5;
        }//si la respuesta es correcta sumo 5 a la nota
        
        System.out.println("Tu nota final es: " + nota);//imprimo la nota final
    }
    
    public static String preguntarCapital(){//creo un metodo que pregunta la capital al  usuario
        Scanner entrada = new Scanner(System.in);
        String capitalUsuario;//declaro las variables y el Scanner
        
        System.out.println("¿Cual es la capital de España?");
        capitalUsuario = entrada.nextLine();//pregunto al usuario la capital y la almaceno
        
        return capitalUsuario;//devuelvo el resultado
    }
    
    public static String preguntarDescubridor(){//creo un metodo que pregunte el descubridor al usuario
        Scanner entrada = new Scanner(System.in);
        String descubridorUsuario;//declaro las variables y el Scanner
        
        System.out.println("¿Quien fue el descubridor de America?");
        descubridorUsuario = entrada.nextLine();//pregunto al usuario el descubridor y lo almaceno
        
        return descubridorUsuario;//devuelvo el resultado
    }
    
    public static boolean comprobarCapital(String capitalUsuario){//creo un metodo que compruebe la respuesta de la capital
        boolean igual;
        String capital = capitalUsuario;//declaro las variables
        
        igual = capital.equalsIgnoreCase(capitalEspaña);//comparo las respuestas
        
        if(igual == true){
            System.out.println("Respuesta correcta");
        }else{
            System.out.println("Respuesta incorrecta. La respuesta correcta es: " + capitalEspaña);
        }//doy la solución que sea correcta si no la ha acertado
        return igual;//devuelvo el resultado
    }
    
    public static boolean comprobarDescubridor(String descubridorUsuario){//creo un metodo que compruebe la respuesta del descubridor
        boolean igual2;
        String descubridor = descubridorUsuario;//declaro las variables
        
        igual2 = descubridor.equalsIgnoreCase(descubridorAmerica);//comparo las respuestas
        
        if(igual2 == true){
            System.out.println("Respuesta correcta");
        }else{
            System.out.println("Respuesta incorrecta. La respuesta correcta es: " + descubridorAmerica);
        }//doy la solución que sea correcta si no la ha acertado
        return igual2;//devuelvo el resultado
    }
       
}
