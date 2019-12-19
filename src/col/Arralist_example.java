package col;

import java.util.ArrayList;

public class Arralist_example {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("java");
        al.add("c#");
        al.add("ruby");
        al.add("python");
        System.out.println("Number of values in list : "+al.size());
        //add elements to list
        al.add("HTML");
        al.add("angularjs");
        System.out.println("Number of values in list after adding: "+al.size());
        //get the 2nd element
        System.out.println("Get 2nd value from list : "+al.get(1));
        //remove elements from list
        al.remove("java");
        al.remove(1);
        al.remove("HTML");
        System.out.println("Number of values in list after deletin: "+al.size());

        for (int i=0; i<al.size();i++)
        {
            System.out.println("values in list are : "+al.get(i));
        }
    }
}
