/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GameControl;
import citbyui.cit260.BYUIDO.exceptions.GameControlException;

/**
 *
 * @author Nick
 */
public class NumberGuessView extends View{
    
    private String menu;
    
    public NumberGuessView() {
        super("\n"
                  + "\n----------------------------------------------------"
                  + "\n|Guess a number between 1 and 10                    |"
                  + "\n|                                                   |"
                  + "\n|Q - Main Menu                                      |"
                  + "\n----------------------------------------------------");
        }

        @Override
       public boolean doAction(String playersNumber){
        
           
      try {
           int numberChoice = Integer.parseInt(playersNumber);
      } catch (NumberFormatException nf) {
          System.out.println("Enter a whole number between 1 and 10, or enter Q to quit");
      }
        int numberChoice = Integer.parseInt(playersNumber);
        try {
            GameControl.numberGuessingGame(numberChoice);
            System.out.println("\nYou got it!!!!");
            return true;
        } catch (GameControlException ge) {
            System.out.println(ge.getMessage());
            return false;
        }
        
 
           }
}
