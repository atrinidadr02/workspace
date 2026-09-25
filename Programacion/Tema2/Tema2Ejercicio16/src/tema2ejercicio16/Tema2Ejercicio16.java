package tema2ejercicio16;

public class Tema2Ejercicio16 {

    public static void main(String[] args) {
        
        int dinero = 130;//creo una variable y le doy el valor del dinero que tengo
        int billetesCincuenta;//creo una variable para los billetes de cincuenta
        int billetesDiez;//creo una variable para los billetes de diez
        
        billetesCincuenta = dinero/50;//doy el valor a los billetes de cincuenta
        billetesDiez = (dinero % 50)/10;//doy el valor a los billetes de diez
        
        System.out.println("Tienes " + billetesCincuenta + " billetes de 50 y " + billetesDiez + " billetes de 10.");
        //imprimo en pantalla el número de billetes de cincuenta y billletes de diez que tengo        
    }
    
}
