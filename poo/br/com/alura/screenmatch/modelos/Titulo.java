package poo.br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements  Comparable<Titulo>{

    @SerializedName("Title") //Está dizendo: Quando encontrar "Title" traga a informação dele para "nome"
    private String nome = "Top Gun";

    @SerializedName("Year") //Está dizendo: Quando encontrar "Year" traga a informaação dele para "anoDeLancamento"
    private int anoLancamento = 2022;
    private boolean incluidoNoPlano = true;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //Metodo acessor
    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    //PERMITE QUE UM USUÁRIO INCLUA UM NOME
    public void setNome(String nome) {
        this.nome = nome; //
    }

    public String getNome() {
        return nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Metodo é a maneira de algo. Nesse caso, é a maneira de exibir ficha tecnica
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    //Avalia notas
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    //Calculo das Medias
    public double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
        //Metodos com valores numericos devem possuir um "return"
    }

    //Ordenando todos os getNome
    @Override
    public int compareTo(Titulo outroTitulo) {
        //"retorna o seguinte: pega este getNome e compare com o getNome de outroTitulo"
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}
