import java.util.NoSuchElementException;
public class MyArrayListQueue<T> {
    private MyArrayList<T> list;

    public MyArrayListQueue(){
        list = new MyArrayList<>();
    }
    public void enqueue(T element){
        list.add(element); // add the element to the end of the queue
    }
    public boolean isEmpty() {
        return list.getSize() == 0; // return a boolean whether the queue is empty or not
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty"); // Throws a NoSuchElementException if the queue is empty
        }
        return list.remove(0); //  removes and returns the element at the front of the queue
    }
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty"); // Throws a NoSuchElementException if the queue is empty
        }
        return list.get(0); // return the element at the front of the queue without removing it
    }
    public int size() {
        return list.getSize();
    }
}
