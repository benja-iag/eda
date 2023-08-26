package controllers;

import models.Song;
import models.Stack;

public class HistoryController {
    private Stack history;

    public HistoryController() {
        this.history = new Stack();
    }

    // Añadir una canción al historial
    public void addSongToHistory(Song song) {
        history.push(song);
    }

    // Obtener y eliminar la última canción reproducida del historial
    public Song getLastPlayedSong() {
        return history.pop();
    }

    // Ver la última canción reproducida sin eliminarla del historial
    public Song peekLastPlayedSong() {
        return history.peek();
    }

    // Verificar si hay canciones en el historial
    public boolean hasSongsInHistory() {
        return !history.isEmpty();
    }

    // Mostrar todas las canciones en el historial
    public void displayHistory() {
        history.print();
    }

}
