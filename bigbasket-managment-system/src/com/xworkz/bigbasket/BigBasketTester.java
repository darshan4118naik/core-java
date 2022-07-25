package com.xworkz.bigbasket;

import com.xworkz.bigbasket.dto.BigBasketDTO;

public class BigBasketTester {

	public static void main(String[] args) {
		BigBasketDTO bb = new BigBasketDTO();
		bb.setOwnedBy("Tata Digital Limited");
		bb.setType("Online and offline");
		bb.setStartedIn(2011);
		bb.setOrigin("Bengaluru");
		
		
		System.out.println(bb);
		
	}

}
