package short_videos;

public class LogicalOperatorsAndOr {
    public static void main(String[] args) {

        // Logical && || return boolean (true or false)

        // Logical AND operator returns true if all conditions (two or more) are true
        // otherwise it returns false

        System.out.println(5 > 3 && 5!=8 && 78 == 78 && 68 < 79);  // true
        System.out.println(8 > 6);
        System.out.println(5 > 3 && 5 ==8 && 78 == 78 && 68 < 79); // false
        System.out.println(6 > 10);

        // Logical OR operator returns true if one condition is true

        System.out.println( 79 < 10 || 79 == 79); // true
        System.out.println( 78 < 68 || 68 != 68 ); // false


    }
}
