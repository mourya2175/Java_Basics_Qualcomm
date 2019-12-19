package oops;

public class HDFCBank implements RBI_INterface {
    @Override
    public void deposit() {
        System.out.println("Deposit is 1 lack");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw is 50k");

    }

    public static void main(String[] args) {
        HDFCBank hb = new HDFCBank();
        hb.deposit();
        hb.withdraw();
    }
}
