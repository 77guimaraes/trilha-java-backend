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
    }
}
