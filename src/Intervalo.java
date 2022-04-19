import java.io.IOException;
import java.util.Scanner;

public class Intervalo {

    public static void main(String[] args) throws IOException {
        // Scanner
        Scanner teclado = new Scanner(System.in);

        double intervalo = teclado.nextDouble();

        teclado.close();
        // Fim do Scanner
        if (intervalo <= 25 && intervalo >= 0) {
            System.out.println("Intervalo [0,25]");
        } else if (intervalo <= 50 && intervalo > 25) {
            System.out.println("Intervalo (25,50]");
        } else if (intervalo > 50 && intervalo <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (intervalo > 75 && intervalo <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }

}