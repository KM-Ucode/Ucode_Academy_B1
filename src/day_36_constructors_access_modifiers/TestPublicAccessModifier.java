package day_36_constructors_access_modifiers;

public class TestPublicAccessModifier {
    public static void main(String[] args) {


    AccessModifiers obj = new AccessModifiers();

        // obj.name1 -> name1 can be accessed from any package because it has public access modifier
        obj.method1(); // -> method1() can be accessed from any package because it has public access modifier
    // All other instance variables and methods cannot be access from other packages because
    // they don't have public access modifiers

    //AccessModifiers2 obj2 = new AccessModifiers2();
}
}
