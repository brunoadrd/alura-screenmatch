public class Musica {
    String title;
    String artist;
    int releaseYear;
    double rating;
    int numberOfRatings;

    void info() {
        String infoStr = String.format("""
                Música: %s
                Artista: %s
                Ano de lançamento: %d
                Avaliação: %.2f
                """, title, artist, releaseYear, ratingAverage(rating, numberOfRatings));
        System.out.println(infoStr);
    }

    void rate(double value){
        rating += value;
        numberOfRatings += 1;
        System.out.println("Você avaliou em " + value + " a música.");
    }

    double ratingAverage(double rating, int numberOfRatings) {
        return rating / numberOfRatings;
    }
}
