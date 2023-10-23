package day_34_statics_continue_instance_block;

public class StaticsReview1 {
    //Statics methods can not access instance methods and instance variables directly

    String name;   // instance variable also known as field
    int id;
    boolean isTrue;
    static String name2;
    static int number;
// Instance method can access instance method, instance variable, static method and static variable directly
    public void sayHello(){
        System.out.println("Hello");
        name2 = "API";
        number = 33;
        this.id = 9999;
       // this.name2 = "API"; We can use "this" keyword in instance method for static variable but not recommended
        StaticsReview1.name2 = "API"; //We can also call static variable in instance method
                                      // through the class name
        number = 33;
        iAmStaticMethod();
    }
    //Statics methods can not access instance methods and instance variables directly
    public  static void testStaticMethod(){
//        name = "Jake";
//        id = 12;
//        isTrue = true;
      //  sayHello();
      //  this.name2 = "Java"; // We can not use "this" keyword in static method

        name2 = "Java";
        number = 123;
        iAmStaticMethod();

    }
    public static void iAmStaticMethod(){
        System.out.println("Hello static method");
    }
}
