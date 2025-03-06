package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ConversionYearException;
import br.com.alura.screenmatch.modelos.Title;
import br.com.alura.screenmatch.modelos.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!search.equalsIgnoreCase("sair")) {
            System.out.println("Digite o filme que deseja pesquisar: ");
            search = keyboard.next();

            if (search.equalsIgnoreCase("sair")) {
                break;
            }

            String url = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=6585022c";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                System.out.println(json);


                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);

                //try {
                Title myTitle = new Title(myTitleOmdb);
                System.out.println("Título convertido: ");
                System.out.println(myTitle);

                titles.add(myTitle);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (ConversionYearException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } finally {
                System.out.println("O programa finalizou corretamente.");
            }
        }
        System.out.println(titles);

        FileWriter writer = new FileWriter("Filmes.json");
        writer.write(gson.toJson(titles));
        writer.close();
    }
}
