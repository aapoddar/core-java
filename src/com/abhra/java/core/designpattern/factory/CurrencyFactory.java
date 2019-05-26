package com.abhra.java.core.designpattern.factory;

public class CurrencyFactory {
	
	
	
	public static Currency getCountryCurrency(String countryName){
		Currency countryCurr = null;
		if(countryName.equalsIgnoreCase("USA")){
			countryCurr = new USACurrency(); 
		}
		if(countryName.equalsIgnoreCase("India")){
			countryCurr = new IndianCurrency(); 
		}
		if(countryName.equalsIgnoreCase("UK")){
			countryCurr = new UKCurrency(); 
		}
		
		return countryCurr;
	}
	

}
