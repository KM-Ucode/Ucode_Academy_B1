package day_41_recap;

public class ConstructorCalls {

    public ConstructorCalls(){
        this("Java"); // calling string arg constructor in current class
        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int num){
        this();
        System.out.println(num);
    }
    public ConstructorCalls(String str){
        System.out.println(str);
    }
}
class Testing extends ConstructorCalls{

    public Testing(){
        super("Java");// it calls parent/super class's string arg constructor
    }
    public Testing(int a){
        super();  // it calls parent/super class's default constructor
    }
}
