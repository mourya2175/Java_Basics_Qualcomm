package oops;

public class Imax extends Theatre{

    public void shopping()
    {
        System.out.println("shopping is available");
    }
    public static void main(String[] args) {
        Imax i = new Imax();
        i.shopping();
        i.online();
        i.parking();

    }
}
