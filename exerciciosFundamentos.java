import java.sql.SQLOutput;

public class exerciciosFundamentos {
    public static void main (String[] args){

        /*02. Construindo o Catálogo de filmes
        EXERCÍCIOS ALURA
        1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.*/
        double media = (9.8 + 6.3 + 8.0) / 3;

        double valor1 = 4.6;
        double valor2 = 8.9;
        double media2 = (valor1 + valor2) / 2;
        System.out.println(media);

        //2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double notasAnuais = (5.5 + 6.1 + 8.4 + 9.2);
        int notaFinal = (int) (notasAnuais / 4);
        System.out.println("A nota final é: " + notaFinal);

        //3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char inicial = 'G';
        String nome = "Irã";
        System.out.println(String.format("O meu nome é %s e a inicial do meu sobrenome é %c", nome, inicial));

        //4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 14.50;
        int quantidade = 5;
        double total = precoProduto * quantidade;
        System.out.println(String.format("O total a ser pago é R$ %.2f reais", total));

    }
}
