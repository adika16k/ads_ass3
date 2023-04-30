public interface MyList<T> {
    int size();
    void add(T item);
    boolean remove(T item);
    void clear();
    T get(int index);
    void sort();
    T removeFirst();
    void removeLast();
}
