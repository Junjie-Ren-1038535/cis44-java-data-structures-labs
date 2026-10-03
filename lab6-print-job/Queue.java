public interface Queue<E>{
    public void enqueue(E e);
    public E peek();
    public E dequeue();
    public boolean isEmpty();
    public int GetSize();
}
