package com.demo;

import java.util.Comparator;

public class InvetoryTypeComparator implements Comparator<Inventory>{

	@Override
	public int compare(Inventory obj1, Inventory obj2) {
		// TODO Auto-generated method stub
		return obj1.getIntoryType().compareToIgnoreCase(obj2.getIntoryType());
	}

}
