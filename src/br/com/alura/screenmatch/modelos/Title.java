package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ConversionYearException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    private String titleName;
    private int titleYear;
    private int titleDuration;
    private boolean planIncluded;
    private double rating;
    private int totalOfRating;

    public Title(String titleName, int titleYear) {
        this.titleName = titleName;
        this.titleYear = titleYear;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.titleName = myTitleOmdb.title();

        if (myTitleOmdb.year().length() > 4) {
            throw new ConversionYearException("Não foi possível converter o ano, " +
                    "possui mais de 4 caracteres.");
        }

        this.titleYear = Integer.valueOf(myTitleOmdb.year());
        this.titleDuration = Integer.valueOf(myTitleOmdb.runtime().split(" ")[0]);
    }

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

    public void setTitleName(String titleName) {
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

    @Override
    public String toString() {
        return "(Nome = " + titleName + ", Ano de lançamento = " + titleYear +
                ", Duração = " + titleDuration + ")";
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getTitleName().compareTo(otherTitle.getTitleName());
    }
}
