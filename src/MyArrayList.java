
public class MyArrayList<T> implements Mylist1<T> {
    private Object[] array; // Object it is when elements can take all reference types like String, Integer and etc
    private int size; // size its length of array

    MyArrayList() {
        this.array = new Object[10];
        this.size = 0;
    }

    @Override
    public void add(T element) {
        if (size == array.length) { // it checks if array is full by comparing its size and length
            changeSize();
        }
        array[size++] = element;  // if true size increased by 1 and after that we can add an element
    }

    @Override
    public void changeSize() {
        Object[] newArray = new Object[array.length * 2]; // creating new array which length will be more twice than first array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i]; // giving new array elements of first array
        }
        array = newArray;
    }

    @Override
    public void displayElements() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " "); // to write console all elements of array
        }
    }

    @Override
    public T get(int index) {
        return (T) array[index]; // get inputed index of array
    }

    @Override
    public void clear() {
        this.array = (T[]) new Object[5]; // it's like to update the array for zero
        this.size = 0;
    }

    @Override
    public T remove(int index) {
        T removedElement = (T) array[index];
        for (int i = index + 1; i < size; i++) { // remove given index of element
            array[i - 1] = array[i];
        }
        size--;
        return removedElement;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void sort() {
        int temp = 0; // it's bubble sort of array
        for (int i=0;i<array.length;i++){  // bubble sort is to compare all elements of array by two elements
            for(int j=1;j< array.length-i;j++){
                if (array[j-1] != null && array[j] != null && (int) array[j-1] > (int) array[j]){
                    temp = (int) array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    @Override
    public void removeLast() {
        size--; // to remove last element of array we can just decrease size for by one
    }

    @Override
    public void removeFirst() {
        for (int i=0; i<size-1;i++){
            array[i] = array[i+1]; // it's method to remove first element of array
        }
        size--;
    }

    @Override
    public void deleteDuplicate() {
        for (int i=0; i< size; i++){
            for (int j=1; j< size+1; j++)
                if (array[i] == array[j] && j>i)
                    remove(j);
        }
    }
}
