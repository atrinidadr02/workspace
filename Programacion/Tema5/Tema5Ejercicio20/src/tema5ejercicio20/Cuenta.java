package tema5ejercicio20;

import java.util.Scanner;

public class Cuenta {
    //Atributo
    private double saldo;
    
    //Constructores
    public Cuenta(){
        saldo = 0;
    }
    public Cuenta(double s){
        saldo = s;
    }
    
    //Getters y Setters
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double s){
        saldo = s;
    }
    
    //Otros métodos
    public double ingresar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la cantidad de dinero que desea ingresar: ");
        saldo = saldo + entrada.nextDouble();
        return saldo;
    }
    public double retirar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la cantidad de dinero que desea retirar: ");        
        saldo = saldo - entrada.nextDouble();
        return saldo;
    }
    
    //Mostrar y toString
    public void mostrarSaldo(){
        System.out.println("Saldo: " + saldo);
    }
    @Override
    public String toString(){
        return "Saldo: " + saldo;
    }
}
