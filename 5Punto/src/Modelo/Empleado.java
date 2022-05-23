package Modelo;

public class Empleado {

    private String Nombre;
    private String Apellido;
    private String numeroSeguroSocial;

    public Empleado() {
    }

    public Empleado(String Nombre, String Apellido, String numeroSeguroSocial) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    @Override
    public String toString() {
        return String.format( "%s %s\nnumero de seguro social: %s", getNombre(), getApellido(), getNumeroSeguroSocial());
    }
}
