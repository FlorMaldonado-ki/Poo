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

}
