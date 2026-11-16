package pruebaclase;

public class Bicicleta {
    
    //Atributos
    private String marca;
    private String color;
    private String talla;
    private int anios;
    private Propietario propietario; //Composición de clases

    //Método
    //Gettes/Setters
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String m){
        marca = m;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        marca = c;
    }
    
    public String getTalla(){
        return talla;
    }
    
    public void setTalla(String t){
        marca = t;
    }
    
    public int getAnios(){
        return anios;
    }
    
    public void setAnios(int a){
        anios = a;
    }
    
    public Propietario getPropietario(){
        return propietario;
    }
    
    public void setPropietario(Propietario p){
        propietario = p;
    }
    
    
    //Otros métodos
    public void mostrarAntiguedad(){
        if(anios > 10){
            System.out.println("La bicicleta es antigua");
        }else {
            System.out.println("La bicicleta es nueva");
        }
    }
    
    //Mostrar o toString()
    public void mostrarBicicleta(){
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Talla: " + talla);
        System.out.println("Anios; " + anios);
        propietario.mostrarPropietario();
    }
    
    @Override
    public String toString(){
        return "Marca: " + marca 
                + ", color: " + color 
                + ", talla: " + talla 
                + ", anios: " + anios;
    }
}
