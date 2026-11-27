package tema5ejercicio19;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();
        
        pedirYMostrar(empleado1);
        pedirYMostrar(empleado2);
        pedirYMostrar(empleado3);
    }
    
    public static void pedirYMostrar(Empleado e){
        e.setNombre(pedirNombre());
        e.setHorasTrabajo(pedirHoras());
        e.setTarifa(pedirTarifa());
        calcularYMostrarSalario(e);
    }
    
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre: ");
        return entrada.nextLine();
    }
    
    public static int pedirHoras(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce las horas de trabajo: ");
        return entrada.nextInt();
    }
    
    public static int pedirTarifa(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la tarifa normal: ");
        return entrada.nextInt();
    }
    
    public static void calcularYMostrarSalario(Empleado e){
        double salario, horas, tarifa;
        
        tarifa = e.getTarifa();
        horas = e.getHorasTrabajo();
        if(horas <= 40){
            salario = horas * tarifa;
        }else{
            salario = 40 * tarifa;
            salario = salario + ((horas-40) * (tarifa*1.5));
        }
        
        System.out.println(e.getNombre() + " trabaja " + e.getHorasTrabajo() + " con una tarifa normal de " + e.getTarifa() + " por lo que cobra " + salario + "€");
    }
}