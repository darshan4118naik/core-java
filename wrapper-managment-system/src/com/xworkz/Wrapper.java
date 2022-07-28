package com.xworkz;

public class Wrapper {

	public static void main(String[] args) {
		
 	   Integer id = 01;
 	   int id1 = id.intValue();
 	   byte id2 = id.byteValue();
 	   short id3 = id.shortValue();
 	   long id4 = id.longValue();
 	   float id5 = id.floatValue();
 	   double id6 = id.doubleValue();
 	 
 	   System.out.println(id1+"  "+id2+"  "+id3+"  "+id4+"  "+id5+"  "+id6);
 	   
 	   Long idL = 11223344L;
 	   int idL1 = idL.intValue();
 	   byte idL2 = idL.byteValue();
 	   short idL3 = idL.shortValue();
 	   long idL4 = idL.longValue();
 	   float idL5 = idL.floatValue();
 	   double idL6 = idL.doubleValue();
 	   
 	   System.out.println(idL1+"  "+idL2+"  "+idL3+"  "+idL4+"  "+idL5+"  "+idL6);
 	   
 	   Byte idB = 24;
 	   int idB1 = idB.intValue();
 	   byte idB2 = idB.byteValue();
 	   short idB3 = idB.shortValue();
 	   long idB4 = idB.longValue();
 	   float idB5 = idB.floatValue();
 	   double idB6 = idB.doubleValue();

 	   System.out.println(idB1+"  "+idB2+"  "+idB3+"  "+idB4+"  "+idB5+"  "+idB6);
 	   
 	   Short idS =123;
 	   int idS1 = idS.intValue();
 	   byte idS2 = idS.byteValue();
 	   short idS3 = idS.shortValue();
 	   long idS4 = idS.longValue();
 	   float idS5 = idS.floatValue();
 	   double idS6 = idS.doubleValue();

 	   System.out.println(idS1+"  "+idS2+"  "+idS3+"  "+idS4+"  "+idS5+"  "+idS6);
 	   
 	   Float idF = 4118.0f;
 	   int idF1 = idF.intValue();
 	   byte idF2 = idF.byteValue();
 	   short idF3 = idF.shortValue();
 	   long idF4 = idF.longValue();
 	   float idF5 = idF.floatValue();
 	   double idF6 = idF.doubleValue();
     
 	   System.out.println(idF1+"  "+idF2+"  "+idF3+"  "+idF4+"  "+idF5+"  "+idF6);
 	   
 	   Double idD = 0.1;
 	   int idD1 = idD.intValue();
 	   byte idD2 = idD.byteValue();
 	   short idD3 = idD.shortValue();
 	   long idD4 = idD.longValue();
 	   float idD5 = idD.floatValue();
 	   double idD6 = idD.doubleValue();

 	   System.out.println(idD1+"  "+idD2+"  "+idD3+"  "+idD4+"  "+idD5+"  "+idD6);
 	   
 	   Character ch = 'A';
 	   int ch1 = ch.charValue();
 	   long ch2 = ch.charValue();
 	   float ch3 = ch.charValue();
 	   double ch4 = ch.charValue();
 	   
 	System.out.println(ch1+" "+ch2+" "+ch3+" "+ch4);
    
 	System.out.println(id == idL.longValue());
 	System.out.println(id == idB.byteValue());
 	System.out.println(id==idS.shortValue());
 	System.out.println(id==idF.floatValue());
 	System.out.println(id==idD.doubleValue());
 	
 	System.out.println(idL==id.intValue());
 	System.out.println(idL==idB.byteValue());
 	System.out.println(idL==idS.shortValue());
 	System.out.println(idL==idF.floatValue());
 	System.out.println(idL==idD.doubleValue());
 	
 	System.out.println(idB==id.intValue());
 	System.out.println(idB==idS.shortValue());
 	System.out.println(idB== idL.longValue());
 	System.out.println(idB==idF.floatValue());
 	System.out.println(idB==idD.doubleValue());
 	
 	System.out.println(idS==idD.doubleValue());
 	System.out.println(idS==id.intValue());
 	System.out.println(idS== idL.longValue());
 	System.out.println(idS==idB.byteValue());
 	System.out.println(idS==idF.floatValue());
 	
 	System.out.println(idF==idD.doubleValue());
 	System.out.println(idF==id.intValue());
 	System.out.println(idF==idL.longValue());
 	System.out.println(idF==idB.byteValue());
 	System.out.println(idF==idS.shortValue());
 	
 	System.out.println(idD==idS.shortValue());
 	System.out.println(idD==idL.longValue());
 	System.out.println(idD==id.intValue());
 	System.out.println(idD==idB.byteValue());
 	System.out.println(idD==idF.floatValue());
 	
 	
 	
	}


}
