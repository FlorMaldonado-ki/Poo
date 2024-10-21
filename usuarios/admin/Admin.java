package usuarios.admin;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Admin extends Usuario {


    Double sueldo;
    String rfc, añosTrabajando;

    public Admin(String id, String nombre, String apellidos, LocalDate fechaNacimiento,
                 String telefono, String contraseña, Double sueldo, String rfc, String añosTrabajando, Rol rol) {

        super(id, nombre, apellidos, fechaNacimiento, telefono, contraseña, Rol.ADMIN );
        this.sueldo = sueldo;
        this.rfc = rfc;
        this.añosTrabajando = añosTrabajando;
    }

    public Double getSueldo() {
        return sueldo;
    }
    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getAñosTrabajando() {
        return añosTrabajando;
    }

    public void setAñosTrabajando(String añosTrabajando) {
        this.añosTrabajando = añosTrabajando;
    }

    public void MostrarAdministrador() {

        System.out.println("ID: "+ getId());
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Apellidos: "+ getApellidos());
        System.out.println("Fecha de nacimiento: "+ getFechaNacimiento());
        System.out.println("RFC: "+ getRfc());
        System.out.println("Telefono: "+ getTelefono());
        System.out.println("Años trabajando: "+ getAñosTrabajando());
        System.out.println("Sueldo: "+ getSueldo());
    }
}
