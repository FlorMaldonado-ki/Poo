import java.util.ArrayList;

public class Producto {
    ArrayList<Producto> listaProductos=new ArrayList<>();
    private String nombre;
    private double precio;
    private int stock=0;

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
    public void RegistrarProducto(Producto producto) {
        this.listaProductos.add(producto);
    }

    public void AumentarStock(int cantidad, int i) {

        listaProductos.get(i);
        this.stock = cantidad;
        System.out.println("Se ha modificado el stock del producto "+ i);
    }
    public void MostrarProductos() {

        if (listaProductos.size() == 0) {
            System.out.println("No hay productos en la tienda :(");
            return;
        }

        for (Producto Producto : this.listaProductos){

            System.out.println("Nombre del producto: "+Producto.getnombre());
            System.out.println("Precio: "+Producto.getprecio());
            System.out.println("Stock actual: "+Producto.getstock());

        }

    }
}

