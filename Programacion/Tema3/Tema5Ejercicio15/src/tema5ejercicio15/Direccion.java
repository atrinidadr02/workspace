package tema5ejercicio15;

public class Direccion {
    //Atributos
    private String calle;
    private int numero;
    private String piso;
    private String ciudad;
    
    //Constructores
    public Direccion(){
        calle = "";
        numero = 0;
        piso = "";
        ciudad = "";
    }
    public Direccion(String c, int n, String p, String ci){
        calle = c;
        numero = n;
        piso = p;
        ciudad = ci;
    }
    
    //Getters y Setters
    public String getCalle(){
        return calle;
    }
    public int getNumero(){
        return numero;
    }
    public String getPiso(){
        return piso;
    }
    public String getCiudad(){
        return ciudad;
    }
    
    public void setCalle(String c){
        calle = c;
    }
    public void setNumero(int n){
        numero = n;
    }
    public void setPiso(String p){
        piso = p;
    }
    public void setCiudad(String ci){
        ciudad = ci;
    }
    
    //Mostrar y toString
    public void mostrarDireccion(){
        System.out.println("Calle: " + calle + ", piso: " + piso + ", número: " + numero + " y ciudad: " + ciudad);
    }
    
    @Override
    public String toString(){
        return "Calle: " + calle + ", piso: " + piso + ", número: " + numero + " y ciudad: " + ciudad;
    }
}
