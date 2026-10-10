package fundamentos;

import java.util.Scanner;

public class aulaLeituraDados {
    public static void main(String [] args) {
        Scanner leitura = new Scanner(System.in);

        //Pede e printa filme favorito
        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito =  leitura.nextLine();
        System.out.println(filmeFavorito);

        //Pede ano de lançamento
        System.out.println("Quero saber o ano de lançamento: ");
        int anoLancamento = leitura.nextInt();
        System.out.println(anoLancamento);

        //Pede avaliação do filme
        System.out.println("Diga sua avaliação sobre o filme: ");
        double avaliacao = leitura.nextDouble();

    }
}
