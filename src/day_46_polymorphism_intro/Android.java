package day_46_polymorphism_intro;

public class Android extends Phone implements AndroidApps{
    static{
        brand = "Samsung Ultra 22";
    }
    public Android(String model, double price,String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }
    @Override
    public void download(){
        System.out.println("User of Samsung Ultra 22 is downloading image");
    }
    @Override
    public void texting(long phoneNumber){
        System.out.println("User of Samsung Ultra 22 is texting");
    }
    @Override
    public void calling(long phoneNumber){
        System.out.println("User of Samsung Ultra 22 is calling");
    }
    public void picture(long phoneNumber){
        System.out.println("User of Samsung Ultra 22 is taking picture");

    }
}
