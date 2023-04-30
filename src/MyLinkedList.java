public class MyLinkedList<T> implements MyList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public boolean remove(T item) {
        if (size == 0) {
            return false;
        }
        if (head.data.equals(item)) {
            removeFirst();
            return true;
        }
        Node<T> current = head.next;
        Node<T> previous = head;
        while (current != null) {
            if (current.data.equals(item)) {
                previous.next = current.next;
                if (current == tail) {
                    tail = previous;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public void sort() {
        if (size < 2) {
            return;
        }
        Node<T> current = head;
        while (current != null) {
            Node<T> inner = current.next;
            while (inner != null) {
                if (((Comparable) current.data).compareTo(inner.data) > 0) {
                    T temp = current.data;
                    current.data = inner.data;
                    inner.data = temp;
                }
                inner = inner.next;
            }
            current = current.next;
        }
    }

    @Override
    public void removeFirst() {
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    @Override
    public void removeLast() {
        if (head == tail) {
            head = tail = null;
        } else {
            Node<T> current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
        size--;
    }
}