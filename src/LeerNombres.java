import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerNombres {
    public static void main(String[] args) {
        File archivo = new File("nombres.txt");

        try (Scanner lector = new Scanner(archivo)) {
            System.out.println("Contenido del archivo: ");

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println("- " + linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        }
    }
}
