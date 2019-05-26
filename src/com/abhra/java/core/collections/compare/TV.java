package com.abhra.java.core.collections.compare;

public class TV implements Comparable<TV>{
	
	private Long cost ;
	
	

	


	public Long getCost() {
		return cost;
	}






	public void setCost(Long cost) {
		this.cost = cost;
	}






	@Override
	public int compareTo(TV other) {
		if(this.cost == other.cost)
		return 0;
		if(this.cost > other.cost)
			return 1;
		if(this.cost < other.cost)
			return -1;
		return 0;
	}
	
	

}
