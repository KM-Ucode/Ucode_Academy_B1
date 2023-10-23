package Homework.Day_32;

public class Person {

    String firstName;
    String lastName;
    String gender;
    int age;
    double height;
    String profession;


  public void play(){
      System.out.println(firstName+" "+lastName+" plays violin");

    }
    public void run(){
        System.out.println(firstName+" "+lastName+ " goes for a run every morning");
    }
    public void eat(){
        System.out.println(firstName+" "+lastName+" eats healthy food");
    }
    public void drive(){
        System.out.println(firstName+" "+lastName+" drives Lamborghini");
    }
    public void setPersonInfo(String firstName, String lastName, String gender, int age, double height, String eyeColor, String profession) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.profession = profession;
    }
    public void getPersonInfo(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(height);
        System.out.println(profession);
    }
    public String toString(){
      //return firstName+"\n"+lastName+"\n"+gender+"\n"+age+"\n"+height+"\n"+profession;
        return firstName+" "+lastName+" "+gender+" "+age+" "+height+" "+profession;

    }


}
