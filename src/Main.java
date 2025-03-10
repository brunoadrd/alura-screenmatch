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

        Calculadora calc = new Calculadora();
        Musica som1 = new Musica();

        som1.title = "Som bom";
        som1.artist = "Bruno";
        som1.releaseYear = 2024;
        som1.rate(5);
        som1.rate(10);
        som1.rate(15);

        som1.info();

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

        Pessoa pessoaUm = new Pessoa();
        pessoaUm.setName("Bruno");
        pessoaUm.setAge(25);
        Pessoa pessoaDois = new Pessoa();
        pessoaDois.setName("João");
        pessoaDois.setAge(20);
        Pessoa pessoaTres = new Pessoa();
        pessoaTres.setName("Pedro");
        pessoaTres.setAge(29);

        ArrayList<Pessoa> listOfPeople = new ArrayList<>();
        listOfPeople.add(pessoaUm);
        listOfPeople.add(pessoaDois);
        listOfPeople.add(pessoaTres);

        System.out.println("Tamanho da lista: " + listOfPeople.size());
        System.out.println("Nome da Pessoa 1: " + listOfPeople.get(0).getName());
        System.out.println(listOfPeople);
    }
}