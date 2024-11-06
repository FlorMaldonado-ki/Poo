public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularValorTotal(){


        double ValorTotal= this.cantidad*this.precio;
        return ValorTotal;
    }

    public String mostrarDetalles(){

        String info= String.format("Nombre del producto: %s, Precio del producto: $%.2f, " +
                "Cantidad del producto: %d, Valor total: %.2f", nombre, precio, cantidad, calcularValorTotal());
        return info;
    }


}
