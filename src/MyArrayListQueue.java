import java.util.NoSuchElementException;
public class MyArrayListQueue<T> {
    private MyArrayList<T> list;

    public MyArrayListQueue(){
        list = new MyArrayList<>();
    }
    public void enqueue(T element){
        list.add(element);
    }
    public boolean isEmpty() {
        return list.getSize() == 0;
    }
}