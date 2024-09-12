import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner leer= new Scanner(System.in);
        double SueldoBase, bonificacion, horasExtra;

        System.out.print("Ingresar la base: ");
        double Base= leer.nextDouble();
        System.out.print("Ingresar la altura: ");
        double Altura= leer.nextDouble();

        Rectangulo rectangulo= new Rectangulo(Base, Altura);

        rectangulo.CalcularArea();
        rectangulo.CalcularPerimetro();

        System.out.println("");
        System.out.println("");

        System.out.print("Ingresar Sueldo Base: ");
        SueldoBase= leer.nextDouble();
        System.out.print("Ingresar Bonificacion: ");
        bonificacion= leer.nextDouble();
        System.out.print("Ingresar Horas Extra: ");
        horasExtra= leer.nextDouble();

        Empleado empleado= new Empleado(SueldoBase, bonificacion, horasExtra);

        Double sueldo= empleado.CalcularSalario();

        }
    }