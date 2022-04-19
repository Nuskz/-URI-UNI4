import java.io.IOException;
import java.util.Scanner;

public class Main {
    // Sort Simples
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
            System.out.println(A);
            if (B < C) {
                System.out.println(B);
                System.out.println(C);
            } else if (C < B) {
                System.out.println(C);
                System.out.println(B);
            }

        }
        // DOIS
        if (B < A && B < C) {
            System.out.println(B);
            if (A < C) {
                System.out.println(A);
                System.out.println(C);
            } else if (C < A) {
                System.out.println(C);
                System.out.println(A);
            }
        }
        // TRÊS
        if (C < A && C < B) {
            System.out.println(C);
            if (A < B) {
                System.out.println(A);
                System.out.println(B);
            } else if (B < A) {
                System.out.println(B);
                System.out.println(A);
            }
        }
        // Ordem escrita
        System.out.println("\n\n");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

}