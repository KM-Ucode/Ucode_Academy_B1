package short_videos;

public class ArrayList {
    public static void main(String[] args) {

        int [] num = {1,2,3,4};
       // System.out.println(Arrays.toString(num));

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(1); // removes number from index 1
        list.remove(2); // removes number from index 2
        list.clear();   // this method clears everything

        System.out.println(list);
    }
}
