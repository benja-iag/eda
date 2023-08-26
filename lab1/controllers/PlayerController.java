package controllers;

import models.Song;
import models.Queue;

public class PlayerController {
    private Queue playlist;

    public PlayerController() {
        this.playlist = new Queue();
    }

    // Añadir una canción a la lista de reproducción
    public void addSongToPlaylist(Song song) {
        playlist.enqueue(song);
    }

    // Reproducir la siguiente canción
    public Song playNextSong() {
        return playlist.dequeue();
    }

    // Ver la próxima canción a reproducir sin sacarla de la lista
    public Song peekNextSong() {
        return playlist.peek();
    }

    // Ver la última canción añadida a la lista de reproducción
    public Song peekLastAddedSong() {
        return playlist.peekTail();
    }

    // Verificar si hay canciones en la lista de reproducción
    public boolean hasSongsInPlaylist() {
        return !playlist.isEmpty();
    }

    // Mostrar todas las canciones en la lista de reproducción
    public void displayPlaylist() {
        playlist.print();
    }

}
