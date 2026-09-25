/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caritmetica;

/**
 *
 * @author alumno
 */
public class CAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato1; //Doy el valor de 20 al dato 1
        int dato2, resultado;
        
        dato1 = 20;
        dato2 = 10;
        
        //Suma
        resultado = dato1 + dato2; 
        System.out.println(dato1 + "+" + dato2 + "=" + resultado);
        
        //resta
        resultado = dato1 - dato2;
        System.out.println(dato1 + "-" + dato2 + "=" + resultado);
        
        //multiplicacion
        resultado = dato1 * dato2;
        System.out.println(dato1 + "*" + dato2 + "=" + resultado);
        
        //division
        resultado = dato1 / dato2;
        System.out.println(dato1 + "/" + dato2 + "=" + resultado);
        
        
    }
    
}
