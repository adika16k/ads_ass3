public interface Mylist1<T> {
    void add(T element);
    void changeSize();
    void displayElements();
    T get(int index);
    void clear();
    void remove(int index);
    int getSize();
    void sort();
    void removeLast();
    void removeFirst();
    void deleteDuplicate();
}
