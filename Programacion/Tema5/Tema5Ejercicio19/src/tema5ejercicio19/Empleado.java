package tema5ejercicio19;

public class Empleado {
    //Atributos
    private String nombre;
    private double horasTrabajo;
    private double tarifa;
    
    //Constructores
    public Empleado(){
        nombre = "";
        horasTrabajo = 0;
        tarifa = 0;
    }
    public Empleado(String n, double ht, double t){
        nombre = n;
        horasTrabajo = ht;
        tarifa = t;
    }
    
    //Getters y Setters
    public String getNombre(){
        return nombre;
    }
    public double getHorasTrabajo(){
        return horasTrabajo;
    }
    public double getTarifa(){
        return tarifa;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    public void setHorasTrabajo(double ht){
        horasTrabajo = ht;
    }
    public void setTarifa(double t){
        tarifa = t;
    }
    
    //Mostrar y toString
    public void mostrarEmpleado(){
        System.out.println("-- EMPLEADO --");
        System.out.println("  -Nombre: " + nombre);
        System.out.println("  -Horas de trabajo: " + horasTrabajo);
        System.out.println("  -Tarifa: " + tarifa);
    }
}
