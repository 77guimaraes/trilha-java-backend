public class aulaFundamentos {
    public static void main (String [] args){
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        //Ano de lançamento do filme e se está incluso no plano do usuário
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento + "\n");
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Inclusão de sinopse com Text Blocks (""")
        String sinopse;
        sinopse = """
                Filme Top Gun: Maverick
                Filme de ação com galã dos anos 80
                Muito bom!
                Ano de lançamento: """ + anoDeLancamento;
        System.out.println(sinopse);
    }
}


