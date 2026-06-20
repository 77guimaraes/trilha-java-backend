package poo.br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        /*CLASSE/CLIENTE HTTP
        Navegador responsável por fazer o transporte os dados*/
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
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


    }

}
