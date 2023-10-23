package short_videos;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {

        		/*
		String: Immutable -> means we can Not modify once created
		StringBuilder : Mutable, Not Synchronized (Faster)
		StringBuffer : Mutable, Thread-safe and Synchronized(Slower)

		Mutable means we can insert, delete, replace string's value
		(We can modify string)

		StringBuilder & StringBuffer Methods:

		append(); -> We use this method to concatenate/add to string, adds at the end of str

		insert();  -> We use this method to insert to str at given position, we can
		              insert at any position that we want at beginning, in the middle or at the end

		replace(); -> To replace string from given position to end position with given value

		delete(); -> To delete the string from given position to end position

		reverse(); -> To reverse given string

		charAt(); equals(); indexOf(); lastIndexOf(); length(); substring(); toString();

		*/

        String str = "java";
        str = "Java";  //it doesn't modify "java", it just creates a new object in the String pool
                       // immutable
        StringBuilder str2 = new StringBuilder("java2");

        StringBuffer str3 = new StringBuffer("java3");

        str2.append("22");
        System.out.println(str2);

        str2.insert(0,"P");
        System.out.println(str2);

        str2.delete(0,1);
        System.out.println(str2);

        str2.replace(0,1,"J");
        System.out.println(str2);

        System.out.println(str2.reverse());




    }
}
