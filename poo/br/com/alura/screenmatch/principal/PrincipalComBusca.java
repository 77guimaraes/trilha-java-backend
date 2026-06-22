package poo.br.com.alura.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import poo.br.com.alura.screenmatch.modelos.Titulo;
import poo.br.com.alura.screenmatch.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    private static HttpClient client;

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digit um filme para busca: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=d97120b9";
            System.out.println(endereco);

            try { //try { //É como dizer "Executa isso, mas...

                HttpClient client = HttpClient.newHttpClient();//CLASSE/CLIENTE HTTP
                HttpRequest request = HttpRequest.newBuilder() //REQUISIÇÃO
                        .uri(URI.create(endereco))
                        .build(); //finaliza a montagem do pedido
                HttpResponse<String> response = client//RESPOSTA
                        .send(request, HttpResponse.BodyHandlers.ofString());


                //DETALHES DO CODIGO ESTÃO NO NOTION
                String json = response.body();
                System.out.println(json);

                Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .create();

                //Titulo meuTitulo = gson.fromJson(response.body(), Titulo.class);
                TituloOmdb meuTituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido");
                System.out.println(meuTitulo);


            } catch (NumberFormatException e) { //... se der esse erro, executa isso"
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca: ");
            } catch (Exception e) { //Erro que eu não conheço
                System.out.println(e.getMessage());
            }

            System.out.println("==== Programa finalizado! ====");
        }
    }
}
