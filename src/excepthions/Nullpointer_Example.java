package excepthions;

public class Nullpointer_Example {
    public static void main(String[] args) {
        String x = "selenium";
        System.out.println("Length of string : "+x.length());
        String y = null;
        System.out.println("Length of string y: "+y.length());
    }
}
