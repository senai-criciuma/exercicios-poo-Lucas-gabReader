package ex42;

public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}
