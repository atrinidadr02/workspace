package tema5ejercicio05;

public class Asignatura {
//Atributos
    private String nombre;
    private double nota;
    
//Constructores
    public Asignatura(String n, int nt) {
        nombre = n;
        nota = nt;
    }
    public Asignatura(){
        nombre = "";
        nota = 0;
    }
    public Asignatura(String n){
        nota = 0;
        nombre = n;              
    }
    
//Getters y Setters
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public double getNota(){
        return nota;
    }
    
    public void setNota(double nt){
        nota = nt;
    }
    
//Mostrar y toString
    public void mostrarDatos() {
        System.out.println("Asignatura: " + nombre + ", nota: " + nota);
    }

    @Override
    public String toString() {
        return "Asignatura: nombre = " + nombre + " y nota = " + nota + "]";
    }
}
