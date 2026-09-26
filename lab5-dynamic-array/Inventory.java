import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        //calls the list and adds the item in it.
        this.items.add(item);
    }


    public void display() {
        /* ... */
        for (Item i : items) {
            System.out.println(i.toString());
        }
    }

    public void combineItems(String name1, String name2) {
        if(name1.equals(name2)){
            //they are identical, dont do anything
            return;
        }
        boolean found1 = false;
        boolean found2 = false;
        String combined = "";
        Item i1 = null;
        Item i2 = null;

        Iterator<Item> iter = items.iterator();
        while (iter.hasNext()) {
            Item current = iter.next();
            if (current.getName().equals(name1) || current.getName().equals(name2)) {
                // How do you track which item you found?
                // How do you remove it safely?
                if(current.getName().equals(name1)){
                    //found name1 item
                    //update combined
                    combined = combined + current.getName();
                    found1 = true;
                    i1 = current;
                }
                if(current.getName().equals(name2)){
                    //found name2 item
                    //update combined
                    combined = combined + current.getName();
                    found2 = true;
                    i2 =current;
                }
            }
        }
        //we get here iff we found both items
        if(found1 && found2) {
            //see if we removed the item yet
            boolean rm1 = false;
            boolean rm2 = false;

            //using iterators again
            Iterator<Item> removeIterator = items.iterator();
            while (removeIterator.hasNext()) {
                Item cur = removeIterator.next();
                if (cur == i1 || cur == i2){
                    //if we find the same named item, we delete them
                    if(cur.getName().equals(i1.name)){
                        //we are gonna rm i1
                        rm1 = true;
                    }else{
                        //we are gonna rm i2
                        rm2 = true;
                    }
                    removeIterator.remove();
                }
                if(rm1 && rm2){
                    //dont need to remove anymore
                    break;
                }
            }
        }
        //create new item here
        if(found1 && found2){
            Item newItem = new Item(combined);
            this.addItem(newItem);
        }
        System.out.println("Combination Successful! ");
        // After the loop, check if both were found.
        // If so, add the new combined item.
        // What happens if you add the new item inside the loop?
    }
}