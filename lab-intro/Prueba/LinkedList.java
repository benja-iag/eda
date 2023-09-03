public interface LinkedList<T> {
    void InsertAtHead(T dato);
    void InsertAtEnd(T dato);
    boolean DeleteOnHead();
    boolean DeleteAtEnd();
    boolean contains(T dato);
    int size();
    boolean isEmpty();
}