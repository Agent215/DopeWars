/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dopewars;

import dopewars.collections.Inventory;
import dopewars.collections.Locations;
import dopewars.items.AbstractItem;
import dopewars.items.item;
import dopewars.time.Calendar;
import java.util.Scanner;

/**
 *
 * @author Brahm
 */
public class DopeWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        class Game extends AbstractGame {

            public Game() {
            }

            @Override
            public void nextTurn() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        }// end Game

        class Item extends AbstractItem {

            public Item(String name) {
                super(name);
            }// end item

            @Override
            public item clone() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }// end item clone
        }// end classItem
//***************************************************************************************
        Game NewGame = new Game();// create new game object

        NewGame.setGameName("the name of this game is " + "Game 1 "); // add later user input naming option
        Scanner input = new Scanner(System.in); // instance of scanner to take location selection from user
        int targetLocation = 0; // 

        // add locations
        Locations LocationsList = new Locations();// create new list of locations
        LocationsList.add("Germantown");
        LocationsList.add("Mt Airy");
        LocationsList.add("Center City");
        LocationsList.add("Kensington ");
        LocationsList.add("West Philly");

        LocationsList.setCurrentLocation(1);// set initial location could be made random at later point with .math

        //TESTING METHODS
        System.out.println("There are " + LocationsList.getTotal() + " locations in this game");
        System.out.println(LocationsList.toString());
        System.out.println(LocationsList.getCurrentLocation());
        System.out.println(NewGame.gameName);

        // add calander
        Calendar time = new Calendar(100);// create calander called time with 100 days
        NewGame.setCalendar(time);
        System.out.println(time.toString()); // display time at begining of turn 
        // add inventorys
        Inventory drugs = new Inventory(30);

        // add items starting with drugs to buy
        Item weed;
        Item Heroin;
        Item Speed;
        Item Hash;
        Item LSD;
        Item Mushrooms;
        Item Synth;
        Item Cocaine;
        Item Crack;
        Item Percoset;
        Item Adderall;

        // intizlize new drugs  
        weed = new Item("weed");
        Heroin = new Item("Heroin");
        Speed = new Item("Speed");
        Hash = new Item("Hash");
        LSD = new Item("LSD");
        Mushrooms = new Item("Mushrooms");
        Synth = new Item("Synth");
        Cocaine = new Item("Cocaine");
        Percoset = new Item("Percoset");
        Adderall = new Item("Adderall ");

        //add itme descriptions
        weed.setDescription("A staple of the drug game, comes in many flavors");
        weed.setPrice(400.0);
        weed.setMinPrice(100);
        weed.setMaxPrice(800);
        weed.setActive(true);

        Heroin.setDescription("Smoke it, inject it, snort it. This drug is a money maker!");
        Heroin.setPrice(10000.0);
        Heroin.setMinPrice(2500);
        Heroin.setMaxPrice(30000);
        Heroin.setActive(true);

        Speed.setDescription("cheap but effective");
        Speed.setPrice(200.0);
        Speed.setMinPrice(25);
        Speed.setMaxPrice(700);
        Speed.setActive(true);

        // add bank
        // add store
        // add wallet
        // add items 
        // display list of items
        // loop through each turn   
        // update prices everytime user moves to new location}
        while (time.hasNextDay()) {

            System.out.printf("%n%25s%n%15s%15.2f%n%15s%15.2f%n%15s%15.2f", "Drug Market",
                    "Weed : ", weed.generateNewPrice(), "Heroin : ", Heroin.generateNewPrice(),
                    "Speed : ", Speed.generateNewPrice());
            // create input method for asking user to select target destination from a list.
            System.out.printf("%n%15s%n%15s%n%12s%n%16s%n%15s%n%16s%n", "What neigborhood would you like to travel too?",
                    "1 = Germantown", "2 = Mt Airy", "3 = Center City", "4 = Kensington", "5 = West Philly");

            targetLocation = input.nextInt();

            // user presses a key 1-5 to make selection .code will be tied to a GUI at a later point
            if (targetLocation == 1) {

                LocationsList.setCurrentLocation(0);
                System.out.println("you have arrived in " + " Germantown");

            }

            if (targetLocation == 2) {

                LocationsList.setCurrentLocation(1);
                System.out.println("you have arrived in " + " Mt Airy");

            }

            if (targetLocation == 3) {

                LocationsList.setCurrentLocation(2);
                System.out.println("you have arrived in " + " Center City");

            }
            if (targetLocation == 4) {

                LocationsList.setCurrentLocation(3);
                System.out.println("you have arrived in " + " Kensington");

            }
            if (targetLocation == 5) {

                LocationsList.setCurrentLocation(4);
                System.out.println("you have arrived in " + " West Philly");

            }
            // 

            time.hasNextDay();
            time.nextDay();
            System.out.println(time.toString());// display time at end of turn
            // tell user that they are in destination city.
            // update time every time user moves to new location

        }// end while loop
    }// end main
}// end DopeWars
