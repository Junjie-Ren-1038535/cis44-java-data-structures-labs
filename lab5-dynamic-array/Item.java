import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Item {
    String name;
    // Constructor, getter, toString...
    Item(String name){
        //Typical Constructor
        this.name = name;
    }
    public String getName(){
        //Typical Getter
        return name;
    }
    public void setName(String name){
        //Typical setter
        this.name = name;
    }
    public String toString(){
        //toString Method that returns "Item: x " where x = name of the item
        return "Item: " + name + " ";
    }
}

