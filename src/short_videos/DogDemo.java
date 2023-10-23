package short_videos;

public class DogDemo implements InterfaceDemo, Interface2{

    public void makeSound2(){
        System.out.println("Woof Woof 2");
    }
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public static void main(String[] args) {
        DogDemo dog = new DogDemo();
        dog.makeSound();
    }
}
