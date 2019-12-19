package col;

import java.util.HashMap;

public class Hashmap_Example {
    public static void main(String[] args) {
        HashMap<Integer,String> hs = new HashMap<>();
        hs.put(2175,"Naga");
        hs.put(123,"ross");
        hs.put(345,"raju");
        hs.put(456,"don");
        System.out.println("size of map is :"+hs.size());
        System.out.println("Value in key 2175 is : "+hs.get(2175));
    }
}
