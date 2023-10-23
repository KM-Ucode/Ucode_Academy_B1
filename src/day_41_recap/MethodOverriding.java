package day_41_recap;

public class MethodOverriding {
    String name = "name1";
    public void saySomething(){
        System.out.println("Doing Something");
    }
}
class TestOverloading extends MethodOverriding{
    String name = "Name2";

    public void showName(){
        System.out.println("Name from parent class "+super.name);
        System.out.println("Name from child class "+this.name);
    }

@Override
    public void saySomething(){
    super.saySomething();

   // System.out.println("Doing some Java");


    }
    public static void main(String[] args) {
    TestOverloading object = new TestOverloading();
    object.saySomething();
    object.showName();

    }
}
