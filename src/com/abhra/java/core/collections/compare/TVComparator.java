package com.abhra.java.core.collections.compare;

import java.util.Comparator;

public class TVComparator implements Comparator<TV>{

	@Override
	public int compare(TV o1, TV o2) {
		if(o1.getCost()==o2.getCost())
			return 0;
		if(o1.getCost()>o2.getCost())
			return -1;
		if(o1.getCost()<o2.getCost())
			return 1;
					
					
		return 0;
	}

}
