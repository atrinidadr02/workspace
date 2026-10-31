package tema4ejercicio17;

import java.util.Scanner;
import java.util.Random;//importo el Scanner y el Random

public class Tema4Ejercicio17 {

    public static void main(String[] args) {
        char letraSecreta;//declaro la variable
        
        letraSecreta = generarLetraAleatoria();//genero la letra aleatoria

        
        System.out.println("Intenta adivinar la letra.");
        
        
        jugar(letraSecreta);//llamo al metodo que juega la partida

    }

    public static char generarLetraAleatoria() {//creo el metodo que genera la letra aleatorio
        int codigoAscii;
        Random random = new Random();//creo la variable y el Random
        
        
        codigoAscii = random.nextInt(26) + 97;//el rango va de 97 a 122 incluyendo amos
        return (char) codigoAscii;//devuelvo el codigo ascii de la letra que se genera
    }

    public static void jugar(char letraSecreta) {//creo el metodo que hace el juego del programa
        Scanner entrada = new Scanner(System.in);
        int intentos = 0;
        char letraUsuario;
        boolean adivinado = false;//creo las variables y el Scanner

        while (!adivinado) {//creo un bucle que repite el programa mientras no se haya adivinado la letra
            System.out.print("Introduce una letra: ");//se solicita al usuario una letra
            letraUsuario = entrada.nextLine().charAt(0);//se pasa la letra al valor del codigo ascii
            intentos++;//se suma el primer intento
            
            if (letraUsuario == letraSecreta) {
                System.out.println("Felicidades! Has adivinado la letra correcta.");
                System.out.println("Numero de intentos necesarios: " + intentos);
                adivinado = true;//si el usuario acierta la letra, se muestra por pantalla ademas del numero de intentos utilizados
            } else if (letraUsuario < letraSecreta) {
                System.out.println("La letra que tienes que adivinar esta despues en el alfabeto.");
                //si la letra esta despues, se le dice al usuario que su letra viene despues 
            } else {
                System.out.println("La letra que tienes que adivinar esta antes en el alfabeto.");
                //si la letra esta antes, se le dice al usuario que su letra es anterior
            }
        }
    }
    
}
