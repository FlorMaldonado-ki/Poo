
public class Producto {

    private String nombre;
    private double precio;
    private int stock=0;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public Producto(String nombre, double precio) {

        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
    }

    public String getnombre() {
        return nombre;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public double getprecio() {
        return precio;
    }
    public void setprecio(double precio) {
        this.precio = precio;
    }
    public int getstock() {
        return stock;
    }
    public void setstock(int stock) {
        this.stock = stock;
    }
    public void AumentarStock(int cantidad, int i) {

        if (cantidad > 0) {
            this.stock = cantidad;
            System.out.println("Se ha modificado el stock del producto " + i);
        }
        else {
            System.out.println("El stock no puede ser negativo");
        }
    }
    public void ReducirStock(int cantidad, int i) {

        if (cantidad > 0 && cantidad > this.stock) {
            this.stock = cantidad;
            System.out.println("Se ha modificado el stock del producto " + i);
        }
        else {
            System.out.println("El stock no puede ser negativo y tiene que ser mayor que el stock ya registrado");
        }
    }

    public void MostrarProducto() {

            System.out.println("Nombre del producto: " + getnombre());
            System.out.println("Precio: " + getprecio());
            System.out.println("Stock actual: " + getstock());
        }
}
