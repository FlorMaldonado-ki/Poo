import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);

        Hotel hotel= new Hotel();
        int opcion=0;

        while(opcion!=4) {

            System.out.println("\n--- SISTEMA DE RESERVAS DE HABITACIONES --- ");
            System.out.println("\n1. Mostrar detalles de las habitaciones.");
            System.out.println("2. Realizar reserva");
            System.out.println("3. Liberar una habitación.");
            System.out.println("4. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion=leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n  ---- MOSTRAR HABITACIONES ----");
                    hotel.mostrarHabitaciones();
                    break;

                case 2:
                    System.out.println("\n  ---- REALIZAR RESERVA ----");
                    System.out.print("Ingresa el ID de la habitación que desea reservar: ");
                    leer.nextLine();
                    String id=leer.nextLine();
                    System.out.print("Ingresa la cantidad de noches que desea reservar: ");
                    int noches=leer.nextInt();
                    System.out.println("El total es de: $"+hotel.reservar(noches, id));

                    break;
                case 3:
                    System.out.println("\n  ---- LIBERAR HABITACIÓN ---- ");
                    System.out.print("Ingresar el ID de la habitación que desea liberar: ");
                    leer.nextLine();
                    id=leer.nextLine();
                    hotel.liberar(id);
                    break;
                case 4:
                    System.out.println("Vuelva pronto");
                    break;
            }
        }
    }
}