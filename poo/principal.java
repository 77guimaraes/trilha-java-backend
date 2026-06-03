package poo;
import poo.br.com.alura.screenmatch.modelos.Filme;
import poo.br.com.alura.screenmatch.modelos.Serie;

public class principal {
    public static void main(String[] args) {

        /*Foi criada uma CLASSE do tipo filme (Filme.java) e agora estamos criando um OBJETO (meuFilme) dentro deste programa. A criação desse filme deve seguir os parâmetros estabelecidos em Filmes.java.
         */

        //Tipo Referência - Objeto Filme (new Filme / new Objeto)
        Filme meuFilme = new Filme();
        meuFilme.setNome ("Norbit"); //definindo atributos no meu novo filme
        meuFilme.setAnoLancamento(2005);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());


        Serie supernatural = new Serie();
        supernatural.setNome ("Supernatural");
        supernatural.setAnoLancamento(2005);
        supernatural.setDuracaoEmMinutos(180);
        supernatural.exibeFichaTecnica();
        supernatural.setTemporadas(8);
        supernatural.setEpisodiosPorTemporada(15);
        supernatural.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Supernatural: " + supernatural.getDuracaoEmMinutos());
    }
}