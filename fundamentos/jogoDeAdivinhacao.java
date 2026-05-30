package fundamentos;

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

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns! Você acerto em " + tentativas + " tentativas.");
                break;
            } else if  (numeroDigitado < numeroGerado) {
                System.out.println("O numero informado é menor que o número secreto. Tente novamente.");
            } else {
                System.out.println("O número informado é maior que o número secreto. Tente novamente.");
            }

            if (tentativas == 5 && numeroDigitado != numeroGerado) {
                System.out.println("Não foi dessa vez. Suas tentativas acabaram. O número era " + numeroGerado);
            }
        }
    }
}