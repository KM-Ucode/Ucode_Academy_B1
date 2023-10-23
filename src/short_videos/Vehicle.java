package short_videos;

public class Vehicle {

    protected  String brand;
    public Vehicle (String brand){
        this.brand =  brand;

    }
    public void showBrand(){
        System.out.println("Brand: "+brand);
    }
    //	this - is used to refer to current class's field/variable/instances(within the same class)
    //	this( ) - is used for calling constructor from another constructor in the same class/from current
    //	class.

    //	super -  refers to the instance of the Super class from subclass.
    //	super( ) - is used for calling super/parent class's constructor from child/sub class's constructor.
    /*
    Constructor calls:
    	At least one parent class's constructor MUST be called in subclass. If the constructor
	in parent class is default, it's called automatically in subclass.

	If the parent class's constructor is not default, it MUST be called manually in subclass by
	using super() keyword through super class's constructor
	 */

}
