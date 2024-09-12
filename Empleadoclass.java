public class Empleado {

    Double SueldoBase, bonificacion, horasExtra, sueldo;

    public Empleado(double SueldoBase, double bonificacion, double horasExtra) {
        this.SueldoBase = SueldoBase;
        this.bonificacion = bonificacion;
        this.horasExtra = horasExtra;
    }
        public double CalcularSalario(double SueldoBase){

            return this.SueldoBase;

        }
        public double CalcularSalario (double SueldoBase, double bonificacion){

            sueldo=SueldoBase+bonificacion;
            return sueldo;
        }

        public double CalcularSalario (double SueldoBase, double bonificacion, double horasExtra) {

            sueldo = SueldoBase + bonificacion + horasExtra;
            return sueldo;
        }
}