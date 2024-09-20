import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import pacientes.Paciente;
import java.util.Random;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leer=new Scanner(System.in);
        Random rand=new Random();

        String FechaHora, nombre, apellidos, fechaNac, telefono, tipoSangre, rfc;
        char sexo;
        int opc=0, piso, numeroCons;

        while(opc!=9){

            System.out.println("1. Registrar una médico.");
            System.out.println("2. Registrar paciente.");
            System.out.println("3. Registrar consultorio.");
            System.out.println("4. Registrar consulta.");
            System.out.println("5. Mostrar pacientes.");
            System.out.println("6. Mostras médicos.");
            System.out.println("7. Mostrar consultorios.");
            System.out.println("8. Mostrar consultas.");
            System.out.println("9. Salir.");
            opc=leer.nextInt();

            Consulta consulta=new Consulta();
            Hospital hospital=new Hospital();

            switch(opc) {

                case 1:
                    System.out.println("");
                    System.out.println("--------REGISTRAR MÉDICO--------");
                    System.out.print("Ingresar nombre: ");
                    nombre=leer.next();
                    System.out.print("Ingresar apellidos: ");
                    apellidos=leer.next();
                    System.out.print("Ingresar fecha de nacimiento: ");
                    fechaNac=leer.next();
                    System.out.print("Ingresar número de teléfono: ");
                    telefono=leer.next();
                    System.out.println("Ingresar RFC: ");
                    rfc=leer.next();

                    Medico medico=new Medico(nombre, apellidos, fechaNac, telefono, rfc);
                    medico.setNombre(nombre);
                    medico.setApellidos(apellidos);
                    medico.setFechaNacimiento(fechaNac);
                    medico.setTelefono(telefono);
                    medico.setRfc(rfc);
                    hospital.registrarMedico(medico);
                    System.out.println("");
                    System.out.println("Se registró un nuevo médico");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("--------REGISTRAR PACIENTE--------");
                    System.out.print("Ingresar nombre: ");
                    nombre = leer.next();
                    System.out.print("Ingresar apellidos: ");
                    apellidos = leer.next();
                    System.out.print("Ingresar fecha de nacimiento: ");
                    fechaNac = leer.next();
                    System.out.print("Ingresar tipo de sangre: ");
                    tipoSangre = leer.next();
                    System.out.print("Ingresar sexo: ");
                    sexo=(char) System.in.read();
                    System.out.print("Ingresar teléfono: ");
                    telefono = leer.next();

                    Paciente paciente = new Paciente(nombre, apellidos, fechaNac, telefono, tipoSangre, sexo);
                    hospital.registrarPaciente(paciente);
                    System.out.println("");
                    System.out.println("Se registró un nuevo paciente");
                    break;

                case 3:

                    System.out.println("");
                    System.out.println("--------REGISTRAR CONSULTORIO--------");
                    System.out.print("Ingresar piso donde se encuentra el consultorio: ");
                    piso = leer.nextInt();
                    System.out.print("Ingresar numero de consultorio: ");
                    numeroCons = leer.nextInt();

                    Consultorio consultorio = new Consultorio(piso, numeroCons);
                    consultorio.setPiso(piso);
                    consultorio.setNumeroConsultorio(numeroCons);
                    hospital.registrarConsultorio(consultorio);
                    System.out.println("");
                    System.out.println("Se registró un nuevo consultorio");
                    break;

                case 4:

                    System.out.print("Ingresar fecha y hora de la consulta: ");
                    FechaHora = leer.next();
                    consulta.setFechaHora(FechaHora);
                    System.out.print("Ingresar paciente: ");

                    System.out.print("Ingresar consultorio: ");
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("--------MOSTRAR PACIENTES--------");
                    hospital.mostrarPaciente();
                    break;

                case 6:
                    System.out.println("");
                    System.out.println("--------MOSTRAR MÉDICOS--------");
                    hospital.MostrarMedicos();
                    break;

                case 7:
                    System.out.println("");
                    System.out.println("--------MOSTRAR CONSULTORIO--------");
                    hospital.MostrarConsultorios();
                    break;

                case 8:

                    break;

                case 9:
                    System.out.println("Cuide de su salud");
                    break;

                default:
                    System.out.println("Opción invalida");
            }
        }
    }
}
