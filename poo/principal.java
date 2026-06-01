package poo;

public class principal {
    public static void main(String[] args) {

        /*Foi criada uma CLASSE do tipo filme (Filme.java) e agora estamos criando um OBJETO (meuFilme) dentro deste programa. A criação desse filme deve seguir os parâmetros estabelecidos em Filmes.java.
         */

        //Tipo Referência - Objeto Filme (new Filme / new Objeto)
        Filme meuFilme = new Filme();
        meuFilme.nome = "Norbit"; //definindo atributos no meu novo filme
        meuFilme.anoLancamento = 2005;
        meuFilme.duracaoEmMinutos = 1500;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

    }
}
