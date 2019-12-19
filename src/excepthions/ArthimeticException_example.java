package excepthions;

public class ArthimeticException_example {
    public static void main(String[] args) {
        try
        {
            int i =15;
            System.out.println("division is :"+(i/5));
        }
        catch (Exception e)
        {
            System.out.println("This is divided by zero exception, please eter some value except zero");
        }

    }

}
