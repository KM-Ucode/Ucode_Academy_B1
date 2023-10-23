package day_37_review_and_oop_encapsulation;

public class Constructors {

    public String firstName;
    protected String lastName;
    int age;
    private long ssn;

    private Constructors(){  // This Constructor prevents creating an object outside
                             // of this class
    }
    public Constructors(int num){
        System.out.println();
    }

//    public Constructors(String firstName, String lastName, int age, long ssn){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.ssn = ssn;
//        method1();
//        method2(10);
//
//    }

    public String toString(){

        return firstName+" "+lastName+" "+age;
    }
    public void  method1(){

        System.out.println("Hello");
    }
    public static int method2(int num){

        return num;
    }
}
