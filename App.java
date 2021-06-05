package com.oopsProblems;

import java.util.List;

import com.oopsProblems.model.Stock;
import com.oopsProblems.util.JsonUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Create the JSON from Inventory object and outputs the JSON String
        JsonUtil jsonUtil = new JsonUtil();
        List<Stock> listStock = jsonUtil.convertJsonToObj("D:\\Development\\Eclipse_Workspace\\oopsProblems\\src\\main\\java\\com\\oopsProblems\\model\\inventory.json");     
        System.out.println("Total items in the Inventory = " + listStock.size());   
    }
}
