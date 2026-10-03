public class LinkedQueue<E> implements Queue<E>{
    private static class Node<E>{
        Node<E> next;
        E data;
        Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;
    LinkedQueue(){
        Node<E> a = new Node<>(null, null);
        head = a;
        Node<E> b = new Node<>(null, null);
        tail = b;
        a.next = b;
    }
    public void enqueue(E e){
        Node<E> newNode = new Node<>(null, null);
        this.tail.data = e;
        this.tail.next = newNode;
        this.tail = newNode;
        size ++;
    }
    public E peek(){
        if(!isEmpty()) {
            Node<E> retNode = this.head.next;
            return retNode.data;
        }
        return null;
    }
    public E dequeue(){
        if(!isEmpty()){
            Node<E> retNode = this.head.next;
            Node<E> newHead = this.head.next.next;
            this.head.next = newHead;
            size --;
            return retNode.data;
        }
        return null;
    }
    public boolean isEmpty(){
        if(this.head.next == this.tail){
            return true;
        }
        return false;
    }
    public int GetSize(){
        return this.size;
    }
}
