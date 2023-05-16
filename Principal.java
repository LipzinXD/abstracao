public class Principal {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();

        circulo.setRaio(10);
        System.out.println(circulo.calculaArea());

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(10);
        triangulo.setAltura(15);
        System.out.println(triangulo.calculaArea());

        Quadrado quadrado = new Quadrado();
        quadrado.setLado1(10);
        quadrado.setLado2(10);
        System.out.println(quadrado.calculaArea());
    }
}
