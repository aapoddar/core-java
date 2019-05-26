package com.abhra.java.core.designpattern.factory;

public class FactoryTest {

	public static void main(String[] args) {
		
		String currencyUnitUSA = CurrencyFactory.getCountryCurrency("USA").getCurrency();
		String currencyUnitIndia = CurrencyFactory.getCountryCurrency("India").getCurrency();
		String currencyUnitUK = CurrencyFactory.getCountryCurrency("Uk").getCurrency();
		
		System.out.println("currencyUnitUSA :"+currencyUnitUSA);
		System.out.println("currencyUnitIndia :"+currencyUnitIndia);
		System.out.println("currencyUnitUK :"+currencyUnitUK);

	}

}
