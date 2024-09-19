package consultorios;

public class Consultorio {

    public int id;
    public int piso;
    public int numeroConsultorio;


    public Consultorio(int id, int piso, int numeroConsultorio) {
        this.id = id;
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
}

