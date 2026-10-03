import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayStack<E> implements Stack<E>{
    private ArrayList<E> arr;
    public ArrayStack(int capacity){
        arr = new ArrayList<E>(capacity);
    }
    public void push(E e){
        arr.addLast(e);
    }
    public E pop() throws NoSuchElementException{
        if(!isEmpty()){
            E retItem = arr.getLast();
            arr.removeLast();
            return retItem;
        }
        else{
            throw new NoSuchElementException("No item in stack to pop");
        }
    }
    public E peek(){
        if(!isEmpty()){
            return arr.getLast();
        }
        else{
            return null;
        }
    }
    public boolean isEmpty(){
        if(arr.isEmpty()){
            return true;
        }
        return false;
    }
    public int getSize(){
        return arr.size();
    }
}
