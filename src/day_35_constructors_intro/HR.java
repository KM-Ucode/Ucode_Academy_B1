package day_35_constructors_intro;

public class HR {

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();

    public static void main(String[] args){
        employee1.setEmpInfo("J B", "SDET");
        employee2.setEmpInfo("M J", "SDET");
        employee3.setEmpInfo("J B", "QA Engineer");

        employee1.getEmpInfo();
        employee2.getEmpInfo();
        employee3.getEmpInfo();
    }
}
