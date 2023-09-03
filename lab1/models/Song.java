package models;

public class Song {
    private String id;
    private String title;
    private String artist;
    private String year;

    public Song(String id, String title, String artist, String year) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    // Getters
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getYear() { return year; }
    public String getId() { return id; }
    public String toString() {
        return title + " by " + artist + " (" + year + ")";
    }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setYear(String year) { this.year = year; }
    public void setId(String id) { this.id = id; }
}