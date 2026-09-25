package tema2ejercicio24;

import java.util.Scanner;

public class Tema2Ejercicio24 {

    public static void main(String[] args) {
        float notaPr;
        float notaLm;
        float notaBd;
        float notaEd;
        float notaSi;
        float notaFol;
        float media;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca la nota de Programacion: ");
        notaPr = entrada.nextFloat ();
        
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        notaLm = entrada.nextFloat ();
        
        System.out.println("Introduzca la nota de Bases de Datos: ");
        notaBd = entrada.nextFloat ();
        
        System.out.println("Por favor, introduzca la nota de Entornos de Desarrollo: ");
        notaEd = entrada.nextFloat ();
        
        System.out.println("Por favor, introduzca la nota de Sistemas Informaticos: ");
        notaSi = entrada.nextFloat ();
        
        System.out.println("Por favor, introduzca la nota de Formacion y Orientacion Laboral: ");
        notaFol = entrada.nextFloat ();
        
        media = (notaPr + notaLm + notaBd + notaEd + notaSi + notaFol)/6;
        System.out.println("Tu nota media del curso es de " + media);

        
    }
    
}
