package Modelo;

public class Profesor extends Persona {
    private String id;

    public Profesor() {
    }
    
    public Profesor(String Nombres, String Apellidos, String id) {
        super(Nombres, Apellidos);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Profesor de " + super.toString() + " con Id de profesor: Prof " + id;
    }
    
    
    
    
    
    
}
