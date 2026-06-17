package poo.br.com.alura.screenmatch.principal;

import poo.br.com.alura.screenmatch.modelos.Filme;
import poo.br.com.alura.screenmatch.modelos.Serie;
import poo.br.com.alura.screenmatch.modelos.Titulo;

import javax.lang.model.type.ArrayType;
import java.util.*;

public class PrincipalComListas {
    private static ArrayList<Filme> listaDeFilmes;
    private static ArrayList<Filme> lista;

    public static void main(String[] args) {
        Filme meuFilme = new Filme("Norbit", 2000);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2022);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("dogville", 1970);
        filmeDoPaulo.avalia(10);
        Serie supernatural = new Serie("Supernatural", 2002);

        Filme f1 = filmeDoPaulo;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(supernatural);

        System.out.println(lista.get(3).getNome());

        if (lista.get(3) instanceof Filme filme && filme.getClassificacao() > 2) {
            System.out.println("Classificação: " + filme.getClassificacao()); //Para usar o getClassificação de Filme.java in
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        //Ordenando listas
        Collections.sort(buscaPorArtista);
        System.out.println("\nDepois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("\nLista de titulos ordenados: ");
        //Collections só roda objetos que saibam sua ordem.

        //utilizando comparable, Titulo.java começa a se comparar e se ordenar
        Collections.sort(lista);
        System.out.println(lista);

        //Ordena a lista de títulos pelo ano de lançamento usando Comparator
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
