package col;

import java.util.HashSet;

public class HashSet_Example {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("selenium");
        hs.add("Appium");
        hs.add("soapui");
        System.out.println("Size of set is :"+hs.size());
        hs.add("restassured");
        System.out.println("Size of set is after adding:"+hs.size());
        hs.add("selenium");
        hs.add("Appium");
        hs.add("soapui");
        System.out.println("Size of set is after adding duplicates:"+hs.size());
        hs.remove("appium");
        //foreach loop to iterate over Set
        for (String values : hs)
        {
            System.out.println("Values are :"+values);
        }
    }
}
