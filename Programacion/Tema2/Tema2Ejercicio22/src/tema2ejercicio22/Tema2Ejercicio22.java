package tema2ejercicio22;

import java.util.Scanner;

public class Tema2Ejercicio22 {

    public static void main(String[] args) {
        double lado;
        double altura;
        double area;
        double perimetro;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la medida del lado: ");
        lado = entrada.nextDouble ();
        
        System.out.println("Introduzca la medida de la altura: ");
        altura = entrada.nextDouble ();
        
        area = ((lado * altura) / 2d);
        perimetro = (3d * lado);
        
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
        
        
        
    }
    
}
