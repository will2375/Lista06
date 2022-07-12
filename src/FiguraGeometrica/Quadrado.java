package FiguraGeometrica;

public class Quadrado implements FiguraGeometrica {

    public double lado;

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
