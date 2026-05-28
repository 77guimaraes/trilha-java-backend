import java.util.Scanner;
import java.util.Random;

public class jogoDeAdivinhacao {
    public static void main(String[] args) {

        System.out.println("=== TESTE DE ADIVINHAÇÃO DE NÚMERO ===");

        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); //gera numero aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Informe um numero entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            }
        }
    }
}