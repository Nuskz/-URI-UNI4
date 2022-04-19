import java.io.IOException;
import java.util.Scanner;

public class TempoJogo {
    
    public static void main(String[] args) throws IOException {
        // Scanner
        Scanner teclado = new Scanner(System.in);

        int horaEntrada = teclado.nextInt();
        int horaSaida = teclado.nextInt();

        teclado.close();
        // Fim do Scanner
        int tempoJogo = 24 - (24 + horaEntrada - horaSaida) % 24;
        if (horaEntrada == horaSaida) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + tempoJogo + " HORA(S)");
        }

    }

}