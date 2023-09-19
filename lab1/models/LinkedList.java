package models;

interface LinkedListInterface {
    // Agrega una canción al final de la lista
    public void add(Song song);

    // Elimina una canción específica de la lista
    public void delete(Song song);

    // Buscar una canción por título
    public Song search(String title);

    // Revisa si la lista está vacía
    public boolean isEmpty();

    // Imprimir todas las canciones
    public void print();
}

public class LinkedList implements LinkedListInterface {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Agrega una canción al final de la lista
    public void add(Song song) {
        if (this.head == null) {
            this.head = new Node(song);
        } else {
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(song));
        }
    }

    // Elimina una canción específica de la lista
    public void delete(Song song) {
    }

    // Buscar una canción por título
    public Song search(String title) {
        return null;
    }

    // Revisa si la lista está vacía
    public boolean isEmpty() {
        return true;
    }

    // Imprimir todas las canciones
    public void print() {
        System.out.println("Canciones:");
        Node current = this.head;
        while (current != null) {
            System.out.println(current.getSong().toString());
            current = current.getNext();
        }
    }
}