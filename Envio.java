

public abstract class Envio {

    private double costoBase;
    private double peso;
    private int distanciaKm;

    public Envio(double costoBase, double peso, int distanciaKm) {
        this.costoBase = costoBase;
        this.peso = peso;
        this.distanciaKm = distanciaKm;
    }

    public abstract String calcularTiempoyCostoEntrega();


    public void validarPeso(){

        if (peso <= 0) {
            System.out.println("Peso inválido.");
        }
    }

    public double getCostoBase() {
        return costoBase;
    }

    public double getPeso() {
        return peso;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }

}
