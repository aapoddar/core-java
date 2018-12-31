package com.abhra.java.core.generaltopics;

public class InheritenceTest {
	
	public static void main(String args []){
		// Always a is the first priority 
		MunicipalityWard ward1 = new Ward1();
		ward1.setWardNo(1);
		ward1.setWardName("Amarendra Sarani");
		ward1.setCouncilorName("Dulal Dutta");
		
		System.out.println(String.format("Ward Number - %s , Name - %s  and the councilor - %s  :"
				, ward1.getWardNo(),ward1.getWardName(),ward1.getCouncilorName()));
	}

}
