public class SimpleLinkedList<T> implements LinkedList<T> {
    private Node<T> head;
    private int count;

    public SimpleLinkedList() {
        this.head = null;
        this.count = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    @Override
    public void InsertAtHead(T dato) {
        Node<T> newNode = new Node<>(dato);
        newNode.setNext(head);
        head = newNode;
        count++;
    }

    @Override
    public void InsertAtEnd(T dato) {
        Node<T> newNode = new Node<>(dato);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        count++;
    }

    @Override
    public boolean DeleteOnHead() {
        if (isEmpty()) {
            return false;
        }
        head = head.getNext();
        count--;
        return true;
    }

    @Override
    public boolean DeleteAtEnd() {
        if (isEmpty()) {
            return false;
        }
        if (head.getNext() == null) {
            head = null;
        } else {
            Node<T> current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
        }
        count--;
        return true;
    }

    @Override
    public boolean contains(T dato) {
        Node<T> current = head;
        while (current != null) {
            if (current.getData().equals(dato)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}