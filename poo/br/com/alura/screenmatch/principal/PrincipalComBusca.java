package poo.br.com.alura.screenmatch.principal;

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
                .uri(URI.create("https://www.omdbapi.com/?t=top+gun&apikey=d97120b9"))
                .build(); //finaliza a montagem do pedido

        //RESPOSTA
        /*Cria variável response do tipo String (HttpResponse<String>)
        response vai receber o resultado do trabalho do objeto 'client'*/
        HttpResponse<String> response = client

                //.send(request,... -> vai levar minha requisição pelo client
                /*HttpResponse.BodyHandlers.ofString -->: vai trazer uma resposta (em bytes)
                e vai convertê-la pra mim em tipo String */
                .send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());
    }
}
