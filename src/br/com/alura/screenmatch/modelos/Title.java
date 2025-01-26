package br.com.alura.screenmatch.modelos;

public class Title {
    private String titleName;
    private int titleYear;
    private int titleDuration;
    private boolean planIncluded;
    private double rating;
    private int totalOfRating;

    public void getInfos() {
        System.out.println("Título: " + titleName);
        System.out.println("Ano de lançamento: " + titleYear);
    }

    public int getTotalOfRating() {
        return totalOfRating;
    }

    public String getTitleName() {
        return titleName;
    }

    public int getTitleYear() {
        return titleYear;
    }

    public int getTitleDuration() {
        return titleDuration;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public double getRating() {
        return rating;
    }

    public void setFilmName(String titleName) {
        this.titleName = titleName;
    }

    public void setTitleYear(int titleYear) {
        this.titleYear = titleYear;
    }

    public void setTitleDuration(int titleDuration) {
        this.titleDuration = titleDuration;
    }

    public void rateTitle(double value) {
        rating += value;
        totalOfRating += 1;
    }

    public double averageRating() {
        return rating / totalOfRating;
    }
}
