package com.demo;

import java.util.Comparator;

public class IdComparator implements Comparator<Inventory>{

	@Override
	public int compare(Inventory obj1, Inventory obj2) {
		
		return obj1.getId()-obj2.getId();
	}

}
