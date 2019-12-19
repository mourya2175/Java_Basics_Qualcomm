package oops;

public class Child_example extends Parent_Example{

    public void method1()
    {
        System.out.println("Child class method");
//        super.method1();
    }
    public void pmethod()
    {
        //to access parent class method
        super.method1();
    }
    public static void main(String[] args) {
        Child_example ce = new Child_example();
        ce.method1();
        ce.pmethod();

    }
}
