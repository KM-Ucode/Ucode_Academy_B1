package day_09_if_ternary_review_switch_statement;

public class SwitchAndIfStatements {

    public static void main(String[] args) {

        int dayOfWeek = 4;
        String str = "i";

        // Make sure the number is from 1 to 7
        if (dayOfWeek >= 4 && dayOfWeek <= 7) {

            switch (dayOfWeek) { // Variable/expression

                case 1: // WE are checking if the expression matches the case/comparing variable value with multiple cases
                    str += "Monday";
                    break;
                case 2:
                    str += "Tuesday";
                    break;
                case 3:
                    str += "Wednsday";
                    break;
                case 4:
                    str += "Thursday";
                    break;
                case 5:
                    str += "Friday";
                    break;
                case 6:
                    str += "Saturday";
                default:
                    str += "Sunday";


                    System.out.println(str);
            }
        }


    }
}