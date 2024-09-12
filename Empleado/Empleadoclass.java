public class Empleado {

    Double SueldoBase, bonificacion, horasExtra, sueldo;

    public Empleado(double SueldoBase, double bonificacion, double horasExtra) {
        this.SueldoBase = SueldoBase;
        this.bonificacion = bonificacion;
        this.horasExtra = horasExtra;
    }


        public Double CalcularSalario(Double SueldoBase){

            return this.SueldoBase;

        }
        public Double CalcularSalario (Double SueldoBase, Double bonificacion){

            sueldo=SueldoBase+bonificacion;
            return sueldo;
        }

        public Double CalcularSalario (Double SueldoBase, Double bonificacion, Double horasExtra) {

            horasExtra=horasExtra*20;
            sueldo = SueldoBase + bonificacion + horasExtra;
            return sueldo;
        }
}