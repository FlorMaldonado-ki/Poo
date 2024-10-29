public class EnvioNacional extends Envio {

    public EnvioNacional(double costoBase, double peso, int distanciaKm) {
        super(costoBase, peso, distanciaKm);
    }

    @Override
    public String calcularTiempoyCostoEntrega() {

        super.validarPeso();
        double costoFinal = getCostoBase();
        int dia=0;
        int km=200;
        if (super.getDistanciaKm()>=km) {
            while (super.getDistanciaKm() >= km) {

                dia++;
                km = km + 200;

            }
        }
        if (super.getPeso() > 5) {

            costoFinal=costoFinal + (costoFinal* 0.05);
        }
        String info=String.format("Costo: %.2f, Distancia: %d, Días: %d, Peso: %.2f",
                costoFinal, super.getDistanciaKm(), dia, super.getPeso());
        return info;
    }

}
