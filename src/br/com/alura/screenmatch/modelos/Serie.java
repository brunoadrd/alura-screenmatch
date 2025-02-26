package br.com.alura.screenmatch.modelos;

public class Serie extends Title {
    private int seasons;
    private boolean active;
    private int episodesForSeasons;
    private int minutesPerEpisodes;

    public Serie(String titleName, int titleYear) {
        super(titleName, titleYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesForSeasons() {
        return episodesForSeasons;
    }

    public void setEpisodesForSeasons(int episodesForSeasons) {
        this.episodesForSeasons = episodesForSeasons;
    }

    public int getMinutesPerEpisodes() {
        return minutesPerEpisodes;
    }

    public void setMinutesPerEpisodes(int minutesPerEpisodes) {
        this.minutesPerEpisodes = minutesPerEpisodes;
    }

    @Override
    public int getTitleDuration() {
        return seasons * episodesForSeasons * minutesPerEpisodes;
    }

    @Override
    public String toString() {
        return "Série: " + this.getTitleName() + " (" + this.getTitleYear() + ")";
    }
}
