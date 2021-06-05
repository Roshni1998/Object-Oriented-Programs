package com.oopsProblems;

import java.util.List;
import com.oopsProblems.model.Stock;
import com.oopsProblems.util.JsonUtil;
/**
 * @author Roshni
 * This is the main class file which is deal with creating JSON from Inventory 
 * object and output the JSON String.
 */

public class App 
{
    public static void main( String[] args )
    {
    	//Create the JSON from Inventory object and outputs the JSON String
        JsonUtil jsonUtil = new JsonUtil();
        List<Stock> listStock = jsonUtil.convertJsonToObj("D:\\Development\\Eclipse_Workspace\\oopsProblems\\src\\main\\java\\com\\oopsProblems\\model\\inventory.json");     
        System.out.println("Total items in the Inventory = " + listStock.size());   
        InventoryManager manager = new InventoryManager();
        manager.readInventory(listStock);
        manager.getTotalRiceWeight();
        manager.getTotalWheatWeight();
        manager.getTotalPulseWeight();
        manager.getPriceOfRicePerKg();
        manager.getPriceOfWheatPerKg();
        manager.getPriceOfPulsesPerKg();
        System.out.println("Total Inventory Cost = " +(manager.getTotalValueOfRice() + manager.getTotalValueOfWheat() + manager.getTotalValueOfPulses()));
    }
}
