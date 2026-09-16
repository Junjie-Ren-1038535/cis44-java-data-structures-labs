public class DynamicArray<T> {
    private T [] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;
    private int capacity = 10;
    public DynamicArray(){
        this.data = (T[]) new Object[INITIAL_CAPACITY];
    }
    private void resize(){
        T [] temp = (T[]) new Object[size * 2];
        for(int i = 0; i < capacity; i++){
            temp[i] = data[i];
        }
        data = temp;
        capacity = size * 2;
    }
    public void add(T elem){
        if(size >= capacity){
            resize();
            data[size] = elem;
            size ++;
        }
        else {
            data[size] = elem;
            size ++;
        }
    }
    public int size(){
        return this.size;
    }
    public T get(int index) throws IndexOutOfBoundsException{
        if(index > size){
            throw new IndexOutOfBoundsException("Index Out of Bound");
        }
        else{
            return data[index];
        }
    }
    public T remove(int index) throws IndexOutOfBoundsException{
        if(index > size){
            throw new IndexOutOfBoundsException("Index Out of Bound");
        }
        else{
            T item = data[index];
            for(int i = index + 1; i < size; i++){
                data[i-1] = data [i];
            }
            size --;
            return item;
        }
    }
}