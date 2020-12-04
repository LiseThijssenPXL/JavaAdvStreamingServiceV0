package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {

    public static final int LONG_PLAYING_TIME = 135 ;
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;


    public Movie(String title, Rating rating) {
        super(title, rating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int year, int month, int day) {
        this.releaseDate = LocalDate.of(year,month,day);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public String toString(){
       String output = super.getTitle();
       if(this.releaseDate != null){
           int year = releaseDate.getYear();
           output += " ";
           output += year;
       }

        return output;
    }

    public boolean isLongPlayingTime() {
        boolean isLongPlayingTime = false;
        if(this.getDuration() >= 135){
            isLongPlayingTime = true;
        }
        return isLongPlayingTime;
    }


}


