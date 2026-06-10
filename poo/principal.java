package poo;
import poo.br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import poo.br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import poo.br.com.alura.screenmatch.modelos.Episodio;
import poo.br.com.alura.screenmatch.modelos.Serie;
import poo.br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {

        /*Foi criada uma CLASSE do tipo filme (Filme.java) e agora estamos criando um OBJETO (meuFilme) dentro deste programa. A criação desse filme deve seguir os parâmetros estabelecidos em Filmes.java.
         */

        //Tipo Referência - Objeto Filme (new Filme / new Objeto)
        Filme meuFilme = new Filme("Norbit"); //definindo atributos no meu novo filme
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

        Filme outroFilme = new Filme("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(supernatural);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(supernatural);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("dogville");
        filmeDoPaulo.setNome ("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("\nTamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Segundo filme: " + listaDeFilmes.get(1).getNome());
        System.out.println("Terceiro filme: " + listaDeFilmes.get(2).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());


    }
}