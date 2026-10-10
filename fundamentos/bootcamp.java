package fundamentos;

import java.util.Scanner;
import java.lang.*;
public class bootcamp{
    public static void main(String[] args){

        System.out.println("=== ATENDIMENTO DA CAFETERIA ===\n");
        System.out.println
                ("Segue abaixo nosso cardápio:" +
                        "1 - CAFÉ PRETO (R$ 3,00)" +
                        "2 - CAFÉ COM LEITE (R$ 4,00)" +
                        "3 - CAPUCCINO (R$ 7,00)" +
                        "4 - PÃO COM MANTEIGA (R$ 2,50)" +
                        "5 - MISTO QUENTE (R$ 5,00)");

        Scanner input = new Scanner(System.in);
        System.out.print("Escolha um número correspondente a um dos itens do cardápio: ");
        String produto = input.nextLine();
    }
}