import java.util.ArrayList;

public class Stock {

    int i=1;
    ArrayList<Producto> listaProductos=new ArrayList<Producto>();

    public void RegistrarProducto(Producto producto) {
        this.listaProductos.add(producto);
    }

    public void MostrarProductos() {

        if (listaProductos.size()==0) {

            System.out.println("No hay productos en la lista :(");
        }
        else{
            i=1;
                for (Producto producto : this.listaProductos) {
                    System.out.println("-----------------------");
                    System.out.println("Este es el producto: " + i);
                    producto.MostrarProducto();
                    i++;
            }
        }
    }
    public void AumentarStock(int cantidad, String nombre) {

        for (Producto producto : this.listaProductos) {

            if (producto.getnombre().equals(nombre) && producto.getstock()+cantidad > producto.getstock()) {

                producto.setstock(producto.getstock() + cantidad);
                System.out.println("El nuevo stock de " + producto.getnombre() + " es de: " + producto.getstock());
            }
            else {
                System.out.println("El stock no puede ser negativo, tiene que ser mayor al stock ya registrado o este producto no existe.");
                System.out.println("Por favor intente de nuevo");
            }
        }
    }
    public void ReducirStock(int cantidadR, String nombre){

        for (Producto producto : this.listaProductos) {
            if (producto.getnombre().equals(nombre) && producto.getstock()-cantidadR < producto.getstock() && producto.getstock()-cantidadR >0) {

                producto.setstock(producto.getstock() - cantidadR);
                System.out.println("El nuevo stock de " + producto.getnombre() + " es de: " + producto.getstock());
            }
            else {
                System.out.println("El stock no puede ser negativo y tiene que ser menor que el stock ya registrado o el producto no existe.");
                System.out.println("Por favor intente de nuevo");
            }
        }
    }
}
