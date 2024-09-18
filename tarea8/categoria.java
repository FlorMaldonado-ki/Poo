import java.util.ArrayList;
import java.util.Random;

public class categoria {

    public int id;
    public String nombreCategoria;
    Random random=new Random();
    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public categoria(String nombre) {

        this.id = this.random.nextInt(1, 100001);
        this.nombreCategoria = nombre;

    }
    public void registrarProductoCategoria (categoria Categoria) {

        this.listaProductos.add(<Categoria);
    }
    public void MostrarDatosSimple(){

        int i=1;
        for (Producto Categoria: listaProductos) {

            System.out.println("Clase número: "+ i);
            System.out.println("ID de la categoría: "+ this.id);
            System.out.println("Nombre de la categoría:"+ this.nombreCategoria);

        }
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

}
