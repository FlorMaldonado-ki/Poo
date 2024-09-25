package consultas;

import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDateTime;

public class Consulta {

    public String id;
    public LocalDateTime fechaHora;
    public Paciente paciente;
    public Consultorio consultorio;
    public Medico medico;

    public Consulta(String id, LocalDateTime fechaHora, Paciente paciente, Consultorio consultorio, Medico medico) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.consultorio = consultorio;
        this.medico = medico;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    public void setMedico(Medico medico){
        this.medico = medico;
    }
    public Medico getMedico() {
        return medico;
    }

    public void mostrarConsulta(){

        System.out.println("ID: "+ getId());
        System.out.println("Fecha y Hora: "+ getFechaHora());
        System.out.println("Paciente: "+ getPaciente());
        System.out.println("Consultorio: "+ getConsultorio());
        System.out.println("Medico: "+ getMedico());

    }
}

