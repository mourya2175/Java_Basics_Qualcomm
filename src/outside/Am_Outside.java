package outside;

import oops.AccessModifiers_example;

public class Am_Outside extends AccessModifiers_example{
    public static void main(String[] args) {
        AccessModifiers_example am = new AccessModifiers_example();
        am.public_method();
        //default can not be accessed outside package
//        am.default_example();
        //private can not be accessed in another class which is in different package
//        am.private_example();
        Am_Outside ao = new Am_Outside();
        ao.protected_example();

    }
}
