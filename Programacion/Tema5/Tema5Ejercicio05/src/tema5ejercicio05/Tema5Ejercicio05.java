package tema5ejercicio05;

import java.util.Scanner;

public class Tema5Ejercicio05 {
        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Asignatura prog = new Asignatura("Programación");
        Asignatura lm = new Asignatura("Lenguaje de Marca");
        Asignatura bd = new Asignatura("Bases de Datos");
        Asignatura ed = new Asignatura("Entornos de Desarrollo");
        Asignatura si = new Asignatura("Sistemas Informáticos");
        Asignatura fol = new Asignatura("Formación y Orientación Laboral");
        
        
        System.out.println("Por favor, introduzca la nota de " + prog.getNombre() + ": ");
        prog.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de " + lm.getNombre() + ": ");
        lm.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de " + bd.getNombre() + ": ");
        bd.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de " + ed.getNombre() + ": ");
        ed.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de " + si.getNombre() + ": ");
        si.setNota(entrada.nextDouble());
        System.out.println("Por último, introduzca la nota de " + fol.getNombre() + ": ");
        fol.setNota(entrada.nextDouble());
        
        
        double media = calcularMedia(
               prog.getNota(),
                lm.getNota(),
                bd.getNota(),
                ed.getNota(),
                si.getNota(),
                fol.getNota()
                );
        
        System.out.println("La media es: " + media);
    }
    
    public static double calcularMedia(double n1, double n2, double n3, double n4, double n5, double n6){
        double media;
        
        media = (n1+n2+n3+n4+n5+n6)/6;
        return media;
    }
    
}
