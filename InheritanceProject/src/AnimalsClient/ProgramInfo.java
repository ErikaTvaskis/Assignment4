
package AnimalsClient;

import javax.swing.JOptionPane;

/* **********************************************************
 * Programmer:      Erika Tvaskis
 * Class:           CS30S
 * Assignment:      Program Info
 * Description:     Prints banner
                    Also includes alert pop up message
 * *************************************************************
 */
 
 public class ProgramInfo
 {  //Begin class

//CONSTRUCTORS
     
    public ProgramInfo(){         
    } //End default constructor

//ACCESSORS
    
//*****************************************************
// Purpose: create a banner
// Interface:
// In: none
// Out: bannerOut
//*****************************************************      
    public String getBanner(String a){
        String bannerOut = "";
        bannerOut = "*******************************************\n";
    	bannerOut += "Name:		Erika Tvaskis\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	" + 4 + "\n";
    	bannerOut += "*******************************************\n";         
        return bannerOut;
    } //End getBanner
     
//*****************************************************
// Purpose: create closing message
// Interface:
// In: none
// Out: closing
//*****************************************************     
    public String getClosingMessage(){
        String closing = "End of processing.\n";
        return closing;
    } //End getClosingMessage
    
//*****************************************************
// Purpose: create alert message
// Interface:
// In: none
// Out: none
//*****************************************************  
    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "ALERT: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    } //End infoBox
 
} //End class