
import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc=0;


        while (opc != 3) {
            System.out.println("\n1. Escribir tarea.");
            System.out.println("2. Leer tareas.");
            System.out.println("3. Terminar.");
            opc = leer.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("\n----- ESCRIBIR TAREAS -----");

                    System.out.println("Ingrese los detalles de la tarea: ");
                    leer.nextLine();
                    String laTarea = leer.nextLine();
                    try (
                            FileWriter tarea = new FileWriter("ListaTareas.txt", true);
                            BufferedWriter lista = new BufferedWriter(tarea);) {
                            lista.write("\n" + laTarea);

                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo. " + e.getMessage());
                    }
                    System.out.println("Tarea guardada.");
                    break;
                case 2:
                    System.out.println("\n----- TAREAS -----");
                    try (FileReader otraTarea=new FileReader(("ListaTareas.txt"));){
                        BufferedReader otraLista=new BufferedReader(otraTarea);
                        String linea;
                        while((linea= otraLista.readLine())!= null){
                            System.out.println(linea);
                        }
                    }catch(IOException e){
                        System.out.println("Error al leer el archivo" + e);
                    }
                    break;
                case 3:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("No existe esa opción.");
            }
        }
    }
}