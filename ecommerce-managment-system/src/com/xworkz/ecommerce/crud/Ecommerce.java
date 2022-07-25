package com.xworkz.ecommerce.crud;

import com.xworkz.ecommerce.dto.OrderDTO;

public interface Ecommerce {

	public boolean shopping(OrderDTO odr);
	public void getItem();
	public boolean updateTypeById(int id , String type);
	public boolean deleteOrderByType(String type);
	public boolean deleteOrderByName(String name);
	public String getOrderNameById(int id);
	public String getOrderTypeByName(String name);
}
