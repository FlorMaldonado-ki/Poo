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
                      String telefono, String rfc, String contraseña) {

            super(id, nombre, apellidos, fechaNacimiento, telefono, contraseña, Rol.MEDICO);
            this.rfc = rfc;

        }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public void mostrarMedico(){

        System.out.println("\nID: "+ getId());
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Apellidos: "+ getApellidos());
        System.out.println("FechaNacimiento: "+ getFechaNacimiento());
        System.out.println("Telefono: "+ getTelefono());
        System.out.println("RFC: "+ getRfc());
    }
}
