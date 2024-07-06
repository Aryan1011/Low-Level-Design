package lld.designPatterns.hashMapImplementation;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> map = new MyHashMap<>(7);
        map.put(1,"Hi");
        map.put(1,"My");
        map.put(1,"Name");
        map.put(1,"is");
        map.put(1,"Aryan");
        map.put(1,"How");
        map.put(1,"are");
        map.put(1,"you");
        map.put(1,"friends");
        map.put(1,"?");

        String value = map.get(8);
        System.out.println(value);
    }
}
