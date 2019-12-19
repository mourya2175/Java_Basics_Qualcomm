package oops;

public class Overload_example {
    public void login()
    {
        System.out.println("username is : guest");
        System.out.println("password is : guest");
    }

    public void login(String uname, String pwd)
    {
        System.out.println("username is : "+uname);
        System.out.println("password is : "+pwd);
    }
    public void login(String uname)
    {
        System.out.println("username is : "+uname);
        System.out.println("password is : test");
    }
    public static void main(String[] args) {
        Overload_example oe = new Overload_example();
        oe.login();
        oe.login("test","123456");
        oe.login("hello");
    }
}
