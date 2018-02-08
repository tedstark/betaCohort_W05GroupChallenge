package com.company;

import com.company.model.*;

import java.util.Scanner;

public class Main {
//Create an application that cracks different kinds of shelled nuts.
// To do this, you will need to create two different types of classes that we will call 'cracking machines'.
// One will handle smaller shelled nuts, the other will handle larger shelled nuts.
//For the two machines, use an abstract class for the two machine subclasses to inherit from.
// Both machines should check a property of the shelled nut that it is given to ensure that it is the correct size.
// If it is not, it should then be returned back to the main class to be given to the other machine to shell.
//
//The nuts should all use an interface or abstract class to ensure that it has all the appropriate members and
//  methods associated to it.
// Each nut will need to include a name, weight, and a String that will represent the sound the nut makes when
//  it is shelled (or de-shelled rather).
// Create a total of 5 shelled nut varieties for the two machines to crack open.
//
//The rest of the specifications of the application are up to your interpretation and design.
//
//At the end of the application, ensure that you instance one of each shelled nut,
//  and pass them to the two machines for processing.
// Also ensure to display to the user which shelled nut was cracked open in each machine.
// Example "Machine 2 cracked open the Walnut with a 'Crrrrrrruuuuussssssh' sound".

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Nut Shelling Factory!");
        System.out.println("Would you like to sort some nuts? (Yes/No)");
        String sortNuts = sc.nextLine();
        if (sortNuts.equalsIgnoreCase("Yes")) {
            System.out.println("Great! Let's pick some nuts for you...");
        } else {
            System.out.println("Okay, have a nice day!");
            System.exit(0);
        }
        //code block to pause for dramatic effect :)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException pause) {
            pause.printStackTrace();
        }
        //creation statements for the nuts
        LargeMachine largeMachine = new LargeMachine();
        SmallMachine smallMachine = new SmallMachine();
        Peanut peanut = new Peanut("Peanut", 3,"Crunchhhh!");
        Walnut walnut = new Walnut("Walnut", 8,"CRRACKKKK!");
        Pecan pecan = new Pecan("Pecan", 5, "Ka-Crack!");
        Almond almond = new Almond("Almond",4, "CaaaaCrunch!");
        Hazelnut hazelnut = new Hazelnut("Hazelnut", 7, "CrinkleKa!");
        System.out.println("");

        System.out.println("Now I'll put the nuts in the Large Machine...");
        largeMachine.sorting(peanut);
        largeMachine.sorting(walnut);
        largeMachine.sorting(pecan);
        largeMachine.sorting(almond);
        largeMachine.sorting(hazelnut);
        System.out.println("");

        System.out.println("Now I'll put the nuts in the Small Machine...");
        smallMachine.sorting(peanut);
        smallMachine.sorting(walnut);
        smallMachine.sorting(pecan);
        smallMachine.sorting(almond);
        smallMachine.sorting(hazelnut);
        System.out.println("");

        System.out.println("And we're done!");
    }
}
