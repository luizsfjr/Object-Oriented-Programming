package poo_bcc2018_aula02;

public class Triangulo {
    
    private double a;
    private double b;
    private double c;
    
    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double area() {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
