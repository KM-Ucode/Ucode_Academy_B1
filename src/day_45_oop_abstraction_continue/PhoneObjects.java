package day_45_oop_abstraction_continue;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone iPhone = new Iphone("13 Pro",999.99, "6.1");
        iPhone.calling(67676767);
        iPhone.texting(78605909);
        iPhone.faceTime(87674567);
        System.out.println(iPhone);

        System.out.println("=====================================================");

        Samsung samsung = new Samsung("S22 Ultra", 1199.99, "6.7");
        samsung.calling(89567409);
        samsung.texting(98698095);
        samsung.takingPicture();
        System.out.println(samsung);
    }
}
