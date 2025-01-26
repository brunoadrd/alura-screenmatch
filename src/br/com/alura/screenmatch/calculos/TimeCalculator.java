package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void addTitle(Title title) {
        this.totalTime += title.getTitleDuration();
    }
}
