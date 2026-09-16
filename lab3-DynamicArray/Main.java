public class Main {
    public static void main(String[] args){
        DynamicArray<Integer> v = new DynamicArray<>();
        for(int i = 0; i < 11; i++){
            v.add(i);
        }
        Integer a = v.remove(5);
        for(int i = 0; i < v.size(); i++){
            System.out.println(v.get(i));
        }
        v.add(20);
        for(int i = 0; i < v.size(); i++){
            System.out.println(v.get(i));
        }
    }
}