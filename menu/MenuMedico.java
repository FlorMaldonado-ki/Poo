package menu;

import hospital.Hospital;
import usuarios.medicos.Medico;

import java.util.Scanner;

public class MenuMedico {

    private Scanner leer = new Scanner(System.in);

    public int mostrarMenu() {

            System.out.println("\n----SISTEMA DEL HOSPITAL----\n");
            System.out.println("1. Ver mi información personal.");
            System.out.println("2. Ver mis consultas actuales.");
            System.out.println("3. Ver mis pacientes");
            System.out.println("4. Consultar paciente.");
            System.out.println("5. Consular historial o expediente de paciente.");
            System.out.println("6. Actualizar consulta.");
            System.out.println("7. Salir");
            int opc = leer.nextInt();
            return opc;
    }

    public void procesarDatosMenu(int opc, Medico medico, Hospital hospital){

        switch (opc) {

            case 1:
                System.out.println("\n---------SU INFORMACIÓN PERSONAL--------\n");
                hospital.mostrarMedicoPorID(medico.getId());
                break;
            case 2:
                System.out.println("\n--------MOSTRAR SUS CONSULTAS--------\n");
                hospital.verConsultasMedico(medico.getId());
                break;

            case 3:
                System.out.println("\n--------MOSTRAR SUS PACIENTES--------\n");
                break;

            case 4:
                System.out.println("\n---------MOSTRAR PACIENTE------------\n");
                System.out.print("Ingresa el ID del paciente al que se desea buscar: ");
                String idBuscarPaciente = leer.next();
                hospital.mostrarPacientePorID(idBuscarPaciente);
                break;

            case 5:

                break;
            case 6:

                break;
            case 7:
                System.out.println("\nSaliendo...\n");
                break;

            default:
                System.out.println("\nOpción inválida. Intente de nuevo.\n");
        }
    }
}
