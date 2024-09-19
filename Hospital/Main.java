import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int opc=0;

        while(opc!=4){

            System.out.println("1. Registrar una consulta.");
            System.out.println("2. Registrar paciente.");
            System.out.println("3. Validar disponibilidad de consulta.");
            System.out.println("4. Salir.");
            opc=leer.nextInt();

            switch(opc){

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    System.out.println("Cuide de su salud");
                    break;

                    default:
                        System.out.println("Opción invalida");
            }
        }

    }
}
