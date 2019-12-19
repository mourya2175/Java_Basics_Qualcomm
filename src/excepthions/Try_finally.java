package excepthions;

public class Try_finally {
    public static void main(String[] args) {

        try
        {
            System.out.println("Start the service");
            int i =15;
            System.out.println("division is :"+(i/0));

        }
        catch (Exception e)
        {
            System.out.println("This is divided by zero exception, please eter some value except zero");
            e.printStackTrace();
        }
        finally {
            System.out.println("Stop the service");
        }
    }
}
