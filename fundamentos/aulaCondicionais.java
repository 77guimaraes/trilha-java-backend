package fundamentos;

public class aulaCondicionais {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Condicional do ano de lançamento
        if (anoDeLancamento > 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        //Condicional do plano do filme
        String tipoPlano = "plus";
        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else  {
            System.out.println("Deve pagar a locação");
        }
    }
}
