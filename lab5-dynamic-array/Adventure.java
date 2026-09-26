public class Adventure {
    public static void main(String[] args){
        Item Gold = new Item("Gold");
        Item Apple = new Item("Apple");
        Inventory inventory = new Inventory();
        inventory.addItem(Gold);
        inventory.addItem(Apple);
        inventory.display();
        inventory.combineItems("Gold", "Apple");
        inventory.display();
    }
}