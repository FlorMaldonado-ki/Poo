package hospital;

import consultas.Consulta;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.util.ArrayList;

public class Hospital {

    public ArrayList<Paciente> listaPacientes=new ArrayList<>();

    public ArrayList<Medico> listaMedicos=new ArrayList<>();

    public ArrayList<Consulta> listaConsulta=new ArrayList<>();

    public ArrayList<Consultorio> listaConsultorio=new ArrayList<>();


    private ValidadorHospital validador=new ValidadorHospital();

    public void registrarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico) {
        this.listaMedicos.add(medico);
    }

    public void registrarConsulta(Consulta consulta) {
        // Paciente no tenga una consulta en esa fecha

        if (!validador.validarDisponibilidadEnFecha(consulta.getFechaHora(), consulta.getConsultorio().getNumeroConsultorio(), this.listaConsulta)) {
            System.out.println("Ya existe una consulta registrada para esa fecha");
            return;
        }

        this.listaConsulta.add(consulta);

        if (validador.validarDisponibilidadEnFecha(consulta.getFechaHora(), consulta.getMedico().getId(), this.listaConsulta)) {
            System.out.println("El medico no tiene disponibilidad para esa fecha");
            return;
        }
    }


    public void registrarConsultorio(Consultorio consultorio) {
        this.listaConsultorio.add(consultorio);
    }

    public void mostrarPaciente() {
        System.out.println("\n*** PACIENTES DEL HOSPITAL ***");
        for (Paciente paciente : this.listaPacientes) {
            System.out.println(paciente.MostrarDatos());
        }
    }

    private boolean validarDisponibilidadMedico(String fehcaDeseada, int idMedico) {
        for (Consulta consulta : listaConsulta) {
            if (consulta.getFechaHora().equals(fehcaDeseada) && consulta.getMedico().getId() == idMedico) {
                return false;
            }
        }

        return true;
    }
    public void MostrarConsultorios(){

        if (this.listaConsultorio.isEmpty()) {
            System.out.println("No hay consultorios registrados :(");
            return;
        }
        for (Consultorio consultorio : this.listaConsultorio) {

            System.out.println("");
            System.out.println("Consultorios en el sistema: ");
            consultorio.MostrarConsultorio();
        }
    }
    public void MostrarMedicos(){
        if (this.listaMedicos.isEmpty()) {
            System.out.println("No hay médicos registrados :(");
            return;
        }
        for (Medico medico : this.listaMedicos) {

            System.out.println("");
            System.out.println("Médicos en el sistema: ");
            medico.MostrarMedico();
        }
    }
}
