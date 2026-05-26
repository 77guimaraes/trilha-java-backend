import java.util.Scanner;

public class aulaLeituraDados {
    public static void main(String [] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito =  leitura.nextLine();
        System.out.println(filmeFavorito);
    }
}
