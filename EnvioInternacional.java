public class EnvioInternacional extends Envio {

    public EnvioInternacional(double costoBase, double peso, int distanciaKm) {
        super(costoBase, peso, distanciaKm);
    }

    @Override
    public String calcularTiempoyCostoEntrega(){

        double costoFinal = getCostoBase();
        int dias = 10;
        if (getPeso() > 10){

            dias=dias+3;
        }
        costoFinal=costoFinal + (costoFinal* 0.20);

        String info=String.format("Costo: %.2f, Distancia: %d, Días: %d, Peso: %.2f",
                costoFinal, super.getDistanciaKm(), dias, super.getPeso());
        return info;
    }
}
