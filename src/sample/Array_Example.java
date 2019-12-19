package sample;

public class Array_Example {
    public static void main(String args[])
    {
        int marks[]={55,67,45,87,99,34};
        String at[]={"selenium","qtp","test complete","ranorex"};
        //values available in array
        System.out.println("Number of values in array :"+at.length);
        System.out.println("Get nd values from array :"+at[1]);

        for (int i=0; i<at.length; i++)
        {
            System.out.println("values in array are :"+at[i]);
        }


    }

}
