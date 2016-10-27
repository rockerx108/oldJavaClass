/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class StartProgramView {
    
    private String promptMessage;
    
   public StartProgramView() {
       
    this.promptMessage = "\nPlease enter your name: ";
    this.displayBanner();
    
}

    private void displayBanner() {
        
        System.out.println(
        "\n**********************************************"
      + "\n* This is the game of BYU-I DO!!!             " 
      + "\n* In this game you will help your character   "
      + "\n* experience the joys of dating in Rexburg.   "
      + "\n*                                             "          
      + "\n* In order to find your eternal spouse,       "  
      + "\n* You will begin by finding the girl of       "  
      + "\n* your dreams at one of many Apartments.      "  
      + "\n* You will then work to improve your relationship "  
      + "\n* and build trust by going on dates and       " 
      + "\n* spending time with her. Eventually, you'll  "  
      + "\n* want to ask her to join in matrimony.       " 
      + "\n* When you've won her hand in marriage,       "
      + "\n* You will be prepared for eternal happiness! "
      + "\n**********************************************"  );
    }

    public void displayStartProgramView() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals('Q')) // user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(playersName);
            
        }
        while (!done);  
    }

    private String getPlayersName() {
        /*
        While valid value has not been entered
            Display promptmessage
        Get the value entered from keyboard
        Trim front and trailing blanks off the name
        
        If the length of the value is blank then
            display "Invalid value: the value cannot be blank"
        continue
        ENDIF
        
        Break
        
        Endwhile
        Return name
        */
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
        break;
        }
        return value;        
    }

    private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }
}
