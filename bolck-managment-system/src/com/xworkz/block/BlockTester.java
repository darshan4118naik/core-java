package com.xworkz.block;

public class BlockTester {

	public static void main(String[] args) {
		System.out.println("Main method created");
		Block bk = new Block();
		BlockTester bk1 = new BlockTester();

		System.out.println(bk1.blockInit);
		System.out.println(bk1.blockInit1);
		System.out.println("Main method ended");
	}
	int blockInit;
	{
		System.out.println("Instance Block is exicuted");
		blockInit=10;
	}
	static int blockInit1;
	static{
		System.out.println("static Block is exicuted");
		blockInit1=15;
	}

}
