package usuarios.medicos;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;
import java.util.Random;

public class Medico extends Usuario {


        private String telefono;
        private String rfc;
        Random rand = new Random();

        public Medico(String id, String nombre, String apellidos, LocalDate fechaNacimiento,
                      String telefono, String email, String rfc, String contraseña) {

            super(id, nombre, apellidos, fechaNacimiento, telefono, email, contraseña, Rol.MEDICO);
            this.rfc = rfc;

        }
        @Override
        public String mostrarInformacion(){

            return super.mostrarInformacion() + String.format(", RFC: %s, ", this.rfc);
        }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }


}
