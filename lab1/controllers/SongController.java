package controllers;

import models.Song;
import models.LinkedList;

public class SongController {
    private LinkedList songList;

    public SongController() {
        this.songList = new LinkedList();
    }

    // Agregar una canción a la lista
    public void addSong(Song song) {
        songList.add(song);
    }

    // Eliminar una canción de la lista por título
    public void deleteSongByTitle(String title) {
        Song songToDelete = songList.search(title);
        if (songToDelete != null) {
            songList.delete(songToDelete);
        } else {
            System.out.println("Canción no encontrada.");
        }
    }

    // Buscar una canción por título
    public Song searchSongByTitle(String title) {
        return songList.search(title);
    }

    // Mostrar todas las canciones
    public void displayAllSongs() {
        songList.print();
    }

    // Verificar si la lista de canciones está vacía
    public boolean isSongListEmpty() {
        return songList.isEmpty();
    }

}
