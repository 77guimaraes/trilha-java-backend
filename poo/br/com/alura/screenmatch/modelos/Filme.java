package poo.br.com.alura.screenmatch.modelos;

//Classe "FILME" criado
public class Filme {
    public String nome = "Top Gun";
    int anoLancamento = 2022;
    boolean incluidoNoPlano = true;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    //Metodo acessor
    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
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