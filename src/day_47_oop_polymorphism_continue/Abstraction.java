package day_47_oop_polymorphism_continue;

public abstract class Abstraction {
    public abstract void doSomeMath(int a, int b);
    public void test1(){
        System.out.println();
    }
}


class TestAbstraction extends Abstraction {

    public void doSomeMath(int x, int y){

        System.out.println(x * y);

    }

    public static void main(String[] args) {

        TestAbstraction obj = new TestAbstraction();
        obj.doSomeMath(20, 5);
    }
}
