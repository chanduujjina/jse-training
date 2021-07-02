package com.demo;

import java.util.Comparator;

public class InventoryNameCompator implements Comparator<Inventory>  {

	@Override
	public int compare(Inventory obj1, Inventory obj2) {
		// TODO Auto-generated method stub
		return obj1.getInvetoryNmae().compareToIgnoreCase(obj2.getInvetoryNmae());
	}

}
