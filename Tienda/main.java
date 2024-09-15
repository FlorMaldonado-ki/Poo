import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Random rand=new Random();

        String nombre;
        double precio;
        int stock, res=0, cantidad=0;

        while(res!=5) {

            System.out.println("¿Qué desea realizar?");
            System.out.println("1. Agregar un producto.");
            System.out.println("2. Aumentar el stock.");
            System.out.println("3. Reducir el stock.");
            System.out.println("4. Ver lista de productos.");
            System.out.println("5. Salir.");
            res = leer.nextInt();

                switch (res) {

                    case 1:
                        Producto producto = new Producto();
                        System.out.print("Ingrese el nombre del producto: ");
                        nombre = leer.next();
                        System.out.print("Ingrese el precio del producto: ");
                        precio = leer.nextDouble();
                        if(precio<0){
                            System.out.println("El precio no puede ser negativo");
                        }
                        else {
                            producto.setprecio(precio);
                        }
                        System.out.print("Ingrese el stock del producto: ");
                        stock = leer.nextInt();
                        if(stock<0){
                            System.out.println("El stock no puede ser negativo");
                        }
                        else {
                            producto.setstock(stock);
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese el nombre del producto al que le quiere aumentar el stock: ");
                        nombre=leer.next();



                        break;
                    case 3:
                        System.out.print("Ingrese la posición del producto al que le quiere reducir el stock: ");



                        System.out.print("Ingrese la nueva cantidad del stock:");
                        cantidad=leer.nextInt();
                        System.out.print("Ingrese la posición del producto a modificar: ");
                        int i= leer.nextInt();
                        Producto.AumentarStock(cantidad, i);
                        Producto.MostrarProductos();
                        break;
                    case 4:
                        Producto.MostrarProductos();
                    default:
                        System.out.println("Opción inválida.");
                }
        }

    }

}
