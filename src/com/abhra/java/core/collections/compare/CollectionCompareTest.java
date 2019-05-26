package com.abhra.java.core.collections.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionCompareTest {

	public static void main(String[] args) {
		
		List<TV> tvList = new ArrayList<>();
		TV tv1 = new TV();
		tv1.setCost(100000l);
		
		TV tv2 = new TV();
		tv2.setCost(110000l);
		
		TV tv3 = new TV();
		tv3.setCost(90000l);
		
		tvList.add(tv1);
		tvList.add(tv2);
		tvList.add(tv3);
		
		Collections.sort(tvList);
		System.out.println("by comparable :");
		for(TV tv : tvList){
			System.out.println(tv.getCost());
		}
		
		tvList.sort(new TVComparator());
		System.out.println("by comparator :");
		for(TV tv : tvList){
			System.out.println(tv.getCost());
		}
		
	}

}
