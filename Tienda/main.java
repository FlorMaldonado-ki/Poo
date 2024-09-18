import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Random rand=new Random();

        String nombre;
        double precio;
        int stock, res=0, cantidad=0, id, idModificador, op;
        Stock stockc = new Stock();


        while(res!=4) {

            System.out.println("");
            System.out.println("¿Qué desea realizar?");
            System.out.println("1. Agregar un producto.");
            System.out.println("2. Modificar el stock.");
            System.out.println("3. Ver lista de productos.");
            System.out.println("4. Salir.");
            res = leer.nextInt();
            Producto producto=new Producto("",0,0);

                switch (res) {

                    case 1:
                        System.out.println("--------------------");
                        System.out.print("Ingrese el nombre del producto: ");
                        nombre = leer.next();
                        if(nombre.isEmpty()) {
                            System.out.println("El nombre no puede estar vacio");
                            break;
                        }
                        System.out.print("Ingrese el precio del producto: ");
                        precio = leer.nextDouble();
                        if(precio<0){
                            System.out.println("El precio no puede ser negativo");
                            break;
                        }
                        System.out.print("Ingrese el stock del producto: ");
                        stock = leer.nextInt();
                        if(stock<0){
                            System.out.println("El stock no puede ser negativo");
                            break;
                        }
                        producto.setstock(stock);
                        producto.setnombre(nombre);
                        producto.setprecio(precio);
                        producto.setid(id=rand.nextInt(1, 10001));

                        stockc.RegistrarProducto(producto);
                        System.out.println("Se ha registrado el producto correctamente");
                        break;

                    case 2:
                        System.out.println("1. Aumentar el stock.");
                        System.out.println("2. Reducir el stock.");
                        op=leer.nextInt();
                        switch(op) {
                            case 1:
                                System.out.println("-------------------");
                                System.out.print("Ingrese el ID del producto al que requiere aumentar el stock: ");
                                idModificador = leer.nextInt();
                                System.out.print("Ingrese el la cantidad a agregar al stock del producto: ");
                                cantidad = leer.nextInt();
                                producto.AumentarStock(producto, cantidad, idModificador);
                                break;

                            case 2:
                                System.out.println("---------------------");
                                System.out.print("Ingrese el ID del producto al que requiere reducir el stock: ");
                                id = leer.nextInt();
                                System.out.print("Ingrese la cantidad a reducir del stock:");
                                cantidad = leer.nextInt();
                                producto.ReducirStock(cantidad, id);
                                stockc.MostrarProductos();
                                break;

                            default:
                                System.out.println("Opción invalida");
                        }
                        break;

                    case 3:
                        stockc.MostrarProductos();
                        break;
                    default:
                        System.out.println("¡Lindo día!");
                }
        }

    }

}