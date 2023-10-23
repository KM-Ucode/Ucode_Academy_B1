package day_54_java_versions_features;

public class Java14SwitchStatement {
    public static void main(String[] args) {

        int days = 0;
        String month = "January";

        // Using switch statement/expression before Java 14
//        switch(month){
//            case"January":
//                days = 31;
//                break;
//            case"February":
//                days = 28;
//                break;
//            case"March":
//                days = 31;
//                break;
//            case"April":
//                days = 30;
//                break;
//            case"May":
//                days = 31;
//                break;
//            case "June":
//                days = 30;
//                break;
//            case"July":
//                days = 31;
//                break;
//            case"August":
//                days = 31;
//                break;
//            case"September":
//                days = 30;
//                break;
//            case"October":
//                days = 31;
//                break;
//            case"November":
//                days = 30;
//                break;
//            case"December":
//                days = 31;
//                break;
//            default:
//                days = 0;
//        }
        //from Java 14 and Up
        days = switch(month){
            case "January","March","May","July","August","October","December" -> {
                System.out.println("Hello");
                yield 31;    // using yield keyword
            }
            case "February" -> 28;
            case "April","June","September","November" -> 30;
            default -> 00;
        };
        System.out.println(days);
    }
}
