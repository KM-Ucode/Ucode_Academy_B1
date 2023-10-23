package short_videos;

public class DogTest extends Animals{

    public void makeSound(){
        System.out.println("Woof Woof");
    }
    public static void main(String[] args){
        DogTest dog1 = new DogTest();
        dog1.makeSound();
    }

}
