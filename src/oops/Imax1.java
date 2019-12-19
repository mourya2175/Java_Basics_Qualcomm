package oops;

public class Imax1 extends Imax{

    public void entertainment()
    {
        System.out.println("entertainment is available");
    }

    public static void main(String[] args) {
        Imax1 i = new Imax1();
        i.shopping();
        i.online();
        i.parking();
        i.entertainment();

    }
}
