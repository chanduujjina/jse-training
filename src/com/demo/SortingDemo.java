package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortingDemo {

	public static void main(String[] args) {
		
		ArrayList<Inventory> inventoryList = new ArrayList();
		
		Inventory inventory = new Inventory(3, "gold ring", "Jewlery");
		
		Inventory inventory1 = new Inventory(1, "t shirt", "clothes");
		
		Inventory inventory2 = new Inventory(2, "phone", "electrnic_goods");
		
		inventoryList.add(inventory);
		inventoryList.add(inventory1);
		inventoryList.add(inventory2);
		
		System.out.println(inventoryList);
		String sortType = "test";
		if(sortType.equals("id")) {
			Collections.sort(inventoryList, new  IdComparator());
		}
		
		else if(sortType.equals("name")){
			Collections.sort(inventoryList, new InventoryNameCompator());
		}
		
		//sort employeelist by id using java8
		inventoryList.sort((a,b)->a.getId()-b.getId());
		System.out.println(inventoryList);
		
		//sort employeelist by name using java8
		
		inventoryList.sort((a,b)->a.getInvetoryNmae().compareToIgnoreCase(b.getInvetoryNmae()));
		
		System.out.println(inventoryList);
		
		
		
		
		
		
	}
	
	

}
