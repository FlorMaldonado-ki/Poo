public class Rectangulo {

    double Base, Altura, area;

    public Rectangulo(double Base, double Altura) {

        this.Base=Base;
        this.Altura= Altura;

    }

    public void CalcularArea() {

        area=Base*Altura;
        System.out.println("El área del rectángulo es: "+area);

    }
    public void CalcularPerimetro() {

        double perimetro=(2*Base)+(2*Altura);
        System.out.println("El perimetro es: "+perimetro);

    }

}