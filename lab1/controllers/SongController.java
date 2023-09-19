package controllers;

import models.*;

public class SongController {
    private LinkedList songList;

    public SongController() {
        this.songList = new LinkedList();
    }

    public void addSong(Song song) {
        this.songList.add(song);
    }

    public void printAllSongs() {
        this.songList.print();
    }

    /* Complementar con funciones faltantes! */

}
