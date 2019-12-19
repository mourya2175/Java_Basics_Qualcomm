package oops;

public class Encapsulation_Use {
    public static void main(String[] args) {
        Encapsulation_Example ee = new Encapsulation_Example();
        ee.setEmpID(2175);
        ee.setEmpName("Naga");
        System.out.println("Employee ID is : "+ee.getEmpID());
        System.out.println("Employee Name is : "+ee.getEmpName());

    }
}
