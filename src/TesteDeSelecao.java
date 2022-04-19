import java.io.IOException;
import java.util.Scanner;

public class TesteDeSelecao {
    // Teste de Seleção
    public static void main(String[] args) throws IOException {
        // Scanner
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();

        teclado.close();
        // Fim do Scanner
        int somaCD = c + d;
        int somaAB = a + b;
        if (b > c && d > a && somaCD > somaAB && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }

}
