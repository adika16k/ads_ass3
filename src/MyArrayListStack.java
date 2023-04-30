import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    private MyArrayList<T> list;

    public MyArrayListStack(){
        list = new MyArrayList<>();
    }
    public void push(T item){
        list.add(item);
    }
    public boolean isEmpty() {
        return list.getSize() == 0;
    }
}