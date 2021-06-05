package com.oopsProblems.util;

import java.io.File;
import java.util.List;

import com.oopsProblems.model.Stock;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * 
 * @author Roshni
 * This file is going to deal with object mapping JSON to java 
 * object.
 *
 */
public class JsonUtil {
	
	/**
	 * 
	 * @param filePath
	 * @return List<Stock>
	 */
	
	//Giving the inventory JSON file path
	public List<Stock> convertJsonToObj(String filePath) {
		try {
			ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			File jsonFile = new File(filePath);
			//Converting JSON file data to java object using object mapper
			List<Stock> stockList = objectMapper.readValue(jsonFile, new TypeReference<List<Stock>>(){});
			return stockList;
		}catch (Exception e) {
			e.printStackTrace();
			return null;	
		}
	}	
}
