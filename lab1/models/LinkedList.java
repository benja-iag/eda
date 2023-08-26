package models;

import models.Song;

public class LinkedList {
    private Node head;

    private class Node {
        Song song;
        Node next;

        Node(Song song) {
            this.song = song;
            this.next = null;
        }
    }

    // Agrega una canción al final de la lista
    public void add(Song song) {
        
        Node current = this.head;

        if (current == null) {
            current = new Node(song);
            return;
        } 

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(song);
    }

    // Elimina una canción específica de la lista
    public void delete(Song song) {
        
        Node current = this.head;

        if (current == null) {
            return;
        } 
        
        if (current.song == song) {
            head = current.next;
            return;
        } 
        
        while (current.next != null) {
            if (current.next.song == song) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Buscar una canción por título
    public Song search(String title) {

        Node current = this.head;

        while (current != null) {

            if (current.song.getTitle().equals(title)) {
                return current.song;
            }

            current = current.next;

        }

        return null;
    }

    // Revisa si la lista está vacía
    public boolean isEmpty() {
        return this.head == null;
    }

    // Imprimir todas las canciones
    public void print() {

        Node current = this.head;

        while (current != null) {
            System.out.println(current.song);
            current = current.next;
        }

    }

}