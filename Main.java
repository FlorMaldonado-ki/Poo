

public class Main {
    public static void main(String[] args) {

        EnvioNacional envioNacional = new EnvioNacional(200.50, 10, 500);
        System.out.println(envioNacional.calcularTiempoyCostoEntrega());

        EnvioInternacional envioInternacional = new EnvioInternacional(150, 11, 3500);
        System.out.println(envioInternacional.calcularTiempoyCostoEntrega());
    }
}