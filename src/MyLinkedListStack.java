import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
    private MyLinkedList<T> list;

    public MyLinkedListStack(){
        list = new MyLinkedList<>();
    }
    public void push(T item){
        list.addFirst(item);
    }
    public T pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
    public int size() {
        return list.size();
    }
}
