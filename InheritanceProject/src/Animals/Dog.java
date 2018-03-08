
package Animals;

/**********************************************************************
* Programmer:	Erika Tvaskis
* Class:        CS30S
* Assignment 4:	Inheritance Project
* Description:	One of the third levels of the inheritance structure.
*               Constructs Dog object.
* ********************************************************************/
 
//IMPORT
    import java.util.Date;

public class Dog extends TemporaryResident { //Begin class
 	
//INSTANCE VARAIBLES
    private String TimeforWalk = null;
 	
//CONSTRUCTORS
 
/********************************************************
* Purpose: Create dog object
* Interface:
* In: none
* Out: none
********************************************************/
    public Dog() { 
    } //End constructor

/********************************************************
* Purpose: Create dog object with special properties
* Interface:
* In: Name (String), Type (Type), Diet (String), 
*     DepartureDate (Date), CubbyNumber (int),
*     GoodBehaviour (boolean), TimeForWalk (String)
* Out: none
********************************************************/
    public Dog(String n, Type t, String d, Date dd, int cn, String tfw) {
        super(n, t, d, dd, cn);
        TimeforWalk = tfw;
    } //End initialized constructor

//ACCESSORS

/********************************************************
* Purpose: get TimeforWalk
* Interface:
* In: none
* Out: TimeforWalk
********************************************************/    
    public String getTimeforWalk() {
        return TimeforWalk;
    } //End getTimeforWalk()

} //End class