package day_46_polymorphism_intro;

public class Cat2 extends Animal2{

    String catName;

    public Cat2(int age, String catName, String name){
        this.age = age;
        this.catName = catName;
        this.name = name;
    }
    @Override
    public void eat(){
        System.out.println(catName+" is eating");
    }
    public void sleep(){
        System.out.println(catName+" is sleeping");
    }
    public void play(){
        System.out.println(catName+" is playing");
    }
}
