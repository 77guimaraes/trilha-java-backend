package poo.br.com.alura.screenmatch.principal;

import poo.br.com.alura.screenmatch.modelos.Filme;
import poo.br.com.alura.screenmatch.modelos.Serie;
import poo.br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    private static ArrayList<Filme> listaDeFilmes;
    private static ArrayList<Filme> lista;

    public static void main(String [] args) {
        Filme meuFilme = new Filme("Norbit", 2000);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2022);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("dogville", 1970);
        filmeDoPaulo.avalia(10);
        Serie supernatural = new Serie("Supernatural", 2002);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(supernatural);
        for (Titulo item: lista) {
            System.out.println(item.getNome());

            Filme filme = (Filme) item;
            System.out.println("Classificação: " + filme.getClassificacao()); //Para usar o getClassificação de Filme.java in
        }
    }
}