package oops;

public class Inox extends Theatre{

    public void foodcourt()
    {
        System.out.println("foodcourt is available");
    }
    public static void main(String[] args) {
        Inox in = new Inox();
        in.foodcourt();
        in.online();
        in.parking();

    }
}
