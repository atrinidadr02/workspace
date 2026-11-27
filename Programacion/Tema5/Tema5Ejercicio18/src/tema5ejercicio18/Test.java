package tema5ejercicio18;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.print("Introduce el primer número: ");
        Numero num1 = new Numero(entrada.nextInt());

        System.out.print("Introduce el segundo número: ");
        Numero num2 = new Numero(entrada.nextInt());


        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            ejecutarOpcion(opcion, num1, num2);
        } while (opcion != 5);
    }

    public static void mostrarMenu() {
        System.out.println("--- MENÚ DE OPERACIONES ---");
        System.out.println("1.- Sumar los números.");
        System.out.println("2.- Restar los números.");
        System.out.println("3.- Multiplicar los números.");
        System.out.println("4.- Dividir los números.");
        System.out.println("5.- Salir del programa.");
        System.out.print("Elige una opción: ");
    }


    public static void ejecutarOpcion(int opcion, Numero n1, Numero n2) {
        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + (n1.getValor() + n2.getValor()));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + (n1.getValor() - n2.getValor()));
                break;
            case 3:
                System.out.println("Resultado de la multiplicación: " + (n1.getValor() * n2.getValor()));
                break;
            case 4:
                try {
                    int division = n1.getValor() / n2.getValor();
                    System.out.println("Resultado de la división: " + division);
                } catch (ArithmeticException e) {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Elige entre 1 y 5.");
        }
    }
}
