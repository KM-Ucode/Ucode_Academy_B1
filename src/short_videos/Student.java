package short_videos;

public class Student {

    String name;
    int age;
    char gender;
    String university;

    public Student(){

    }
    public Student(String name){
        this.name = name;
    }
    public Student(String name, int age, char gender, String university){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
    }
    public String toString(){
        return "Name: "+name+" Age: "+age+" Gender: "+gender+" University:"+university; //if we want to print
                                                 // directly without getting hashcode

    }
}
