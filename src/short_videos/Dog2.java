package short_videos;

public class Dog2 extends Dog{

    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.name = "Doggy";
        dog2.bark();

    }
}
