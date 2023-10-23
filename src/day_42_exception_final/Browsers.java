package day_42_exception_final;

public class Browsers {

    protected void openBrowser(){
        System.out.println("Opening default browser");
    }
    public String toString(){ //We are overriding toString method from object class
        return"";
    }

}
class ChromeBrowser extends Browsers{
    @Override
    protected void openBrowser(){
        System.out.println("Opening Chrome Browser");
    }
    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        chrome.openBrowser();
    }
}
class Safari extends Browsers{
    protected void openBrowser(){
        System.out.println("Opening Safari Browser");
    }

    public static void main(String[] args) {
        Safari safari = new Safari();
        safari.openBrowser();
    }
}
class DefaultBrowser extends Browsers{
    public static void main(String[] args) {
        DefaultBrowser defaultBrowser = new DefaultBrowser();
        defaultBrowser.openBrowser();

    }
}