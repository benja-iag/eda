package models;

interface SongInterface {
    // Getters
    public String getTitle();
    public String getArtist();
    public String getYear();
    public String getId();
    public String toString();

    // Setters
    public void setTitle(String title);
    public void setArtist(String artist);
    public void setYear(String year);
    public void setId(String id);
}

/* Esta es la clase Song. Todas las canciones tendrán este formato, y deberán tener estas funciones */
public class Song implements SongInterface{
    private String title;   
    private String artist;
    private String year;
    private String id;

    public Song(String title, String artist, String year, String id) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.id = id;
    }
    
    // Getters
    public String getTitle() {
        return null;
    };
    public String getArtist() {
        return null;
    };
    public String getYear() {
        return null;
    };
    public String getId() {
        return null;
    };
    public String toString() {
        return null;
    };

    // Setters
    public void setTitle(String title) {
        this.title = title;
    };
    public void setArtist(String artist) {
        this.artist = artist;
    };
    public void setYear(String year) {
        this.year = year;
    };
    public void setId(String id) {
        this.id = id;
    };
}