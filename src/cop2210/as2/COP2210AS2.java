//********************************************************************************
// FIU PANTHERID: [Your FIU PantherID]
// CLASS: COP 2210 – [Semester Year]
// ASSIGNMENT # [#]
// DATE: [Date]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package cop2210.as2;

import javax.swing.*;
import java.lang.Math;
import java.util.Random;
import javax.swing.JOptionPane;

public class COP2210AS2 {
    public static void main(String[] args) 
    {
        
        String queenName;
        String colonyName;
        String careTakerName;
        int startingSize;
        
        // Ask for the Queen Name
        do {
            System.out.println("Input the queen Name");
            queenName = JOptionPane.showInputDialog("Input the queen Name");
        }while( queenName.length() == 0);
        System.out.println("QueenName: " + queenName);
        
        // Ask for the colony name
        do {
            System.out.println("Input the Colony Name");
            colonyName = JOptionPane.showInputDialog("Input the Colony Name");
        }while( colonyName.length() == 0);
        System.out.println("ColonyName: " + colonyName);
        
        // Ask for the caretaker name
        do {
            System.out.println("Input the CareTaker Name");
            careTakerName = JOptionPane.showInputDialog("Input the CareTaker Name");
        }while( careTakerName.length() == 0);
        System.out.println("CareTakerName: " + careTakerName);
        
        // Ask for the starting size
        String tempString;
        do {
            System.out.println("Input the initial size");
            tempString = JOptionPane.showInputDialog("Input the initial size");
            startingSize = Integer.parseInt(tempString);
        }while( tempString.length() == 0);
        System.out.println("Starting Size: " + startingSize);
        
        // Creo un objeto de clase BeeFarm
        BeeFarm beefarm = new BeeFarm(queenName, colonyName, careTakerName, startingSize);
        
        
        // ask the user how many days their colony should be fed
        do {
            System.out.println("how many days their colony should be fed");
            tempString = JOptionPane.showInputDialog("how many days their colony should be fed");
        }while( tempString.length() == 0);
        System.out.println("Days fed: " + tempString);
        
        beefarm.feed(Integer.parseInt(tempString));
        
        // ask the user how many days their colony should be fed
        do {
            System.out.println("how many times do you want to breed?");
            tempString = JOptionPane.showInputDialog("how many times do you want to breed?");
        }while( tempString.length() == 0);
        System.out.println("Days fed: " + tempString);
        
        boolean retVal = beefarm.breed(Integer.parseInt(tempString));
        if (retVal) {
            // puedo hacer el breed
        }else {
            // no pudo hacer el breed
        }
        System.out.println("Colony size: " + beefarm.numbOfBees);
        
     }
}

