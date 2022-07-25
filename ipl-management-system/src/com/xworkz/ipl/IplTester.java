package com.xworkz.ipl;

import com.xworkz.ipl.dto.IplDTO;

public class IplTester {

	public static void main(String[] args) {
		IplDTO ipl = new IplDTO();
		ipl.setGameOf("Cricket");
		ipl.setManagedBy("BCCI");
		ipl.setSponser("TATA");
		ipl.setTeams(10);
		ipl.setType("Domestic");
		
		System.out.println(ipl.getGameOf()+ " : "+ipl.getManagedBy()+ " : "+ipl.getSponser()+ " : "+ipl.getTeams()+ " : "+ipl.getType());

	}

}
