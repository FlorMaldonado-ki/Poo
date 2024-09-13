public class CalcularImpuestos {

    int ingresos;
    double porcentajeImpuestos, dividendos, exencion, ingre;

    public CalcularImpuestos(int ingresos, double porcentajeImpuestos, double dividendos, double exencion) {

        this.ingresos = ingresos;
        this.porcentajeImpuestos = porcentajeImpuestos;
        this.dividendos = dividendos;
        this.exencion = exencion;

    }

    public double calcular(int ingresos){

        return ingre=ingresos+0.15;


    }

    public double calcular(int ingresos, double porcentajeImpuestos){

        return ingre=ingresos*(porcentajeImpuestos/100);

    }

    public double calcular(double porcentajeImpuestos, double dividendos, double exencion){

        ingre=dividendos*(porcentajeImpuestos/100);

        if (ingre>=exencion){

            return ingre=ingre-exencion;
        }
        else{
            return 0;
        }


    }
}
