package pruebaclase;

public class Propietario {
    
    //Atributos
    private String nombre;
    private int edad;
    
    //Getters / Setters
    public String getNombre(){
        return nombre;
        
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public int getEdad(){
        return edad;
        
    }
    
    public void setEdad(int e){
        edad = e;
    }
    //Otros metodos
    
    //Mostrar / toString()
    public void mostrarPropietario(){
        System.out.println("Nombre propietario: " + nombre);
        System.out.println("Edad propietario: " + edad);
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + ", edad: " + edad;
    }
}
