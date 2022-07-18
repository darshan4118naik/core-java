class OrderDTO
{
	private int id;
	private String type;
	private String name;
	private int price;
	
	public OrderDTO()
	{
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public String toString()
	{
		return "[OrderDTO : Id="+this.id+" , Type ="+this.type+"	,Name="+this.name+"	,Price="+this.price+"]";
	}
}