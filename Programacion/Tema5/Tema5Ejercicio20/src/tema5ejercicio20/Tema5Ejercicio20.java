package tema5ejercicio20;

public class Tema5Ejercicio20 {

    public static void main(String[] args) {
        int opcion=0;
        
        mostrarMenu();
        ejecutarOpcion(opcion);
    }
    
    public static void mostrarMenu(){
        System.out.println("--- MENU DE OPCIONES ---");
        System.out.println("  1-Crear cuenta vacía");
        System.out.println("  2-Crear cuenta con saldo inicial");
        System.out.println("  3-Ingresar dinero");
        System.out.println("  4-Retirar dinero");
        System.out.println("  5-Ver saldo");
        System.out.println("  6-Salir");
    }
    
    public static void ejecutarOpcion(int opcion){
        switch(opcion){
            case 1:
                Cuenta cuenta1 = new Cuenta();
                break;
            case 2:
                Cuenta cuenta2 = new Cuenta(cuenta2.ingresar());
                break;
                
                
        }
    }
    
}
