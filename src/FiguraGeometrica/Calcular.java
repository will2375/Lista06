package FiguraGeometrica;

public class Calcular {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();

        quadrado.setLado(4);
        double areaQ = quadrado.calcularArea();
        System.out.println("Lado do quadrado é " + quadrado.getLado());
        System.out.println("A area do quadrado é " + areaQ);

        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(5);
        retangulo.setBase(8);
        double areaR = retangulo.calcularArea();
        System.out.println("\nA base do retangulo é " + retangulo.getBase() + " ,A altura é de " + retangulo.getAltura());
        System.out.println("A area do retangulo é de " + areaR);

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(6);
        triangulo.setBase(9);
        double areaT = triangulo.calcularArea();
        System.out.println("\nA base do triangulo é " + triangulo.getBase() + " A altura do triangulo é " + triangulo.getAltura());
        System.out.println("A area do triangulo é " + areaT);

        Circulo circulo = new Circulo();
        circulo.setRaio(8);
        double areaC = circulo.calcularArea();
        System.out.println("\nO raio do Circulo é de " + circulo.getRaio());
        System.out.println("A area do circulo é de " + areaC);
    }
}


