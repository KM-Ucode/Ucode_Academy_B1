package day_44_oop_abstraction;

public abstract class Browser {
    protected abstract void openBrowser();

    }
    class ChromBrowser extends Browser{
    public void openBrowser(){
        System.out.println("Opening Chrome Browser");
    }
}
class SafariBrowser extends Browser{
    public void openBrowser(){
        System.out.println("Opening Safari browser");
    }
}
class TestClass{
    public static void main(String[] args) {
        ChromBrowser chromBrowser = new ChromBrowser();
        chromBrowser.openBrowser();

        SafariBrowser safariBrowser = new SafariBrowser();
        safariBrowser.openBrowser();
    }
}
