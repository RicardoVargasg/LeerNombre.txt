import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Alberto", "Cristian", "Valeria", "Marcos"};

        try (PrintWriter escritor = new PrintWriter(new FileWriter("nombres.txt"))) {
            for (String nombre : nombres) {
                escritor.println(nombre);
            }
            System.out.println("nombres.txt creado");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}