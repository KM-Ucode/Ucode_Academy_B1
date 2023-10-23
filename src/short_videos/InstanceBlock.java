package short_videos;

public class InstanceBlock {

    //	Instance initialization block or instance initializer:
    //	belongs to object, execution depends on the object
    //  it gets executed whenever an instance of that class created.

    {
        System.out.println("I am instance initializer");
    }
    String name;
    int a;
    {
        name = "java";
        a = 13;
    }

    public static void main(String[] args) {
        InstanceBlock s = new InstanceBlock();
        InstanceBlock s2 = new InstanceBlock();

    }
}
