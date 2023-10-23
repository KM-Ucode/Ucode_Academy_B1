package short_videos;

public class StudentObject {
    public static void main(String[] args) {

    Student student1 = new Student();
    student1.name = "Mike";


    Student student2 = new Student("Sara", 22, 'F', "U-Code Academy");

        System.out.println(student2.name);
        System.out.println(student2); // if we print it directly we get hashcode// look at EncapsulationTest class

    }

}
