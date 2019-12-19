package oops;

public class AxisBank implements RBI_INterface{
    @Override
    public void deposit() {
        System.out.println("Deposit limit is 50k per day");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw limit is 20k per day");
    }

    public static void main(String[] args) {
        AxisBank ab = new AxisBank();
        ab.deposit();
        ab.withdraw();
    }
}
