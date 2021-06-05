package com.oopsProblems.util;

import java.io.File;
import java.util.List;

import com.oopsProblems.model.Stock;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

public class JsonUtil {
	//Giving the inventory JSON file path
	public List<Stock> convertJsonToObj(String filePath) {
		try {
			ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			File jsonFile = new File(filePath);
			List<Stock> stockList = objectMapper.readValue(jsonFile, new TypeReference<List<Stock>>(){});
			return stockList;
		}catch (Exception e) {
			e.printStackTrace();
			return null;	
		}
	}	
}
