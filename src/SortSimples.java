import java.io.IOException;
import java.util.Scanner;

public class SortSimples {
    // MANDAR NO URI
    // MANDAR NO URI
    // MANDAR NO URI
    // MANDAR NO URI
    // MANDAR NO URI
    // MANDAR NO URI
    // MANDAR NO URI
    // MANDAR NO URI

    public static void main(String[] args) throws IOException {

        // Scanner
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();

        teclado.close();
        // Fim do Scanner
        // UM
        if (A < B && A < C) {
            if (B < C) {
                System.out.println(A + " \n" + B + " \n" + C);
            } else if (C < B) {
                System.out.println(A + " \n" + C + " \n" + B);
            }
        }
        // DOIS
        if (B < A && B < C) {
            if (A < C) {
                System.out.println(B + " \n" + A + " \n" + C);
            } else if (C < A) {
                System.out.println(B + " \n" + C + " \n" + A);
            }
        }
        // TRÊS
        if (C < A && C < B) {
            if (A < B) {
                System.out.println(C + " \n" + A + " \n" + B);
            } else if (B < A) {
                System.out.println(C + " \n" + B + " \n" + A);
            }
        }
        // Ordem escrita
        System.out.println("\n" + A + "\n" + B + "\n" + C);
    }

}