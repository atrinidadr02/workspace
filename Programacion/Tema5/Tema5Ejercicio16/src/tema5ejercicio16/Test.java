package tema5ejercicio16;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        
        pedirYMostrar(alumno1);
        pedirYMostrar(alumno2);
        pedirYMostrar(alumno3);
        
    }
    
    public static void pedirYMostrar(Alumno a){
        a.setNombre(pedirNombre());
        a.setNota(pedirNota());
        calcularCalificacion(a);
    }
    
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        return entrada.nextLine();      
    }
    
    public static double pedirNota(){
        Scanner entrada = new Scanner(System.in);
        double nota;
        
        do{
            System.out.println("Introduce la nota: ");
            nota = entrada.nextDouble();
            
            if(nota > 10 || nota < 0){
                System.out.println("Nota no valida, introduce una nota entre 0 y 10");
            }
        }while(nota > 10 || nota < 0);
        
        return nota;
    }
    
    public static void calcularCalificacion(Alumno a){
        double nota = a.getNota();
        
        if(nota<5){
            System.out.println(a.getNombre() + " ha sacado un " + nota + " por lo que es un suspenso");
        }else if(nota<7 ){
            System.out.println(a.getNombre() + " ha sacado un " + nota + " por lo que es un bien");
        }else if(nota<9){
            System.out.println(a.getNombre() + " ha sacado un " + nota + " por lo que es un notable");
        }else if(nota<=10){
            System.out.println(a.getNombre() + " ha sacado un " + nota + " por lo que es un sobresaliente");
        }
    }
    
}
