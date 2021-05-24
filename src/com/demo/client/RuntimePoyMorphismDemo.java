package com.demo.client;

import com.demo.oops.polyMorphism.pojo.Airtel;
import com.demo.oops.polyMorphism.pojo.Idea;
import com.demo.oops.polyMorphism.pojo.Network;

public class RuntimePoyMorphismDemo {

	public static void main(String[] args) {
		
		Network network = new Idea(2, "idea");
		String networkinfo =network.getNetowrkOffer();
		System.out.println(networkinfo);

	}

}
