
package AnimalsClient;

/****************************************************************************
* Programmer:   Erika Tvaskis
* Class:        CS30S
* Assignment 4: Inheritance Project
* Description:  Prints the current animals in the hotel, from data file
*               Alerts employees when tasks are needed to be completed
*               Allows updates to the data file while being run
* Input:        Employee must choose between working with cats or dogs
* Output:       The chosen type of animal is printed, both temporary 
*               and permanent residents, as well as other information about
*               them
****************************************************************************/
 
//IMPORTS

import Animals.*;
import Animals.Animal.Type;
import javax.swing.*;
import java.io.*; 					
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
 
public class AnimalsClient {  //Begin class
    
    public static void main(String[] args) throws IOException, ParseException, InterruptedException{  //Begin main
  
//DECLARATION OF VARIABLES

    ArrayList<Cat> CatList = new ArrayList<Cat>();
    //Declaring array list as CatList
    ArrayList<PermanentResident> PermanentCatList = new ArrayList<PermanentResident>();
    //Declaring array list as PermanentCatList
    ArrayList<Dog> DogList = new ArrayList<Dog>();
    //Declaring array list as DogList
    ArrayList<PermanentResident> PermanentDogList = new ArrayList<PermanentResident>();
    //Declaring array list as PermanentDogList
   
    //Calendar cal = new GregorianCalendar();
    
    BufferedReader fin = null; 
    Type Animals = null;
    DateFormat format = new SimpleDateFormat("MM/d/yyyy", Locale.ENGLISH);
    Date Departure = null;
    
    String[] tokens;                    //Array for splitting strings
    String delim = "[ ]+";              //Delimiter string for splitting input string
    String strin; 
    String Animal = null;
    String TemporPerm = null;
    String Name = null;
    String Diet = null;
    String Info = null;
    String ExtraInfo = null;
    
    int Counter;
    int Hour;
    int Minute;
    int Second;
    int CubbyNumber;
    
//GETTING BANNER AND PRINTING IT

    ProgramInfo ProgramInfo = new ProgramInfo(); 
    System.out.println(ProgramInfo.getBanner("EriKAT AND DOG HOTEL"));

//CHOOSE BETWEEN CATS AND DOGS

    Object[] possibleValues = { "Cats", "Dogs" };
    Object selectedValue = JOptionPane.showInputDialog(null,"Hello! You must be the new hired employee. Wecome!" + "\n"
        + "You will work mainly with the temporary and residents" + "\n"
        + "However, the permanent residents also require care." + "\n"
        + "Now, what animal would you like to work with?", "EriKAT AND DOG HOTEL",
    JOptionPane.INFORMATION_MESSAGE, null,
    possibleValues, possibleValues[0]);

//WHILE LOOP
    Counter = 0;
    while (true) {  //While true  
    Calendar cal = new GregorianCalendar();
    Hour = cal.get(Calendar.HOUR);      //Gets current hour
    Minute = cal.get(Calendar.MINUTE);  //Gets current minute
    Second = cal.get(Calendar.SECOND);  //Gets current second
    
//ENTERS ONCE BASED ON COUNTER, THEN ENTERS EACH MINUTE (as seconds equals 0)
//Not a perfect initialization, but it works :)
    if ((Second == 0) || (Counter == 0)) { //If statement
            
//READING DATA FILE
    try { //Try
        fin = new BufferedReader(new FileReader("DataFile.txt"));
    } //Closing bracket for try statement 
    catch (FileNotFoundException e) { //Catch
        System.out.println("File not found");
    } //Closing bracket for catch statement
   	
//WHILE LOOP (loading arrays by reading data file)
    strin = fin.readLine();
    while (strin != null) { //While loop
        tokens = strin.split(delim);
        TemporPerm = tokens[0];
        Name = tokens[1];
        Animal = tokens[2];
        Diet = tokens[3];
        Info = tokens[4];
        Animals = Type.valueOf(Animal);
 
//IF CAT IS CHOSEN, AND THE TYPE OF ANIMAL (from line that is being read) IS CAT:
        if ((selectedValue == possibleValues[0]) && (Animals == Type.Cat)) { //If statement
            
            if (TemporPerm.equals("temporary")) { //If cat is a temporary resident
                CubbyNumber = Integer.parseInt(tokens[5]);
                ExtraInfo = tokens[6];
                Cat TCat = new Cat();
                Departure = format.parse(Info);
                TCat = new Cat(Name,Animals, Diet, Departure, CubbyNumber, ExtraInfo);               
                CatList.add(TCat);
            } //Closing bracket for if statement
            
            else { //Else
                PermanentResident PCat = new PermanentResident();
                PCat = new PermanentResident(Name, Animals, Diet, Integer.parseInt(Info));
                PermanentCatList.add(PCat);
            } //Closing bracket for else
            
        } //Closing bracket for if statement
        
//ELSE, IF DOG IS CHOSEN, AND THE TYPE OF ANIMAL (from line that is being read) IS DOG:        
        else if ((selectedValue == possibleValues[1]) && (Animals == Type.Dog)) { //Else if statement
            
            if (TemporPerm.equals("temporary")) { //If dog is a temporary resident
                CubbyNumber = Integer.parseInt(tokens[5]);
                ExtraInfo = tokens[6];
                Dog TDog = new Dog();
                Departure = format.parse(Info);
                TDog = new Dog(Name,Animals, Diet, Departure, CubbyNumber, ExtraInfo);
                DogList.add(TDog);
            } //Closing bracket for if statement
            
            else { //Else statement
                PermanentResident PDog = new PermanentResident();
                PDog = new PermanentResident(Name, Animals, Diet, Integer.parseInt(Info));
                PermanentDogList.add(PDog);
            } //Closing bracket for else statement
            
        } //Closing bracket for else if statement
        
        strin = fin.readLine(); //Read next line of file
    } //Closing bracket for while loop
    
    } //Closing bracekt for if statement (for the seconds)
    
//PRINTING (table format!)
    if ((Second == 0) || (Counter == 0)) { //If statement
        Counter = 1;
        
    if (!(CatList.size() == 0)) { //If catlist size is not zero:
        System.out.println("*******************************************************************************************************************");
        System.out.format("%1s %5s %8s %8s %8s %25s %16s %16s %1s  \n","*","| ID |","| Name |","| Type |","| Diet |", "| When will the Pet get Picked Up? |","| Cubby Number |" , "| Clean the LitterBox |", "*");
        for(Cat i: CatList) 
            System.out.format("%1s%6s%8s%8.5s%11s%34s%15s%21s%11s%n", "*",i.getID(), i.getName(),i.getType(),i.getDiet() , i.getDepartureDate() ,i.getCubbyNumber() , i.getLitterBoxCleaning(), "*", "\n");
        System.out.println("*******************************************************************************************************************");
        System.out.println();
            
        System.out.println("***************************************");
        System.out.format("%1s %5s %8s %8s %8s %1s  \n","*","| Name |","| Type |","| Diet |", "| Age |", "*");
        for(PermanentResident i: PermanentCatList) 
            System.out.format("%1s%7s%8s%10s%8s%5s%n", "*", i.getName(),i.getType(),i.getDiet() , i.getAge() , "*", "\n");
        System.out.println("***************************************");
        System.out.println();
        System.out.println("Next Update in 1 min");
        System.out.println();
        
    } //Closing bracket for if statement (printing catlist + permanentcatlist)
          
    if (!(DogList.size() == 0)) { //If doglist size is not zero:
        System.out.println("**************************************************************************************************************");
        System.out.format("%1s %5s %8s %8s %8s %25s %16s %16s %1s  \n","*","| ID |","| Name |","| Type |","| Diet |", "| When will the Pet get Picked Up? |","| Cubby Number |" , "| Time for Walk? |", "*"); 
        for(Dog i: DogList) 
            System.out.format("%1s%6s%8s%8.5s%11s%34s%15s%19s%8s%n", "*",i.getID(), i.getName(),i.getType(),i.getDiet() , i.getDepartureDate() ,i.getCubbyNumber() , i.getTimeforWalk(), "*", "\n");
        System.out.println("**************************************************************************************************************");
        System.out.println();
            
        System.out.println("***************************************");
        System.out.format("%1s %5s %8s %8s %8s %1s \n","*","| Name |","| Type |","| Diet |", "| Age |", "*");
        for(PermanentResident i: PermanentDogList) 
            System.out.format("%1s%7s%8s%10s%8s%5s%n", "*", i.getName(),i.getType(),i.getDiet() , i.getAge() , "*", "\n");
        System.out.println("***************************************");
        System.out.println();
    } //Closing bracket for if statement (printing doglist + permanentdoglist)

    } //Closing bracket for if statement (second, counter)
      
//ALERTS
    
   Thread.sleep(1000); 
    for(Cat i: CatList) { //For loop       
        if (i.getLitterBoxCleaning().equals(Hour + ":" + Minute + ":" + Second)) { //If statement 
            //If the time for cleaning litterbox = to current time:
            ProgramInfo.infoBox("Clean the litterbox!", "LITTERBOX"); //Alert pops up
            break;
        } //Closing bracket for if statement
    } //Closing bracket for for loop
        
    for(Dog i: DogList) { 
        if (i.getTimeforWalk().equals(Hour + ":" + Minute + ":" + Second)) { //If statement 
            //If the time for walking the dog = to current time:
            ProgramInfo.infoBox("Walk the dog!", "WALK DOG"); //Alert pops up
            break;
        } //Closing bracket for if statement
    } //Closing bracket for for loop
    
    CatList.clear();
    PermanentCatList.clear();
    DogList.clear();
    PermanentDogList.clear();
    TemporaryResident.resetID();
    
    } //End of while loop 
    
}  //End main
    
} //End class