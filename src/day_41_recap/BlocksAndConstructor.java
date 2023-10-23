package day_41_recap;

public class BlocksAndConstructor {

    public String name;

    public BlocksAndConstructor(){
        System.out.println("Constructor"); //third
    }
    {
        name = "Testing";
        System.out.println("Instance Block"); // second
    }
    static{
        System.out.println("Static Block"); //First gets executed
    }

    public static void main(String[] args) {
        System.out.println(new BlocksAndConstructor().name);

    }
}
