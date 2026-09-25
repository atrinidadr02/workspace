/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caritmetica2;

/**
 *
 * @author alumno
 */
public class CAritmetica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato1; //Doy el valor de 20 al dato 1
        int dato2;
        int dato3, resultado;
        
        dato1 = 20;
        dato2 = 10;
        dato3 = 5;
        
        //Suma
        resultado = dato1 + dato2 + dato3; 
        System.out.println(dato1 + "+" + dato2 + "+" + dato3 + "=" + resultado);
        
        //resta
        resultado = dato1 - dato2 - dato3;
        System.out.println(dato1 + "-" + dato2 + "-" + dato3 + "=" + resultado);
        
        //multiplicacion
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + "*" + dato2 + "*" + dato3 + "=" + resultado);
        
        //division
        resultado = dato1 / dato2 / dato3;
        System.out.println(dato1 + "/" + dato2 + "/" + dato3 + "=" + resultado);
    }
    
}
