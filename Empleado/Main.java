import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner leer= new Scanner(System.in);
        double SueldoBase, bonificacion=0, horasExtra=0;

        ystem.out.print("Ingresar Sueldo Base: ");
        SueldoBase= leer.nextDouble();
        System.out.println("¿Desea ingresar bonificaciones?");
        System.out.println("1. Si - 2. No");
        res= leer.nextInt();

        if(res==1) {
            System.out.print("Ingresar Bonificacion: ");
            bonificacion = leer.nextDouble();

        }
        System.out.println("¿Desea ingresar horas extra?");
        System.out.println("1. Si - 2. No");
        res= leer.nextInt();

        if(res==1) {

            System.out.print("Ingresar Horas Extra: ");
            horasExtra = leer.nextDouble();
        }

        Empleado empleado= new Empleado(SueldoBase, bonificacion, horasExtra);

        sueldo=empleado.CalcularSalario(SueldoBase, bonificacion, horasExtra);
        System.out.println("El sueldo total es de: "+ sueldo);