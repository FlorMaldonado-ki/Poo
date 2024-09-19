import java.util.ArrayList;
import java.util.Random;

public class categoria {

    public int id;
    public String nombreCategoria;
    Random random=new Random();
    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public ArrayList<categoria> listaCategoria = new ArrayList<categoria>();

    public categoria(String nombre) {

        this.id = this.random.nextInt(1, 100001);
        this.nombreCategoria = nombre;

    }
    public void registrarProductoCategoria (Producto producto) {

        this.listaProductos.add(producto);
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getnombreCategoria() {
        return nombreCategoria;
    }
    public void setnombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void MostrarCategoria() {

        System.out.println("");
        System.out.println("ID de la categoria: " + getId());
        System.out.println("Nombre de la categoria: " + getnombreCategoria());

    }
    public void MostrarCategoriaCompleto(){

        System.out.println("");
        System.out.println("ID de la categoria: " + getId());
        System.out.println("Nombre de la categoria: " + getnombreCategoria());

        if(this.listaProductos.isEmpty()){

            System.out.println("");
            System.out.println("Esta categoría está vacía");
            return;
        }

        System.out.println("");
        System.out.println("Productos en el sistema:");
        for(Producto producto : this.listaProductos){

            System.out.println(producto.mostrarProducto());
        }


    }
}
