package day_09_if_ternary_review_switch_statement;

public class SwitchStatementPractice {

    public static void main(String[] args) {

        // switch statement works without break, but we will have logical error
        // it is always a good practice to use break statement, otherwise you'll have logical error

        String str = "";
        char ch = 'C';

        switch (ch){
            case 'A':
                str += "A";
                break;

            case 'B':
                str += "B";
                break;

            case 'C':
                str += "C";
                break;

            default:
                str += "Invalid";
                break;

        }
        System.out.println(str);//

        System.out.println("========");



    }
}
