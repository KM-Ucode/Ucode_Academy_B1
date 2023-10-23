package short_videos;

public class TestAccess {
    public static void main(String[] args) {

        AccessModifiers obj2 = new AccessModifiers();
        System.out.println(obj2.publicAccess);

        System.out.println(obj2.protectedAccess);

        System.out.println(obj2.defaultAccess);

        System.out.println(obj2.getPrivateAccess());

        obj2.publicAccess = "I changed it";
        System.out.println(obj2.publicAccess);

        obj2.setPrivateAccess("I changed it using setter method");
        System.out.println(obj2.getPrivateAccess());
    }
}
