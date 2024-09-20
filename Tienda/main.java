import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Random rand=new Random();

        String nombre;
        double precio;
        int stock, res=0, cantidad=0, cantidadR, i, op;
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

            leer.nextLine();

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
                        leer.nextLine();
                        if(precio<0){
                            System.out.println("El precio no puede ser negativo");
                            break;
                        }
                        System.out.print("Ingrese el stock del producto: ");
                        stock = leer.nextInt();
                        producto.setstock(stock);
                        leer.nextLine();
                        if(stock<0){
                            System.out.println("El stock no puede ser negativo");
                            break;
                        }
                        producto.setstock(stock);
                        producto.setnombre(nombre);
                        producto.setprecio(precio);

                        stockc.RegistrarProducto(producto);
                        System.out.println("Se ha registrado el producto correctamente");
                        break;

                    case 2:
                        System.out.println("1. Aumentar el stock.");
                        System.out.println("2. Reducir el stock.");
                        op=leer.nextInt();
                        leer.nextLine();
                        switch(op) {
                            case 1:
                                System.out.println("-------------------");
                                System.out.print("Ingrese el nombre del producto al que requiere aumentar el stock: ");
                                nombre= leer.next();
                                leer.nextLine();
                                System.out.print("Ingrese la cantidad a agregar al stock del producto: ");
                                cantidad = leer.nextInt();
                                leer.nextLine();
                                stockc.AumentarStock(cantidad, nombre);
                                break;

                            case 2:
                                System.out.println("---------------------");
                                System.out.print("Ingrese el nombre del producto al que requiere reducir el stock: ");
                                nombre= leer.next();
                                System.out.print("Ingrese la cantidad a reducir del stock del producto:");
                                cantidadR = leer.nextInt();
                                leer.nextLine();
                                stockc.ReducirStock(cantidadR, nombre);
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