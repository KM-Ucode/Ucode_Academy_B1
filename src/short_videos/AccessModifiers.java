package short_videos;

public class AccessModifiers {

    public String publicAccess = "I'm Public"; // Accessible from anywhere within the project

    protected String protectedAccess = "I'm Protected";// Accessible within the same package, and can be inherited from any package

    String defaultAccess = "I'm Default";  // Accessible within the same package

    private String privateAccess = "I'm Private";
    // Accessible within the same class, we can read and write using public getter and
    // setter methods outside the class

    public void setPrivateAccess(String str){  //setter method
        privateAccess = str;
    }

    public String getPrivateAccess() {  // getter method
        return privateAccess;
    }
}
