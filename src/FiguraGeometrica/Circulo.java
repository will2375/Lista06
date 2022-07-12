package FiguraGeometrica;

public class Circulo implements FiguraGeometrica{

    double raio;

    @Override
    public double calcularArea() {

        return 3.14 *(raio *raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
