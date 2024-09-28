package ex42;

public class Retangulo extends FiguraGeometrica{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
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
