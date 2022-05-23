package Modelo;

public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public EmpleadoAsalariado(String Nombre, String Apellido, String numeroSeguroSocial, double salarioSemanal) {
        super(Nombre, Apellido, numeroSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal < 0.0 ? 0.0 : salarioSemanal;
    }

    public double ingresos() {
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return String.format("empleado asalariado: %s\n%s: $%,.2f",
                super.toString(), "salario semanal", getSalarioSemanal());
    }
}
