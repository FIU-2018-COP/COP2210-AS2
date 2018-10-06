/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cop2210.as2;

/**
 *
 * @author ricar
 */
public class BeeFarm 
{
    String queenName;
    String colonyName;
    String careTakerName;
    int daysOfFood;
    int numbOfBees;
    
    BeeFarm(String queenName, String colonyName, String careTakerName, int startingSize) 
    {
        System.out.println("BeeFarm object is create with queenName:  " + queenName + 
                " ColonyName: " + colonyName + " careTakerName: " + careTakerName +
                " starting size: " + startingSize);
        this.queenName = queenName;
        this.colonyName = colonyName;
        this.careTakerName = careTakerName;
        numbOfBees = startingSize;
        
        daysOfFood = 0; 
    }
    
    void feed(int days) 
    {
        daysOfFood = daysOfFood + days;
        System.out.println("myBeeFarm have: " + daysOfFood + " days of food");
        
    }
    
    boolean breed() 
    {
        boolean retVal = false;
        System.out.print("Breeding...");
        if (daysOfFood > 0) {
            daysOfFood = daysOfFood - 1;
            numbOfBees = numbOfBees * 3;
            retVal = true;
            System.out.print("OK");
        }
        System.out.print("\n");
        return retVal;
    }
    
    boolean breed(int n) {
        boolean retVal = false;
        int index;
        System.out.println("Starting breeding: " + n + " times");
        for (index = 0; index < n; index++) {
            retVal = breed();
            if (retVal == false) break;
        }
        
        return retVal;
    }
}
