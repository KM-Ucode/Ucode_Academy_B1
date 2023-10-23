package short_videos;

public class Car {

    String make;
    String model;
    int speed;

    public void drive(){
        System.out.println(make+" is driving");
    }
    public void start(){
        System.out.println(make+" is starting the engine");
    }
    public void setCarInfo(String make, String model, int speed){
        // this > is used when instance and local variable sharing/ have the same name
        this.make = make;
        this.model = model;
        this.speed = speed;

    }
    public void getCarInfo(){
        System.out.println("Car Info: "+" "+make+" "+model+" "+speed);
    }
    public String toString(){
        return make+" "+model+" "+speed;
    }
}
