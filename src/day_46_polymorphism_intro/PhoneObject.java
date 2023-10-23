package day_46_polymorphism_intro;

public class PhoneObject {
    public static void main(String[] args) {


    iPhone iPhone11 = new iPhone("11 Pro", 999.9, "6.1");
        System.out.println(iPhone11);
        iPhone11.texting(826928023);
        iPhone11.calling(958049580);
        iPhone11.faceTime(959674058);
        iPhone11.download();

        System.out.println("==========================================");

        Android SamsungUltra = new Android("22 Ultra",1299.00, "6.8");
        SamsungUltra.texting(789769480);
        SamsungUltra.calling(756980498);
        SamsungUltra.picture(585779855);
        SamsungUltra.download();

    }
}
