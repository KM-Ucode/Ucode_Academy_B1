package day_46_polymorphism_intro;

public interface Interface1 {

}
class TestInterface1 implements  Interface1{
    public static void main(String[] args){
        //Interface1 obj1 = new Interface1();  // We cannot create object of/from interface

        Interface1 obj2 = new TestInterface1();
    }
}
class A {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a instanceof Interface1); // it will print false, there is no IS-A relationship
                                                     // between class A and Interface1
    }

}
class B implements Interface1{
    public static void main(String[] args) {
        B bObject = new B();
        System.out.println(bObject instanceof Interface1);
    }



}
