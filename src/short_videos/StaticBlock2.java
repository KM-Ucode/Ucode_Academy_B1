package short_videos;

public class StaticBlock2 {
    static int a;
    static int b;
    static String name;
    static {
        a = 10;
        b = 20;
        name = "Java";
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
    }
}
