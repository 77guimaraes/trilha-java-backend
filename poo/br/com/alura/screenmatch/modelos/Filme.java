package poo.br.com.alura.screenmatch.modelos;

import poo.br.com.alura.screenmatch.calculos.Classificavel;

//Classe "FILME" criado
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}