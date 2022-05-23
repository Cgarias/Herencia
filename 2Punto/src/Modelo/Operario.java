package Modelo;

public class Operario extends Empleado {

    public Operario() {
    }

    public Operario(String Nombre) {
        super(Nombre);
    }
    
    @Override
    public String toString() {
        return super.toString() + " -> " + "Operario";
    }    
    
}
