import jdk.jfr.Category;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar categorías");
            System.out.println("5. Mostrar categorías con sus productos");
            System.out.println("6. Registrar categoría");
            System.out.println("7. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            categoria Categoria =new categoria("");
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (inventario.validarExistenciaDeCategorias() == false) {

                        System.out.println("");
                        System.out.println("No existen categorías en en el sistema.");
                        break;

                    }
                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    System.out.println("Ingresa el nombre del producto");
                    String nombre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el precio del producto");
                    double precio = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.println("Ingresa la descripción del producto");
                    String descripcion = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el ID de la categoria en la cual registrarás el producto: ");
                    int IDcategoria = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingresa el stock del producto");
                    int stock = scanner.nextInt();

                    System.out.println(nombre);

                    Producto producto = new Producto(nombre, precio, descripcion, IDcategoria, stock);
                    inventario.registrarProducto(producto);

                    System.out.println("\nProducto registrado correctamente");
                    break;
                case 2:
                    System.out.println("\nSeleccionaste la opción para eliminar un producto");

                    System.out.println("Ingresa el ID del producto: ");
                    int id = scanner.nextInt();
                    inventario.eliminarProducto(id);
                    break;
                case 3:
                    inventario.mostrarProductos();
                    break;
                case 4:
                    inventario.MostrarDatosSimple();
                    break;
                case 5:
                    inventario.MostrarDatosCompleto();
                    break;
                case 6:
                    System.out.println("");
                    System.out.println("Seleccionaste la opción para registrar una categoria");

                    System.out.print("Ingresa el nombre de la categoria: ");
                    String nombreCategoria = scanner.nextLine();

                    Categoria.setnombreCategoria(nombreCategoria);
                    inventario.registrarCategoria(Categoria);
                    System.out.println("Categoría registrada correctamente");
                    break;

                case 7:
                    System.out.println("Hasta luego");
                    return;
            }

        }
    }
}
