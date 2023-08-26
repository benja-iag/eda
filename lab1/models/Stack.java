package models;

public class Stack {
    private Node top;

    private class Node {
        Song song;
        Node next;

        Node(Song song) {
            this.song = song;
            this.next = null;
        }
    }

    // Esta función inserta una canción en el top de la pila
    public void push(Song song) {

        this.top.next = new Node(song);
        this.top = this.top.next;

    }

    // Esta función saca una canción del top de la pila
    public Song pop() {

        Song temp_top = this.top.song;
        this.top = this.top.next;
        return temp_top;

    }

    // Esta función "mira" la canción del top de la pila
    public Song peek() {

        return this.top.song;

    }

    // Esta función "mira" la canción del fondo de la pila
    public boolean isEmpty() {

        return this.top == null;

    }

    // Esta función imprime la pila
    public void print() {

        Node current = this.top;

        while (current != null) {
            System.out.println(current.song);
            current = current.next;
        }

    }
}
