import java.util.ArrayList;

public class Inventario {
    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public ArrayList<categoria> listaCategoria = new ArrayList<categoria>();

    public void registrarProducto(Producto producto) {
        for (categoria Categoria : this.listaCategoria) {
            if (Categoria.id == producto.IDcategoria) {
                Categoria.listaProductos.add(producto);
                break;
            }
        }
    }

    public void eliminarProducto(int idProductoEliminar) {
        int longitudOriginal = this.listaProductos.size(); // 3

        this.listaProductos.removeIf((producto) -> producto.getId() == idProductoEliminar);

        if (longitudOriginal != this.listaProductos.size()) {
            System.out.println("Se eliminó el producto con el ID: " + idProductoEliminar);
        } else {
            System.out.println("No existe un producto con el ID: " + idProductoEliminar);
        }
    }

    public void registrarCategoria(categoria Categoria) {

        this.listaCategoria.add(Categoria);

    }
    public void mostrarProductos() {
        System.out.println("\n*** PRODUCTOS EN EL SISTEMA ***");

        if (this.listaProductos.size() == 0) {
            System.out.println("\nNo existen productos en el sistema");
            return;
        }

        int iterador = 1;
        for (Producto producto : this.listaProductos) {
            System.out.println("\nEste es el producto: " + iterador);
            System.out.println(producto.mostrarProducto());
            iterador++;
        }
    }

    public void MostrarDatosSimple(){

        if (this.listaCategoria.isEmpty()){
            System.out.println("No hay productos en el sistema :(");
            return;
        }
        int i=1;
        for (categoria Categoria: listaCategoria) {

            System.out.println("");
            System.out.println("Clase número: "+ i);
            Categoria.MostrarCategoria();
            i++;
        }
    }

    public void MostrarDatosCompleto(){

        if (this.listaCategoria.isEmpty()){
            System.out.println("No hay productos en el sistema :(");
            return;
        }

        for(categoria Categoria: listaCategoria){

            Categoria.MostrarCategoriaCompleto();

        }
    }
    public boolean validarExistenciaDeCategorias(){

        return this.listaCategoria.size() > 0;
    }

}

