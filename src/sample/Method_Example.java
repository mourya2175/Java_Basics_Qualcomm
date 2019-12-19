package sample;

public class Method_Example {

    public void method1()
    {
        System.out.println("Tis is my new method");
    }

    public static void main(String args[])
    {
        System.out.println("This is my main method");
        //create an object for the class
        Method_Example me = new Method_Example();
        me.method1();

    }
}
