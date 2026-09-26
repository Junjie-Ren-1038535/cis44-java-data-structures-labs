import java.util.ArrayList;
import java.util.Iterator;

public class LinkedPositionalListMain {
    public static void main (String[] args) {
        /*//Calls for a list of integers with pos
        LinkedPositionalList<Integer> IntegerList = new LinkedPositionalList<>();
        // adds 0 at first list: 0
        IntegerList.addFirst(0);
        // ret a pos to first
        Position<Integer> first = IntegerList.first();
        // add 42 before first, list: 42, 0
        IntegerList.addBefore(first, 42);
        // ret first pos to first
        first = IntegerList.first();
        // add 33 to after first pos, List: 42, 33, 0
        IntegerList.addAfter(first, 33);
        Iterator<Integer> iter = IntegerList.iterator();
        while (iter.hasNext()){
            Integer e = iter.next();
            System.out.println(e);
        }
        System.out.println("--- separation line ---");
        ArrayList<Position<Integer>> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            //List: 42, 33, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            // list of pos: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            list.add(IntegerList.addLast(i));
        }
        // the list is now 42, 33, 0, 172, 1, 2, 3, 4, 5, 6,7,8,9 after the below line
        IntegerList.set(list.getFirst(), 172);
        iter = IntegerList.iterator();
        //iterate thru the list and print out
        for(int i = 0; i < IntegerList.getSize(); i++){
            System.out.println(iter.next());
        }
        System.out.println("--- separation line ---");
        // add a element -1 to the first of the integer list and get its pos
        Position<Integer> pos = IntegerList.addFirst(-1);
        // remove the 9
        IntegerList.remove(list.getLast());
        //iterate it thru again.
        iter = IntegerList.iterator();
        for(int i = 0; i < IntegerList.getSize(); i++){
            System.out.println(iter.next());
        }
        System.out.println("--- separation line ---");
        //while pos != null, we will have nextpos = the object after position
        // then we will remove the element in the cur pos
        // we set the pos to the next pos
        // when next pos == null, this won't run, signifying we hit the end which is
        // our fake node
        while(pos != null){
            Position<Integer> nextpos = IntegerList.after(pos);
            IntegerList.remove(pos);
            pos = nextpos;
        }
        System.out.println("Integer List size: " + IntegerList.getSize());

         */
        LinkedPositionalList<String> Travel = new LinkedPositionalList<>();
        Travel.addFirst("Oregon");
        Position<String> pos = Travel.addFirst("Washington");
        Travel.addAfter(pos, "Colorado");

        for(String location : Travel){
            System.out.println(location);
        }
        // for more comprehensive test please try the commented out code in which
        // a LinkedPositionalList<Integer> is used to play around with each method
        // that was implemented with full comment.
    }
}