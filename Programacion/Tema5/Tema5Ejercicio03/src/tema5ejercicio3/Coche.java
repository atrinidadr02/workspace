package tema5ejercicio3;

public class Coche {   
//Atributos
    private String marca;
    private String modelo;
    private Rueda ruedas;
    
//Gettes y Settes
    public String getMarca(){
        return marca;
    }
    public void setMarca(String m){
        marca = m;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String mo){
        modelo = mo;
    }
    
    public Rueda getRuedas(){
        return ruedas;
    }
    public void setRuedas(Rueda r){
        ruedas = r;
    }
    
//Mostrar y to String    
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Material ruedas: " + ruedas.getMaterial());
        System.out.println("Pulgadas ruedas: " + ruedas.getPulgadas());
    }

    @Override
    public String toString() {
        return "Coche: marca = " + marca + ", modelo = " + modelo + ". " + ruedas;
    }    
}
