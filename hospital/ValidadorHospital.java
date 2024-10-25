package hospital;

import consultas.Consulta;
import usuarios.Usuario;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;
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

    public boolean validarTelefono(String telefonoDeseado, ArrayList<Usuario> listaUsuario) {

        for (Usuario usuario : listaUsuario) {

            if (usuario.getTelefono().equals(telefonoDeseado)) return false;

        }
        return true;
    }
    public boolean validarEmail(String emailDeseado, ArrayList<Usuario> listaUsuario) {

        for (Usuario usuario : listaUsuario) {

            if (usuario.getEmail().equals(emailDeseado)) return false;

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