
package Animals;

/**********************************************************************
* Programmer:	Erika Tvaskis
* Class:        CS30S
* Assignment 4:	Inheritance Project
* Description:	One of the second levels of the inheritance structure
*               Constructs PermanentResident object
* ********************************************************************/
 
public class PermanentResident extends Animal { //Begin class
 	
//INSTANCE VARAIBLES
    private int Age = 0;
    
//CONSTRUCTORS

/********************************************************
* Purpose: Create permanent resident object
* Interface:
* In: none
* Out: none
********************************************************/    
    public PermanentResident() {
    } //End constructor    
    
/********************************************************
* Purpose: Create permanent resident object with specific properties
* Interface:
* In: Name (String), Type (Type), Diet (String), Age (int)
* Out: none
********************************************************/
    public PermanentResident(String n, Type t, String d, int a) {
        super(n , t, d);
        Age = a;
    } //End initialized constructor

//ACCESSORS

/********************************************************
* Purpose: Get Age
* Interface:
* In: 
* Out: Age
********************************************************/
    public int getAge() {
        return Age;
    } //End getAge

} //End class