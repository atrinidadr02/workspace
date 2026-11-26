package tema5ejercicio15;

public class Empleado {
    //Atributos
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    //Constructores
    public Empleado(){
        nombre = "";
        salario = 0;
        direccion = new Direccion();
    }
    public Empleado(String n, int s, Direccion d){
        nombre = n;
        salario = s;
        direccion = d;
    }
    
    //Getters y Setters
    public String getNombre(){
        return nombre;
    }
    public int getSalario(){
        return salario;
    }
    public Direccion getDireccion(){
        return direccion;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    public void setSalario(int s){
        salario = s;
    }
    public void setDireccion(Direccion d){
        direccion = d;
    }
    
    //Mostrar y toString
    public void mostrarEmpleado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        direccion.mostrarDireccion();
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre + ", salario: " + salario + ", " + direccion.toString();
    }
}
