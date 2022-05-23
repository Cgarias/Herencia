package Modelo;

public class Tecnico extends Operario {

    public Tecnico() {
    }

    public Tecnico(String Nombre) {
        super(Nombre);
    }
    
    @Override
    public String toString() {
        return super.toString() + " -> " + "Tecnico";
    }    
}
