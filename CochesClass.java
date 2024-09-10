public class Coche {

    String marca;
    String modelo;
    int año;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
        public void MostrarInfo() {

            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Año: " + año);

        }

        public void CalcularEdadDelCoche()
        {
            int añoA=2024;
            int edad=añoA-año;
            System.out.println("Este carro tiene: "+edad+" años.");
        }
}
