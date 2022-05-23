package Modelo;

public class Cuadrilatero {
    private double Cordenadas1;
    private double Cordenadas2;
    private double Cordenadas3;
    private double Cordenadas4;

    public Cuadrilatero() {
    }

    public Cuadrilatero(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double calcularArea(double x, double y){
        double Area=x*y;
        return Area;
    }
}
