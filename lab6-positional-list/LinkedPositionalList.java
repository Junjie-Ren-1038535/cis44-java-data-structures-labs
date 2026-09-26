import java.util.Iterator;

public class LinkedPositionalList<E> implements Iterable<E> {
    // --- Nested Node Class (implements Position) ---
    private static class Node<E> implements Position<E> {
        // ... element, prev, next pointers and methods ...
        E elem;
        Node<E> prev;
        Node<E> next;

        Node(Node<E> prev, Node<E> next, E elem){
            //simple constructor
            this.prev = prev;
            this.next = next;
            this.elem = elem;
        }

        public E getElement() {
            //returns element
            return elem;
        }
    }

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public LinkedPositionalList() {
        size = 0;
        // ... constructor to create sentinel nodes ...
        Node<E> head = new Node<E>(null, null, null);
        this.header = head;
        Node<E> tail = new Node<E>(head, null, null);
        this.trailer = tail;
        head.next = tail;
    }

    public Position<E> first(){
        if(header.next == trailer){
            // There is no node
            return null;
        }
        //if we get here, there are some node and we can return it
        return this.header.next;
    }

    public Position<E> last(){
        if(header.next == trailer){
            //There is no node
            return null;
        }
        //Some node here
        return this.trailer.prev;
    }
    public int getSize(){
        //return the size of the list
        return this.size;
    }
    public boolean isEmpty(){
        //check if the size is 0, if it is, the list is empty, otherwise not empty
        if(size == 0){
            return true;
        }
        return false;
    }
    public Position<E> after(Position<E> p){
        //cast the position object to a node (we secretly know it is actually a node as
        // our node class implements Position<E> but other ppl only know it as position).
        Node<E> curNode = (Node<E>)p;
        if(curNode.next == trailer){
            //if we reach this, the current node is the last node. We return null
            return null;
        }
        //if we get here, that means we can still advance.
        Position<E> n = curNode.next;
        // we will return the next node as a Position object
        return n;
    }
    public Position<E> before(Position<E> p){
        // similar things happening here but in reverse
        Node<E> curNode = (Node<E>) p;
        if(curNode.prev == header){
            //if this node = head, ret null
            return null;
        }
        //if not, then ret prev node.
        return curNode.prev;
    }
    public Position<E> addFirst(E e){
        //create new node in which the node's prev is the fake node
        // the node's next is the first node
        Node<E> newNode = new Node<>(header,header.next, e);
        // the second node is the fake node's next
        Node<E> secondNode = header.next;
        //now we set the real head with newly created node
        header.next = newNode;
        // and the prev pointer of the old first node to the new node
        secondNode.prev = newNode;
        //header.next.setPrev(newNode);
        //header.setNext(newNode);
        //increase size
        size ++;
        // ret newNode as a position
        return  newNode;
    }
    //addBefore(p, e), addAfter(p, e)
    //set(p, e), remove(p)
    public E remove(Position<E> p){
        // cast pos to node
        Node<E> cur = (Node<E>)p;
        // grab to delete node 's prev and next
        Node<E> pre = cur.prev;
        Node<E> n = cur.next;
        // set the abt deleted node's next node's prev pointer to the cur node's prev
        n.prev = pre;
        // set the cur node's prev's next pointer to cur's next
        pre.next = n;
        // now we have 1 less node to size --
        size --;
        // set all the pointer of curNode to null
        cur.prev = null;
        cur.next = null;
        // take the element before setting that to null so we can ret
        E elem = cur.elem;
        // delete that as well
        cur.elem = null;
        //ret elem
        return elem;
    }
    public E set(Position<E> p, E e) {
        // cast pos to node! countless times by this point
        Node<E> n = (Node<E>) p;
        //create a E elem and take n's elem so we can ret
        E elem = n.elem;
        // set the new element
        n.elem = e;
        // ret the old elem
        return elem;
    }
    public Position<E> addAfter(Position<E> p, E e){
        //cast cast cast by this point every method need a cast I feel like
        Node<E> prev = (Node<E>)p;
        // we are creating a new node after p, so we need the p's next
        Node<E> after = prev.next;
        // create new node with the head to the p and the next to the ole prev's next
        Node<E> newNode = new Node<E>(prev, after, e);
        // update the prev and the after's pointers
        prev.next = newNode;
        after.prev = newNode;
        // update size
        size++;
        // ret the added node as a pos obj
        return newNode;
    }
    public Position<E> addBefore(Position<E> p, E e){
        // wow, another cast!
        Node<E> after = (Node<E>)p;
        // this time we are adding before the p to we def want the cur's prev
        Node<E> prev = after.prev;
        // create the new node with it's prev pointer to the cur's prev so it is before that
        // and its next to the cur pointer
        Node<E> newNode = new Node<E>(prev, after, e);
        // update the prev and cur pointers
        prev.next = newNode;
        after.prev = newNode;
        // increase size
        size++;
        // ret new node as pos obj
        return newNode;
    }
    public Position<E> addLast(E e){
        // similar to add first
        // create new node with pointer to the fake node and the pointer to the last real
        // node as its prev
        Node<E> newNode = new Node<>(trailer.prev,trailer, e);
        // grab the last real node
        Node<E> secondNode = trailer.prev;
        // set the last node to be the new node
        trailer.prev = newNode;
        //set the prev last node's next to the new node
        secondNode.next = newNode;
        //header.next.setPrev(newNode);
        //header.setNext(newNode);
        // ----------------------- ignore above was testing something that didnt eventually work out
        // increase size since new node added
        size ++;
        // ret new node as pos obj
        return newNode;
    }

    // ... Implement all the Positional List methods ...

    // --- Nested Iterator Class ---
    private class ElementIterator implements Iterator<E> {
        Position<E> cursor = first(); // Start at the first element

        public boolean hasNext() {
            // returns true if cursor is not equal to null
            return cursor != null;
        }

        public E next() {
            // Store the element at the current cursor
            // Advance the cursor to the next position using after()
            // Return the stored element
            E elem = cursor.getElement();
            cursor = after(cursor);
            return elem;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ElementIterator();
    }
}