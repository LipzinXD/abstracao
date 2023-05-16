public class Circulo extends Forma {

    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

}
