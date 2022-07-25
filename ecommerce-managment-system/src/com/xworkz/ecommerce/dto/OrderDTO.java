package com.xworkz.ecommerce.dto;

import lombok.Data;

@Data
public class OrderDTO
{
	private int id;
	private String type;
	private String name;
	private int price;	
}
