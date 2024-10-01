package hospital;

import consultas.Consulta;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ValidadorHospital {

    public boolean validarDisponibilidadEnFecha(
            LocalDateTime fechaDeseada,
            int numeroConsultorio,
            ArrayList<Consulta> listaConsultas) {

        for (Consulta consulta : listaConsultas) {
            if (consulta.getFechaHora().isEqual(fechaDeseada) &&
                    numeroConsultorio == consulta.getConsultorio().getNumeroConsultorio()) {
                return false;
            }
        }
        return true;
    }

    public boolean validarDisponibilidadMedico(
            LocalDateTime fechaDeseada,
            String idMedico,
            ArrayList<Consulta> listConsultas
    ) {
        for (Consulta consulta : listConsultas) {
            if (consulta.getFechaHora().isEqual(fechaDeseada)
                    && consulta.getMedico().getId().equals(idMedico)) {
                return false;
            }
        }
        return true;

    }

    public boolean validarFechaCorrecta(LocalDateTime fechaDeseda) {

        if (fechaDeseda.isBefore(LocalDateTime.now())) return false;
        return true;
    }

    public boolean validarTelefono(String telefonoDeseado, ArrayList<Paciente> listaPacientes) {

        for (Paciente paciente : listaPacientes) {

            if (paciente.getTelefono().equals(telefonoDeseado)) return false;

        }
        return true;
    }
    public boolean validarRFC(String RFC, ArrayList<Medico> listaMedicos) {

        for (Medico medico : listaMedicos) {

            if (medico.getRfc().equals(RFC)) return false;

        }
        return true;
    }
}
