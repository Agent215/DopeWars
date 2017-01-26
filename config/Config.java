/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dopewars.config;

/**
 *
 * @author Brahm
 */

import dopewars.items.item;

import java.util.ArrayList;

/**
 * User: Jesse Freeman
 * Date: 11/28/10
 * Time: 9:59 PM
 */
public interface Config
{
    int getGameID();

    void setGameID(int difficultyLevel);

    int getCurrentLocation();

    void setCurrentLocation(int currentLocation);

    double getSavings();

    void setSavings(double savings);

    double getLoan();

    void setLoan(double loan);

    double getInterest();

    void setInterest(double interest);

    double getCash();

    void setCash(double cash);

    int getDays();

    void setDays(int days);

    int getTotalDays();

    void setTotalDays(int totalDays);

    ArrayList<item> getItems();

    int getMaxTotal();

    int getMaxCurrentInventory();

    int getTotalEvents();

    int getRandomEventOdds();

    String getGameName();

    ArrayList<String> getLocationNames();
}
