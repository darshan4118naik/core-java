package com.xworkz.novel;

public class NovelTester {

	public static void main(String[] args) {
		NovelDTO n = new NovelDTO();
		n.setType("adventure");
		n.setAuthor("KP Poornachandra Tejasvi");
		n.setEdition(2);
		n.setName("Millenium series");
		n.setPrice(1000);
		System.out.println(n.getAuthor() + n.getEdition() + n.getName() + n.getPrice() + n.getType());

	}

}
