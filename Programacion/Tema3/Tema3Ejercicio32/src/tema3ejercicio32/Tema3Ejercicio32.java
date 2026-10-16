package tema3ejercicio32;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio32 {

    public static void main(String[] args) {
        int anioAct, anioNac, mesAct, mesNac, diaAct, diaNac, anios, meses, dias;
        Scanner entrada = new Scanner(System.in);//creo las variables y el Scanner
        
        System.out.println("Introduzca su año de nacimiento: ");
        anioNac = entrada.nextInt();
        System.out.println("Introduzca su mes de nacimiento: ");
        mesNac = entrada.nextInt();
        System.out.println("Introduzca su dia de nacimiento: ");
        diaNac = entrada.nextInt();//pregunto por la fecha de nacimiento y le doy el valor a las variables
        
        System.out.println("Introduzca el año actual: ");
        anioAct = entrada.nextInt();
        System.out.println("Introduzca el mes actual: ");
        mesAct = entrada.nextInt();
        System.out.println("Introduzca el dia actual: ");
        diaAct = entrada.nextInt();//pregunto por la fecha actual y le doy el valor a las variables
        
        anios = anioAct-anioNac;
        meses = mesAct-mesNac;
        dias = diaAct-diaNac;//hago las operaciones
        
        if(dias<0){//si los días son menores que 0, ajusto las cuentas
            dias = dias+30;
            meses = meses-1;
            
        }if(meses<0){//si los meses son menores que 0, ajusto las cuentas
            meses = meses+12;
            anios = anios-1;
        }
        
        System.out.println("Su edad exacta es de " + anios + " años, " + meses + " meses y " +dias);
        //imprimo por pantalla el resultado
    }
    
}
