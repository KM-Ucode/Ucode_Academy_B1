package day_38_oop_inheritance;

import java.util.ArrayList;

public class Encapsulation {

    private ArrayList<String> nameList; // This is encapsulated/private Arraylist<String>

    public void setNameList(ArrayList<String> nameList){ //This is instance method, we call it setter
                                                        // method in Encapsulation
        this.nameList = nameList;
    }

    public ArrayList<String> getNameList(){

        return nameList;
    }

}
