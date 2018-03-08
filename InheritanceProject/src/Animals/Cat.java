
package Animals;

/**********************************************************************
* Programmer:	Erika Tvaskis
* Class:        CS30S
* Assignment 4:	Inheritance Project
* Description:	One of the third levels of the inheritance structure.
*               Constructs Cat object.
* ********************************************************************/
 
//IMPORTS
    import java.util.Date;

public class Cat extends TemporaryResident { //Begin class
 	
//INSTANCE VARAIBLES
    private String LitterBoxCleaning = null;
 	
//CONSTRUCTORS

/********************************************************
* Purpose: Create cat object
* Interface:
* In: none
* Out: none
********************************************************/
    public Cat(){
    } //End constructor

/********************************************************
* Purpose: Create cat object with specific properties
* Interface:
* In: Name (String), Type (Type), Diet (String),
*     DepartureDate (Date), CubbyNumber (int), 
*     GoodBehaviour (boolean), LitterBoxCleaning (String)
* Out: none
********************************************************/
    public Cat(String n, Type t, String d, Date dd, int cn, String lbx) {
        super(n, t, d, dd, cn);
        LitterBoxCleaning = lbx;
    } //End initialized constructor

//ACCESSORS

/********************************************************
* Purpose: get LitterBoxCleaning
* Interface:
* In: none
* Out: LitterBoxCleaning
********************************************************/
    public String getLitterBoxCleaning() {
        return LitterBoxCleaning;
    } //End getLitterBoxCleaning()

} //End class