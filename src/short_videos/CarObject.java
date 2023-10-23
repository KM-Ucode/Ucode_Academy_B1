package short_videos;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car();

//        car1.make = "Mercedes";
//        car1.model = "E350";
//        car1.speed = 260;

        car1.setCarInfo("Mercedes", "E350",260); // Instead of method above we can use this method

        car1.start();
        car1.drive();
        car1.getCarInfo();

        System.out.println(car1);// you get hashcode if you print directly, thus we have to create String


//        System.out.println(car1.make);
//        System.out.println(car1.model);
//        System.out.println(car1.speed);

        System.out.println("==============================");

        Car car2 = new Car();
//        car2.make = "Audi";
//        car2.model = "Q5";
//        car2.speed = 250;

        car2.setCarInfo("Audi", "Q5", 250);

        car2.start();
        car2.drive();
        car2.getCarInfo();

//        System.out.println(car2.make);
//        System.out.println(car2.model);
//        System.out.println(car2.speed);

//        System.out.println("===================");
//
//        Car car3  = new Car();
//        car3.make = "BMW";
//        car3.model = "M3";
//        car3.speed = 270;
//
//        System.out.println(car3.make);
//        System.out.println(car3.model);
//        System.out.println(car3.speed);
    }
}
