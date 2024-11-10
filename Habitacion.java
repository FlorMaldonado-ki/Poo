public class Habitacion {

    private String tipoHabitación, ID;
    private double PrecioPorNoche;
    private boolean disponible;


    public Habitacion(String ID, String tipoHabitación, double precioPorNoche, boolean disponible) {

        this.tipoHabitación = tipoHabitación;
        this.PrecioPorNoche = precioPorNoche;
        this.disponible = disponible;
        this.ID = ID;
    }

    public String getTipoHabitación() {
        return tipoHabitación;
    }

    public double getPrecioPorNoche() {
        return PrecioPorNoche;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public String getID() {
        return ID;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String mostrarDetalles(){

        String disponibilidad;

        if (disponible){
             disponibilidad="Disponible";
        }
        else{

            disponibilidad= "Reservada";
        }
        String info = String.format("\nTipo de habitación: %s \nPrecio por noche, %.2f \nDisponibilidad: %s ",
                tipoHabitación, getPrecioPorNoche(), disponibilidad);
        return info;
    }
}
