package oops;

public class Am_Withinpackage {

    public static void main(String[] args) {
        AccessModifiers_example am = new AccessModifiers_example();
        //public can be accessed with in package
        am.public_method();
        //private can not be accessed in another class
        //am.private_example();
        am.protected_example();
        am.default_example();
    }
}
