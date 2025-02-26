package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Title;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainWithLists {
    public static void main(String[] args) {
        var myMovie = new Movie("DogVille", 2003);
        myMovie.rateTitle(9);
        var firstMovie = new Movie("O Poderoso Chefão", 1970);
        firstMovie.rateTitle(8);
        var lost = new Serie("Lost", 2000);
        lost.rateTitle(10);

        ArrayList<Title> list = new ArrayList<>();
        list.add(myMovie);
        list.add(firstMovie);
        list.add(lost);

        for (Title item: list) {
            //if (item instaceof Movie movie && movie.xxx > 2) ...
            System.out.println(item.getTitleName());
            System.out.println(item.averageRating());
        }

        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.comparing(Title::getTitleYear));

        System.out.println(list);
    }
}
