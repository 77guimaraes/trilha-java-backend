package poo.br.com.alura.screenmatch.modelos;

//Classe "FILME" criado
public class Filme {
    private String nome = "Top Gun";
    private int anoLancamento = 2022;
    private boolean incluidoNoPlano = true;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    //Metodo acessor
    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    //PERMITE QUE UM USUÁRIO INCLUA UM NOME
    public void setNome(String nome) {
        this.nome = nome; //
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
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
}