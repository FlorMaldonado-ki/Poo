package menu;

import hospital.Hospital;
import usuarios.pacientes.Paciente;

import java.util.Scanner;

public class MenuPaciente {

    private Scanner leer = new Scanner(System.in);

    public int mostrarMenu() {

            System.out.println("\n----SISTEMA DEL HOSPITAL----\n");
            System.out.println("1. Ver mis consultas.");
            System.out.println("2. Ver mi infomación personal.");
            System.out.println("3. Salir");
            int opc = leer.nextInt();
            return opc;

    }
    public void procesarDatosMenu(int opc, Paciente paciente, Hospital hospital){

            switch (opc) {
                case 1:
                    System.out.println("\n--------MOSTRAR CONSULTAS--------\n");
                    hospital.verConsultasPaciente(paciente.getId());
                    break;

                case 2:
                    System.out.println("\n---------SU INFORMACIÓN PERSONAL--------\n");
                    hospital.mostrarPacientePorID(paciente.getId());
                    break;

                case 3:
                    System.out.println("\nSaliendo...\n");
                    break;

                default:
                    System.out.println("Opción invalida. Intenta de nuevo.");
            }
        }
}
