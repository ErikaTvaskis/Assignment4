
package Animals;

/**********************************************************************
* Programmer:	Erika Tvaskis
* Class:        CS30S
* Assignment 4:	Inheritance Project
* Description:	One of the second levels of the inheritance structure.
*               Constructs TemporaryResident object
* ********************************************************************/
 
//IMPORTS
    import java.util.Date;

public class TemporaryResident extends Animal { //Begin class
 	
//INSTANCE VARAIBLES
    private static int ID = 1000;
    private Date DepartureDate = null;
    private int CubbyNumber = 0;
 	
//CONSTRUCTORS
  
/********************************************************
* Purpose: Create TemporaryResident object 
* Interface:
* In:  none
* Out: none
********************************************************/    
    public TemporaryResident() {
    } //End constructor
    
/********************************************************
* Purpose: Create TemporaryResident object with specific properties
* Interface:
* In: Name (String), Type (Type), Diet (String), 
*     DepartureDate (Date), CubbyNumber (int), GoodBehaviour (boolean)
* Out: none
********************************************************/
    public TemporaryResident(String n, Type t, String d, Date dd, int cn) {
        super(n , t, d);
        ID = ID++;
        DepartureDate = dd;
        CubbyNumber = cn;
    } //End intialized constructor

//ACCESSORS

/********************************************************
* Purpose: get ID
* Interface:
* In: none
* Out: ID
********************************************************/
    public int getID() {
        return ID++;
    } //End getID()

/********************************************************
* Purpose: get DepartureDate
* Interface:
* In: none
* Out: DepartureDate
********************************************************/    
    public Date getDepartureDate() {
        return DepartureDate;
    } //End getDepartureDate()

/********************************************************
* Purpose: get CubbyNumber
* Interface:
* In: none
* Out: CubbyNumber
********************************************************/    
    public int getCubbyNumber() {
        return CubbyNumber;
    } //End getCubbyNumber()
    
//*****************************************************
// Purpose: create ID resetter
// Interface:
// In: none
// Out: none
//*****************************************************  
    public static void resetID() {
        ID = 1000;
    } //End resetID()
    
} //End class