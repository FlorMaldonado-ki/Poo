import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner leer= new Scanner(System.in);

            int ingresos=0, res1;
        double porcentajeImpuestos=0, dividendos=1, exencion=1, ingre;
        boolean bandera=false, bandera2=false, bandera3=false, bandera4=false;


        System.out.println("¿Desea calcular los ingresos?");
        System.out.println("1. Si - 2. No");
        res1= leer.nextInt();

        if(res1==1) {

            System.out.print("Escriba los ingresos: $");
            ingresos = leer.nextInt();
            bandera3=true;

        }
        else{

            bandera=true;
        }

        System.out.println("¿Desea ingresar los impuestos?");
        System.out.println("1. Si - 2. No");
        res1 = leer.nextInt();

        if(res1==1) {

            bandera4=true;
            System.out.print("Ingresar porcentaje de impuestos: ");
            porcentajeImpuestos = leer.nextDouble();

        }
        else {

            bandera2=true;
        }

            if(bandera==true) {

                System.out.print("Ingresar dividendos: ");
                dividendos= leer.nextDouble();
                System.out.print("Ingresar exención: ");
                exencion= leer.nextDouble();

            }

        CalcularImpuestos impuesto=new CalcularImpuestos(ingresos, porcentajeImpuestos, dividendos, exencion);

        if(bandera2==true) {

            ingre = impuesto.calcular(ingresos);
            System.out.println("Los ingresos son de: $" + ingre);
        }
            else if (bandera4==true && bandera3==true) {

                ingre=impuesto.calcular(ingresos,porcentajeImpuestos);
                System.out.println("Los ingresos son de: $" + ingre);
            }
        else if (bandera==true){
        ingre = impuesto.calcular(porcentajeImpuestos, dividendos, exencion);
        System.out.println("Los impuestos son de: $" + ingre);
        }
    }
}