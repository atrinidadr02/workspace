package tema5ejercicio16;

public class Alumno {
    //Atributos
   private String nombre;
   private double nota;
   
   
   //Constructores
   public Alumno(){
       nombre = "";
       nota = 0;
   }
   
   public Alumno(String n, double no){
       nombre = n;
       nota = no;
   }
   
   
   //Getters y Setters
   public String getNombre(){
       return nombre;
   }
   public double getNota(){
       return nota;
   }
   
   public void setNombre(String n){
       nombre = n;
   }
   public void setNota(double no){
       nota = no;
   }
   
   
   //Mostrar y toString
   public void mostrarAlumno(){
       System.out.println("Nombre: " + nombre);
       System.out.println("Nota: " + nota);
   }
   
   @Override
   public String toString(){
       return "Nombre: " + nombre + " y nota: " + nota;
   }
}
