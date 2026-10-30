package tema4ejercicio20;

import java.util.Scanner;

public class Tema4Ejercicio20 {
    
    public static String capitalEspaña = "Madrid";
    public static String descubridorAmerica = "Cristobal Colón";

    public static void main(String[] args) {
        int nota;
        comprobarCapital(preguntarCapital());
        comprobarDescubridor(preguntarDescubridor());
        
        if(comprobarCapital)
        
        
    }
    
    public static String preguntarCapital(){
        Scanner entrada = new Scanner(System.in);
        String capitalUsuario;
        
        System.out.println("¿Cual es la capital de España?");
        capitalUsuario = entrada.nextLine();
        
        return capitalUsuario;
    }
    
    public static String preguntarDescubridor(){
        Scanner entrada = new Scanner(System.in);
        String descubridorUsuario;
        
        System.out.println("¿Quien fue el descubridor de America?");
        descubridorUsuario = entrada.nextLine();
        
        return descubridorUsuario;
    }
    
    public static int comprobarCapital(String capitalUsuario, int nota){
        boolean igual;
        String capital = capitalUsuario;
        
        igual = capital.equalsIgnoreCase(capitalEspaña);
        
        if(igual == true){
            System.out.println("Correcto");
            nota=nota+5;
        }else{
            System.out.println("Error");
        }
        return nota;
    }
    
    public static int comprobarDescubridor(String descubridorUsuario, int nota){
        boolean igual;
        String descubridor = descubridorUsuario;
        
        igual = descubridor.equalsIgnoreCase(descubridorAmerica);
        
        if(igual == true){
            System.out.println("Correcto");
            nota=nota+5;
        }else{
            System.out.println("Error");
        }
        return nota;
    }
       
}
