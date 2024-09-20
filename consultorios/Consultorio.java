package consultorios;

import java.util.ArrayList;
import java.util.Random;

public class Consultorio {

    public int id;
    public int piso;
    public int numeroConsultorio;
    Random ran=new Random();


    public Consultorio(int piso, int numeroConsultorio) {
        this.id = ran.nextInt(1, 10001);
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(int numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public void MostrarConsultorio(){

        System.out.println("Id: "+ getId());
        System.out.println("Piso: "+ getPiso());
        System.out.println("Numero Consultorio: "+ getNumeroConsultorio());
    }
}

