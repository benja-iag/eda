package models;

public class Queue {
    private Node front, tail;

    private class Node {
        Song song;
        Node next;

        Node(Song song) {
            this.song = song;
            this.next = null;
        }
    }

    // Añadir una canción al final de la cola (rear)
    public void enqueue(Song song) {
        
        Node new_enqueued = new Node(song);

        /* si front es null, tail también debería serlo. */
        if (this.front == null || tail == null) {
            this.front = new_enqueued;
            this.tail = new_enqueued;
            return;
        } 

        this.tail.next = new_enqueued;
        this.tail = new_enqueued;
    }

    // Sacar una canción del frente de la cola. retorna la canción y la elimina el nodo.
    public Song dequeue() {
        if (front == null) {
            return null;
        } 

        Song temp_front = this.front.song;
        this.front = this.front.next;

        return temp_front;
    }

    // "Mirar" la canción del frente de la cola
    public Song peek() {
        if (front == null) {
            return null;
        } 

        return this.front.song;
    }

    // "Mirar" la canción del final de la cola
    public Song peekTail() {
        if (tail == null) {
            return null;
        } 

        return this.tail.song;
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return this.front == null;
    }

    // Imprimir la cola
    public void print() {
        Node current = this.front;

        while (current != null) {
            System.out.println(current.song);
            current = current.next;
        }
    }
}