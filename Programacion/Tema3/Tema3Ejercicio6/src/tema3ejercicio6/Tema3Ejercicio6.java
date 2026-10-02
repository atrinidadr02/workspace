package tema3ejercicio6;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio6 {

    public static void main(String[] args) {
        double nota;//declaro la variable
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Introduzca su nota: ");
        nota = entrada.nextDouble();//pido que se introduzca la nota y le doy ese valor a la variable
        
        if (nota >= 9 && nota <= 10){
            System.out.println("Tu nota es un sobresaliente");
        }
        
        else if (nota >= 7 && nota < 9){
            System.out.println("Tu nota es un notable");
        }
        
        else if (nota >= 5 && nota < 7){
            System.out.println("Tu nota es un bien");
        }
        
        else if (nota >= 0 && nota < 5){
            System.out.println("Tu nota es un suspenso");
        }
        
        else{
            System.out.println("La nota introducida no es valida, debe estar entre 0 y 10.");
        /*comparo el valor con las notas que diferencian si será sobresaliente, notabl etc
        si no entra dentro de esas notas, dirá que no es valida la nota introducida
        */    
        }
    }
    
}
