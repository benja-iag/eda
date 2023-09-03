public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        /* Crear LinkedList */
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();

        /* Insertar elementos */
        list.InsertAtHead(1);
        list.InsertAtHead(2);
        list.InsertAtHead(3);
        list.InsertAtEnd(4);

        System.out.println(list.getHead().getData());

    }

}
