import java.util.ArrayList;

public class Hotel  {

    public ArrayList <Habitacion> listaHabitaciones = new ArrayList<>();

    public Hotel() {

        Habitacion habitacion = new Habitacion("HABITACION1-20005", "SUITE", 1700.99, true);
        this.listaHabitaciones.add(habitacion);
        Habitacion habitacion1 = new Habitacion("HABITACION1-20004", "INDIVIDUAL", 400.99, true);
        this.listaHabitaciones.add(habitacion1);
        Habitacion habitacion2 = new Habitacion("HABITACION1-20003", "DOBLE", 670.99, true);
        this.listaHabitaciones.add(habitacion2);

    }

    public double reservar(int noches, String idBuscar) throws Exception {

        for(Habitacion listaHabitacion : this.listaHabitaciones){

            if(listaHabitacion.getID().equals(idBuscar)){

                if(!validarDisponibilidad(idBuscar)){

                    throw new Exception("HabitaciónNoDisponibleException");
                }
                else{

                    if (noches<1){

                        throw new Exception("NúmeroDeNochesInválidoException");
                    }
                listaHabitacion.setDisponible(false);
                System.out.println("Habitación ahora reservada.");
                double total= listaHabitacion.getPrecioPorNoche()*noches;
                return total;
                }
            }
        }
        System.out.println("Esa habitación no existe.");
        return 0;
    }
    public void liberar(String idBuscar){

        for(Habitacion listaHabitacion : this.listaHabitaciones){

            if(listaHabitacion.getID().equals(idBuscar)){

                listaHabitacion.setDisponible(true);
                System.out.println("Habitación ahora disponible");
                return;
            }
        }
    }

    public void mostrarHabitaciones(){

        for(Habitacion habitacion : this.listaHabitaciones){
            System.out.println(habitacion.mostrarDetalles());
        }
    }

    private boolean validarDisponibilidad(String id){

        for (Habitacion listahabitacion : this.listaHabitaciones) {

            if(listahabitacion.getID().equals(id)){
                if(!listahabitacion.getDisponible())
                    return false;
            }
        }
        return true;
    }
}
