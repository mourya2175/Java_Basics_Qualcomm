package sample;

public class Switch_Example {

    public static void main(String args[])
    {
        int day=6;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }
    }
}
