import java.io.IOException;
import java.util.Scanner;

public class CoordenadasDeUmPonto {

    public static void main(String[] args) throws IOException {

        // Scanner
        Scanner teclado = new Scanner(System.in);

        double x = teclado.nextDouble();
        double y = teclado.nextDouble();

        teclado.close();
        // Fim do Scanner

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        } else if (y == 0 && x != 0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Origem");
        }

    }

}