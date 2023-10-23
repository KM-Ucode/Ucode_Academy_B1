package short_videos;

public class StaticDemo {

    public static void main(String[] args) {

        Statics.sayHello();

        Statics name1 = new Statics();
        //s1.sayHello();  // we can call static method through the class, also we can call it through the object
    name1.name ="James";
        System.out.println(name1.name);

        Statics name2 = new Statics();

        name2.name = "Robert";
        System.out.println(name2.name);
        System.out.println(name1.name);
    }


}
