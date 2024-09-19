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


    public void registrarPaciente(Paciente paciente){
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico){
        this.listaMedicos.add(medico);
    }
    public void registrarConsultorio(Consultorio consultorio){
        this.listaConsultorio.add(consultorio);
    }
    public void registrarConsulta(Consulta consulta){

        if(!validarDisponibilidadFechaConsulta(consulta.getFechaHora(), consulta.getConsultorio().getNumeroConsultorio())){
            System.out.println("Ya existe una consulta registrada para esa fecha");
            return;
        }


        this.listaConsulta.add(consulta);
    }

    private boolean validarDisponibilidadFechaConsulta(String fechaDeseada, int numeroConsultorio){

        for (Consulta consulta : this.listaConsulta) {

            if (consulta.getFechaHora().equals(fechaDeseada) && numeroConsultorio == consulta.consultorio.getNumeroConsultorio()) {

                return false;
            }
        }
        return true;

    }
}