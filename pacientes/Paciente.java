package pacientes;

import java.util.Random;

public class Paciente {
    Random rand = new Random();

    public int id;
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    private String telefono;
    public String tipoSangre;
    public char sexo;

    public Paciente(String nombre, String apellidos, String fechaNacimiento, String telefono, String tipoSangre, char sexo) {
        this.id =rand.nextInt(1, 10001);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;

    }

    public String MostrarDatos() {
        String datos = String.format(
            "Id: %d, nombre: %s, apellidos: %s, fecha de nacimientos: %s, tipo de sangre: %s, sexo: %s, telefono: %s",
            id, nombre, apellidos, fechaNacimiento, tipoSangre, sexo, telefono
                    );
            return  datos;
        }
}
