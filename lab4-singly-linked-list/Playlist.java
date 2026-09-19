import java.util.Objects;

public class Playlist {
    private static class Node {
        Song song;
        Node next = null;
        // Node constructor...
        Node(Song song, Node next){
            this.song = song;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private Node currentNode;
    private int size;

    public Playlist() {
        this.head = null;
        this.tail = null;
        this.currentNode = null;
        this.size = 0;
    }

    public void addSong(Song song) {
        // Your implementation here...
        if (head == null){
            // There are currently no song in the playlist
            Node newNode = new Node(song, null);
            //Set this to be the head and tail
            head = newNode;
            tail = newNode;
            //increase the size
            size ++;
        }
        else{
            //There is at least one song in the playlist!
            // set the new node's next pointer to be the current head!
            Node newNode = new Node(song, null);
            // set newNode to be the tail now;
            Node lasNode = tail;
            lasNode.next = newNode;
            tail = newNode;
            // increase the size
            size ++;
        }
    }

    public void removeSong(String title) {
        // Handle two cases: removing the head and removing from elsewhere.
        // Don't forget to update the tail if the last song is removed.

        //start from the head
        Node curNode = this.head;
        if(curNode == null){
            //There isn't any song to remove;
            return;
        }
        if(curNode.equals(this.head) && curNode.equals(this.tail)){
            //There is only one node and its at head and tail
            this.head = null;
            this.tail = null;
            size --;
            return;
        }
        if(curNode.song.title.equals(title)){
            //found target at head
            //there are more than 1 node
            //replace it with curNode's next;
            this.head = curNode.next;
            size--;
            return;
        }
        while(curNode.next != null){
            //while we still have node to go through
            if(curNode.next.song.title.equals(title)){
                // we get here if we find out target to remove, which is the next node
                Node nextNode = curNode.next;
                curNode.next = nextNode.next;
                if(nextNode.next == null){
                    //nextNode is our last node
                    tail = curNode;
                }
                size --;
                return;
            }
            //move forward to the next node
            curNode = curNode.next;
        }
    }

    public void playNext() {
        // If currentNode is null, start from the head.
        // Otherwise, advance to the next node.
        // If you reach the end, loop back to the head.
        if(currentNode == null){
            currentNode = head;
        }
        else if(currentNode.next == null){
            currentNode = head;
        }
        else{
            currentNode = currentNode.next;
        }
    }

    public void displayPlaylist() {
        // Traverse from the head and print each song.
        // Create a node at the start and traverse it until it is null.
        Node Traverse = this.head;
        System.out.println("Playlist: ");
        while(Traverse != null){
            //print out the information
            System.out.println(Traverse.song.getTitle() + " By: " + Traverse.song.getArtist());
            //move on to the next node;
            Traverse = Traverse.next;
        }
    }
}
