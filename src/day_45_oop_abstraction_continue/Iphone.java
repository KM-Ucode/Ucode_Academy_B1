package day_45_oop_abstraction_continue;

public class Iphone extends Phone {

    public void calling(long phoneNumber) {
        System.out.println("iPhone user is Calling" + phoneNumber);
    }

    public void texting(long phoneNumber) {
        System.out.println("iPhone user is Texting " + phoneNumber);
    }

    public void faceTime(long phoneNUmber) {
        System.out.println("iPhone user is using Face Time " + phoneNUmber);
    }

    public Iphone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }
    static{
        brand = "iPhone";
    }

}
