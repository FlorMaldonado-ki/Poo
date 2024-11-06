
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);

        System.out.print("Ingresar nombre del producto: ");
        String nombre= leer.next();

        if(!productoIvalidoException(nombre)){
            throw new Exception("productoIvalidoException");
        }
        System.out.print("Ingresar precio del producto: ");
        double precio= leer.nextDouble();

        if(!precioInvalidoException(precio)){
            throw new Exception("precioInvalidoException");
        }

        System.out.print("Ingresar cantidad del producto: ");
        int cantidad= leer.nextInt();

        if(!cantidadInvalidaException(cantidad)){
            throw new Exception("cantidadInvalidaException");
        }

        Producto producto= new Producto(nombre, precio, cantidad);

        System.out.println(producto.mostrarDetalles());
    }

    public static boolean productoIvalidoException(String nombre){

        if (nombre == null || nombre.isEmpty()){
            return false;
        }
        return true;
    }

    public static boolean precioInvalidoException (Double precio){

        if (precio <= 0){
            return false;
        }
        return true;
    }

    public static boolean cantidadInvalidaException (int cantidad){

        if (cantidad < 0){
            return false;
        }
        return true;
    }
}