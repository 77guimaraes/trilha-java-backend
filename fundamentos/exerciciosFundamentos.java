package fundamentos;

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

        //5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        //valor em reais = valor em dol * taxa do cambio

        double valorEmDolares = 10.5;
        double txCambio = 5.01;
        double valorEmReal = valorEmDolares * txCambio;
        System.out.println(String.format("O valor de U$ %.2f convertido para reais é dé R$ %.2f", valorEmDolares, valorEmReal));

        //6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 150.00;
        double percentualDesconto = 15.0;

        double valorDesconto = precoOriginal * (percentualDesconto / 100);

        double precoFinal = precoOriginal - percentualDesconto;
        System.out.println(String.format("Preço original: R$ %.2f", precoOriginal));
        System.out.println(String.format("Desconto aplicado: R$ %.2f (%.0f%%)%n", valorDesconto, percentualDesconto));
        System.out.println(String.format("Preço com desconto aplicado R$ %.2f", precoFinal));

    }
}
