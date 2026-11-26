package tema5ejercicio15;

public class Test {

    public static void main(String[] args) {
        Direccion direccion1 = new Direccion();
        Direccion direccion2 = new Direccion();
        Direccion direccion3 = new Direccion();
        
        
        direccion1.setCalle("Calle Olivo Solo");
        direccion1.setCiudad("Mirabel");
        direccion1.setNumero(10);
        direccion1.setPiso("3A");
        
        direccion2.setCalle("Calle Virgen de la Jarrera");
        direccion2.setCiudad("Mirabel");
        direccion2.setNumero(19);
        direccion2.setPiso("2B");
        
        direccion3.setCalle("Calle la Estación");
        direccion3.setCiudad("Mirabel");
        direccion3.setNumero(5);
        direccion3.setPiso("1C");
        
        
        
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();
        
        empleado1.setNombre("Paco Martín Corrales");
        empleado1.setSalario(1780);
        empleado1.setDireccion(direccion1);
        
        empleado2.setNombre("María Cano Grande");
        empleado2.setSalario(1900);
        empleado2.setDireccion(direccion2);
        
        empleado3.setNombre("Juan Espada Trinidad");
        empleado3.setSalario(1590);
        empleado3.setDireccion(direccion3);
        
        
        System.out.println("EMPLEADO 1:");
        empleado1.mostrarEmpleado();
        System.out.println("EMPLEADO 2:");
        empleado2.mostrarEmpleado();
        System.out.println("EMPLEADO 3:");
        System.out.println(empleado3.toString());
        
    }
    
}
