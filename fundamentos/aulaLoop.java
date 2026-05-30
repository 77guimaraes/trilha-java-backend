package fundamentos;

import java.util.Scanner;

public class aulaLoop {
    public static void main(String[] args) {

        /* O programa abaixo recebe até 03 avaliações de notas do filme
        e depois calcula a media de avaliação do filme avaliado
        */

        Scanner leitura = new Scanner (System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        //enquanto i for igual a 0 e i menor que X adicione mais um
        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação sobre o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota; //recebe o que ja tinha + a nota
        }

        System.out.println("Media de avaliações: " + mediaAvaliacao/3);
    }
}
