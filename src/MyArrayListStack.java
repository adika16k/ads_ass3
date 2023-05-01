import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    private MyArrayList<T> list;

    public MyArrayListStack(){
        list = new MyArrayList<>(); // creating constructor
    }
    public void push(T item){
        list.add(item); // add the item to the top of the stack
    }
    public boolean isEmpty() {
        return list.getSize() == 0; // return a boolean whether the stack is empty or not
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Throws an EmptyStackException if the stack is empty
        }
        return list.remove(list.getSize() - 1); // removes and returns the top item from the stack
    }
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.getSize() - 1);
    }
    public int size() {
        return list.getSize();
    }
}
