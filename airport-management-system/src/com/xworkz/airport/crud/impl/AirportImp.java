package com.xworkz.airport.crud.impl;

import java.util.Arrays;

import com.xworkz.airport.crud.Airport;
import com.xworkz.airport.dto.TerminalDTO;

public class AirportImp implements Airport {
	 TerminalDTO[] dtos;
		int index;
		
		public AirportImp(int size){
			dtos=new TerminalDTO[size];
			System.out.println("constructor creasted");
		}
		
		public boolean terminals(TerminalDTO td){
			boolean terminalAd = false;
			if(td!=null){
				this.dtos[index++] = td;
				terminalAd=true;
	         System.out.println("added successfully");			
				
			}
			else{
				System.out.println("check it");
			}
			return terminalAd;
		}
		
		public void getTerminalDetails(){
			for(int i=0;i<dtos.length;i++){
				System.out.println(dtos[i].getId()+":"+dtos[i].getType()+":"+dtos[i].getAirportName()+":"+dtos[i].getNoOfEntry()+":"+dtos[i].getNoOfExit());
			}
		}
		public boolean updateNamesById(int id,String airportName){
			System.out.println("inside updateName");
			   boolean updatedName=false;
			for(int i=0;i<dtos.length;i++){
				if(dtos[i].getId()==id){
					dtos[i].setAirportName(airportName);
					updatedName=true;
					System.out.println("updated successfully");
				}
				else{
					System.out.println("not updated");
				}
			}
			return updatedName;
		 }
		 
		 public boolean deleteByType(String type){
			boolean deleted=false;
			int i,j;
			for(i=0,j=0;j<dtos.length;j++){
				if(!dtos[j].getType().equals(type)){
					dtos[i++]=dtos[i];
					deleted=true;
					System.out.println("deleted successfully");
				}
			}
			dtos=Arrays.copyOf(dtos,i);
			return deleted;
		 }
		 
		 public boolean deleteByAirportName(String airportName){
			 boolean deleted=false;
			 int i,j;
			 for(i=0,j=0;j<dtos.length;j++){
				 if(!dtos[j].getAirportName().equals(airportName)){
					 dtos[i++]=dtos[j];
					 deleted=true;
					 System.out.println("deleted successfully");
				 }
			 }
			 dtos=Arrays.copyOf(dtos,i);
			 return deleted;
		 }
		 
		 public String[] getAllTerminals()
		 {
			 int j,i;
			 for(j=0,i=0;i<dtos.length;i++)
			 {
				 System.out.println("Terminal Names : " +dtos[i].getAirportName());
				 j++;
			 }
			 String[] allTerminalNames=new String[j];
			 for (int k = 0, m=0; k < dtos.length; k++) {
				 allTerminalNames[m++]=dtos[k].getAirportName();
			}
			return allTerminalNames; 
		 }
		 
	}


