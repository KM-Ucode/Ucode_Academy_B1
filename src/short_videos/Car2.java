package short_videos;

public class Car2 extends Vehicle {

int year;
public Car2 (String brand, int year){
    super(brand);
    this.year = year;
}
public void showCarInfo(){
    super.showBrand();
    System.out.println("Year: "+year);
}

    public static void main(String[] args) {
        Car2 car2 = new Car2("Audi", 2023);
//        System.out.println(car2.year);
//        System.out.println(car2.brand);
        //instead of above method we can use below method
        car2.showCarInfo();
    }



    }
