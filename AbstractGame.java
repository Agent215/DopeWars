/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dopewars;

import dopewars.collections.Inventory;
import dopewars.collections.Locations;
import dopewars.commerce.Bank;
import dopewars.config.Config;
import dopewars.time.Calendar;
public abstract class AbstractGame
{

    protected Inventory inventory;
    protected Locations locations;
    protected Bank bank;
    protected Calendar calendar;
    protected String gameName;
    protected int gameID;

    public String getGameName()
    {
        return gameName;
    }

    public int getGameID()
    {
        return gameID;
    }

    public void setCurrentLocation(String name)
    {
        locations.gotoLocationByName(name);
    }

    public abstract void nextTurn();

    public Locations getLocations()
    {
        if (locations == null) locations = new Locations();
        return locations;
    }

    public void setLocations(Locations locations)
    {
        this.locations = locations;
    }

    public Bank getBank()
    {
        if (bank == null) bank = new Bank(0, 0);
        return bank;
    }

    public void setBank(Bank bank)
    {
        this.bank = bank;
    }

    public Calendar getCalendar()
    {
        if (calendar == null) calendar = new Calendar(0);
        return calendar;
    }

    public void setCalendar(Calendar calendar)
    {
        this.calendar = calendar;
    }

    public Inventory getInventory()
    {
        if (inventory == null) inventory = new Inventory(100);
        return inventory;
    }

    //TODO need to test
    public int getScore()
    {
        return (int) ((int) (bank.getCash() + bank.getSavings()) - bank.getLoan());
    }

    //TODO need to test
    public double getNetWorth()
    {
        return bank.getSavings() + bank.getCash() + inventory.getCurrentTotal();
    }

    public abstract String toString();

    public void setGameID(int gameID)
    {
        this.gameID = gameID;
    }

    public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }
}