package fundamentos;

import java.util.Scanner;

public class desafioBancario {
    public static void main(String[] args) {

        //Inicializa dados do cliente
        String nome = "Bruce";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("*********************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("*********************");

        String menu = """
                \nDigite o numero da opção que deseja:
                
                1 - Consultar Saldo Atual;
                2 - Transferir Valor;
                3 - Receber Valor;
                4 - Sair.""";

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            //Opção 1 - Visualizar Saldo
            if (opcao == 1) {
                System.out.println(String.format("Seu saldo atual é: R$ %.2f", saldo));
            }
            //Opção 2 - Transferir valor
            else if (opcao == 2) {
                System.out.println("Informe o valor a transferir: ");
                double valor = leitura.nextDouble();

                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valor;
                        System.out.println(String.format("Transferencia realizada com sucesso. Seu saldo atual é: R$ %.2f", saldo));
                }
            }
            //Opção 3 - Receber valor
            else if (opcao == 3) {
                System.out.println("Informe o valor a receber: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println(String.format("Valor recebido! Seu saldo atual é: R$ %.2f", saldo));
            }
            //Opção 4 - sair
            else if (opcao == 4) {
                System.out.println("Obrigado e volte sempre!");
                break;
            }
            //Opção inválida
            else if (opcao <= 0 || opcao > 4 ) {
                System.out.println("Opção inválida.");
            }
        }
    }
}