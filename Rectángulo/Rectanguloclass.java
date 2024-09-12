public class Rectangulo {

    double Base, Altura, area, perimetro;
    int Base1, Altura1, area1, perimetro1;

    public Rectangulo(double Base, double Altura, int Base1, int Altura1) {

        this.Base=Base;
        this.Altura= Altura;
        this.Base1=Base1;
        this.Altura1=Altura1;

    }

    public double CalcularArea(double Base, double Altura) {

        return area=Base*Altura;

    }
    public double CalcularPerimetro(double Base, double Altura) {

        return perimetro=(2*Base)+(2*Altura);

    }

    public int CalcularArea(int Base1, int Altura1) {

        return area1=Base1*Altura1;

    }
    public int CalcularPerimetro(int Base1, int Altura1) {

        return perimetro1=(2*Base1)+(2*Altura1);

    }


}