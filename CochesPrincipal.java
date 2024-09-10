public class Main {
    public static void main(String[] args) {

        System.out.println("Auto UNO");
        Coche auto1= new Coche("Honda", "City", 2017);
        System.out.println(auto1.MostrarInfo());
        auto1.CalcularEdadDelCoche();

        System.out.println("Auto DOS");
        Coche auto2= new Coche("Honda","Civic",2019);
        System.out.println(auto2.MostrarInfo());
        auto2.CalcularEdadDelCoche();

        System.out.println("Auto TRES");
        Coche auto3= new Coche("Honda", "HRV", 2014);
        System.out.println(auto3.MostrarInfo());
        auto3.CalcularEdadDelCoche();
    }
}