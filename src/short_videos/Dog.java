package short_videos;

public class Dog extends Animal {

    public int legs;
    public void bark(){
        System.out.println(name+" is barking");
    }
    public void sound(){  //override method, to give different implementation
        System.out.println("Hello Dog");

    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Rex";
        dog1.body = "Fat";
        dog1.size = "Small";
        dog1.legs = 4;
        dog1.weight = 15;
        System.out.println(dog1.name);
        dog1.bark();
        dog1.sound(); // // Override Method
    }


}
