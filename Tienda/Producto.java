import java.util.ArrayList;

public class Producto {

    private String nombre;
    private double precio;
    private int stock=0, id, idModificador;

    ArrayList<Producto>listaProductos=new ArrayList<>(Producto);

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
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public void AumentarStock(Producto producto, int cantidad, int idModificador) {

        if (cantidad > 0 && this.stock + cantidad> this.stock) {

            if(this.listaProductos(producto).getid() == idModificador){
                setstock(cantidad + this.stock);
                System.out.println("Se ha modificado el stock del producto que tiene el ID: " + id);
                System.out.println("El nuevo stock del producto es " + getstock());
            }
            else{
                System.out.println("No hay un producto con esa ID");
            }
        }
        else {
            System.out.println("El stock no puede ser negativo");
        }
    }

    public void ReducirStock(int cantidad, int id) {

        if (cantidad > 0 && this.stock - cantidad < this.stock) {

            setstock(this.stock-cantidad);
            System.out.println("Se ha modificado el stock del producto " + id);
            System.out.println("El nuevo stock del producto "+ getnombre() + " es " + getstock());
        }
        else {
            System.out.println("El stock no puede ser negativo y tiene que ser mayor que el stock ya registrado");
        }
    }

    public void MostrarProducto() {

            System.out.println("ID: " + getid());
            System.out.println("Nombre del producto: " + getnombre());
            System.out.println("Precio: " + getprecio());
            System.out.println("Stock actual: " + getstock());
        }
}
