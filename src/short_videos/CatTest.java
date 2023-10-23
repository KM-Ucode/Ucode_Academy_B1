package short_videos;

public class CatTest extends Animals{

    public void makeSound(){
        System.out.println("Meow Meow");
    }

    public static void main(String[] args) {
        CatTest cat = new CatTest();
        cat.makeSound();
    }
}
