package com.abhra.java.core.generaltopics;

public abstract  class MunicipalityWard implements Cloneable{
	
	public static final  String MUNICIPALITY_NAME ="CHINSURAH";
	
	protected int wardNo = 0;
	
	protected String wardName;
	
	private String councilorName ;
	
	
	
	public  int costAllocation(int wardNo){
		int cost = 0;
		if(wardNo ==1){
			cost = 1000000;
		}
		return cost;
	}

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public String getCouncilorName() {
		return councilorName;
	}

	public void setCouncilorName(String councilorName) {
		this.councilorName = councilorName;
	}
	
	
	

}
