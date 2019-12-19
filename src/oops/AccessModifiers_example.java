package oops;

public class AccessModifiers_example {
    public void public_method()
    {
        System.out.println("Public method");
    }
    private void private_example()
        {
            System.out.println("private method");
        }
        protected void protected_example()
        {
            System.out.println("Protected method");
        }

        void default_example()
        {
            System.out.println("Default method");
        }
    public static void main(String[] args) {
        AccessModifiers_example ae = new AccessModifiers_example();
        ae.public_method();
        ae.private_example();
        ae.protected_example();
        ae.default_example();
    }
}
