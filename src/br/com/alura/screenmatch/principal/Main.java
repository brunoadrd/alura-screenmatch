package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.RecommendationFilter;
import br.com.alura.screenmatch.modelos.Movie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie("O Poderoso Chefão", 1970);
        firstMovie.setTitleDuration(180);

        firstMovie.getInfos();
        firstMovie.rateTitle(5);
        firstMovie.rateTitle(7);
        firstMovie.rateTitle(8.6);

        System.out.println("Total de avaliações: " + firstMovie.getTotalOfRating());
        System.out.println(String.format("Média: %.2f", firstMovie.averageRating()));

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(firstMovie);

        var myMovie = new Movie("DogVille", 2003);
        myMovie.setTitleDuration(200);
        myMovie.rateTitle(10);

        ArrayList<Movie> listOfMovies = new ArrayList<>();
        listOfMovies.add(myMovie);
        listOfMovies.add(firstMovie);

        System.out.println("Tamanho da lista: " + listOfMovies.size());
        System.out.println("Primeiro Filme: " + listOfMovies.get(0).getTitleName());
        System.out.println(listOfMovies.get(0).toString());
    }
}