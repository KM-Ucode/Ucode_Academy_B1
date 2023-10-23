package day_39_oop_inheritance_continue;

public class CarObject extends Car{

   int speed = 150;
   public void showSpeed(){
       //System.out.println(speed); // this one will print the speed from this class.
       //System.out.println(super.speed); // to print the speed from parent class or
       System.out.println("Showing speed from parent class");
       //super.showSpeed();
       System.out.println(super.speed);
       System.out.println("Showing speed from current child's class");
       System.out.println(this.speed);
   }

    public static void main(String[] args) {

        CarObject car1 = new CarObject();
        //System.out.println(car1.speed);
        car1.showSpeed();

    }
}
