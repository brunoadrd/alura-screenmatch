package br.com.alura.screenmatch.calculos;

public class RecommendationFilter {
    public void filter(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("Está em alta!");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Está bem avaliado!");
        } else {
            System.out.println("Adicione para assistir mais tarde!");
        }
    }
}
