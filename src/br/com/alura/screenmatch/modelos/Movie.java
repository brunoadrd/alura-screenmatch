package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classifiable;

public class Movie extends Title implements Classifiable {
    private String director;

    public Movie(String titleName, int titleYear) {
        super(titleName, titleYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) averageRating() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getTitleName() + " (" + this.getTitleYear() + ")";
    }
}
