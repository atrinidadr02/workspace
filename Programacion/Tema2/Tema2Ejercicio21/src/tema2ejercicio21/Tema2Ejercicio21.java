package tema2ejercicio21;

import java.util.Scanner; //Importamos Scanner

public class Tema2Ejercicio21 {

    public static void main(String[] args) {
        int tiempo;
        int segundos;
        int minutos;
        int horas;
        int dias;
        int restoSegundos; //Creo las variables que necesitare
        Scanner entrada = new Scanner(System.in); //Creo un Scanner
    
        System.out.println("Introduzca un numero de segundos: "); //Pregunto los segundos que quiere
        tiempo = entrada.nextInt(); //Doy valor a la varible tiempo con el numero que he escrito
      
        
        dias = tiempo / 86400; 
        horas = (tiempo % 86400)/3600;
        restoSegundos = (tiempo % 86400) % 3600;
        minutos = restoSegundos / 60;
        segundos = restoSegundos % 60; // Doy valor a las variables
        
        System.out.print(tiempo + " segundos hacen un total de: "+ dias + (" dias ") + horas + " horas y " + minutos + " minutos y " + segundos + " segundos.");
                
        
        
    
    }
    
}
