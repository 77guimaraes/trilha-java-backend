package poo.br.com.alura.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import poo.br.com.alura.screenmatch.modelos.Titulo;
import poo.br.com.alura.screenmatch.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args)
        //avisando que o codigo pode quebrar caso falte internet (IOException) ou parar de rodar do nada (InterruptedException)
            throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digit um filme para busca: ");
        var busca  = leitura.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=d97120b9";

        /*CLASSE/CLIENTE HTTP
        Navegador/objeto responsável por fazer o transporte os dados*/
        HttpClient client = HttpClient.newHttpClient();

        /*REQUISIÇÃO
        HttpRequest = Envelope do pedido. Contém as regras da requisição
        request = nome da requisição
        HttpRequest.newBuilder() =  Abre o pedido para acrescentar informações nele */
        HttpRequest request = HttpRequest.newBuilder()

                //Configurações do pedido (para onde ele deve ir e quais informações pegar)
                //Se fosse necessário, poderia adicionar mais coisas empilhando uma em cima da outra
                .uri(URI.create(endereco))
                .build(); //finaliza a montagem do pedido

        //RESPOSTA
        /*Cria variável response do tipo String (HttpResponse<String>)
        response vai receber o resultado do trabalho do objeto 'client'*/
        HttpResponse<String> response = client

                //.send(request,... -> vai levar minha requisição pelo client
                /*HttpResponse.BodyHandlers.ofString -->: vai trazer uma resposta (em bytes)
                e vai convertê-la pra mim em tipo String */
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
                System.out.println("\n meuTitulo: " + meuTitulo);
    }
}
