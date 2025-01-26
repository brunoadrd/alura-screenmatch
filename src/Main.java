import br.com.alura.screenmatch.calculos.RecommendationFilter;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Movie;

public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.setFilmName("O Poderoso Chefão");
        firstMovie.setTitleYear(1970);
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

    }
}