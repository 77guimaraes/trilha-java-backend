package poo.br.com.alura.screenmatch.principal;

import poo.br.com.alura.screenmatch.modelos.Filme;
import poo.br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class PrincipalComListas {
    private static ArrayList<Filme> lista;

    public static void main() {

        Filme meuFilme = new Filme("Norbit", 2000);
        Serie supernatural = new Serie("Supernatural", 2002);
        Filme outroFilme = new Filme("Avatar", 2022);
        Filme filmeDoPaulo = new Filme("dogville", 1970);

        ArrayList<Filme> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(outroFilme);
        lista.add(meuFilme);
    }
}
