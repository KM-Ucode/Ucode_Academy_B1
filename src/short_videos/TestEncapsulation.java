package short_videos;

public class TestEncapsulation {

    public static void main(String[] args) {

        Encapsulation obj1 = new Encapsulation();

        obj1.setSsn(123456);

        obj1.setDateOfBirth("December 1, 1998");

        System.out.println(obj1.getSsn());
        System.out.println(obj1.getDateOfBirth());

        Encapsulation obj2 = new Encapsulation();
    }
}
