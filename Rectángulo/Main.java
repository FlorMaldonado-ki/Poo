import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner leer= new Scanner(System.in);
        double Base, Altura;
        int res=0, Base1, Altura1;


        System.out.print("Ingresar la base double: ");
        Base= leer.nextDouble();
        System.out.print("Ingresar la altura double: ");
        Altura= leer.nextDouble();
        System.out.print("Ingresar la base entera: ");
        Base1= leer.nextInt();
        System.out.print("Ingresar la altura entera: ");
        Altura1= leer.nextInt();

        System.out.println("¿Qué datos desea utilizar?");
        System.out.println("1. Int - 2. Double");
        res= leer.nextInt();

        Rectangulo rectangulo= new Rectangulo(Base, Altura, Base1, Altura1);

        if(res==1){

            System.out.println("El área entera es: "+ rectangulo.CalcularArea(Base1, Altura1));
            System.out.println("El perimetro entero es: "+ rectangulo.CalcularPerimetro(Base1, Altura1));

        }
        else if(res==2){

            System.out.println("El área double es: "+ rectangulo.CalcularArea(Base, Altura));
            System.out.println("El perimetro double es: "+ rectangulo.CalcularArea(Base, Altura));
        }
        else{
            System.out.println("Error!!");
        }
    }