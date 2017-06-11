package com.applabs;

public class EmployeeBean 
{
	private int id;
	private String name;
	private Address address;
	public EmployeeBean(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void show()
	{
		System.out.println("the id:"+id);
		System.out.println("the name:"+name);
		System.out.println("the id:"+address);
	}

}
