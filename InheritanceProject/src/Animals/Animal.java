
package Animals;

/**********************************************************************
* Programmer:	Erika Tvaskis
* Class:        CS30S
* Assignment 4:	Inheritance Project
* Description:	Highest level of inheritance structure.
*               Constructs the animal object.
* ********************************************************************/
 
public class Animal { //Begin class  
    
    public enum Type { //Creating enum Type
        Cat, Dog
    } //Closing bracket for enum Type declaration
    
//INSTANCE VARAIBLES
    
    private String Name = "";
    private Type Type = null;
    private String Diet = "";
    
//CONSTRUCTORS
   
/********************************************************
* Purpose: Create animal object
* Interface:
* In: none
* Out: none
********************************************************/
    public Animal() {
    } //End constructor

/********************************************************
* Purpose: Create animal object with specific properties
* Interface:
* In: Name (String), Type (Type), Diet (String) 
* Out: none
********************************************************/
    public Animal(String n, Type t, String d) {
        Name = n;
        Type = t;
        Diet = d;
    } //End initialized constructor

//ACCESSORS
 	
/********************************************************
* Purpose: Get animal's name
* Interface:
* In: none
* Out: animal's name
********************************************************/
    public String getName() {
        return this.Name;
    } //End getName

/********************************************************
* Purpose: Get animal's type
* Interface:
* In: none
* Out: animal's type
********************************************************/
    public Type getType() {
        return this.Type;
    } //End getType

/********************************************************
* Purpose: Get animal's diet
* Interface:
* In: none
* Out: animal's diet
********************************************************/
    public String getDiet() {
        return this.Diet;
    } //End getDiet

//MUTATORS
    
/********************************************************
* Purpose: Set animal's name
* Interface:
* In: Name 
* Out: none
********************************************************/
    public void setName(String n) {
        this.Name = n;
    } //End setName
 
} //End class