package tema5ejercicio1;

public class Test {
    
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        miCoche.establecerMarca("Seat");
        miCoche.establecerModelo("Ibiza");
        miCoche.establecerColor("Rojo");

        cochePadre.establecerMarca("BMW");
        cochePadre.establecerModelo("X3");
        cochePadre.establecerColor("Gris");

        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();

        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }

        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }

        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }

        cochePadre.apagarCoche();

        System.out.println("ESTADO DE MI COCHE:");
        miCoche.obtenerEstado();

        System.out.println("----------------------");
                
        System.out.println("ESTADO DE COCHE PADRE:");
        cochePadre.obtenerEstado();        
    }
    
}
