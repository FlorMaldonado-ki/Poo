package medicos;

import java.time.LocalDate;
import java.util.Random;

public class Medico {

        public String id;
        public String nombre;
        public String apellidos;
        public LocalDate fechaNacimiento;
        private String telefono;
        private String rfc;
        Random rand = new Random();

        public Medico(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String rfc) {
            this.id=id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fechaNacimiento = fechaNacimiento;
            this.telefono = telefono;
            this.rfc = rfc;

        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
