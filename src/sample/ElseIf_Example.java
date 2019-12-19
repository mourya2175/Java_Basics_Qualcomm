package sample;

public class ElseIf_Example {

    public static void main(String args[])
    {
       int marks=55;

       if (marks>85)
       {
           System.out.println("distinction");
       }
       else if (marks > 75 && marks <85)
       {
           System.out.println("First class");
       }
       else if (marks > 50 && marks <75)
       {
           System.out.println("second class");
       }
       else
       {
           System.out.println("failed");
       }
    }
}
