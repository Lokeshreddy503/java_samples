package com.setter;

public class StudentBean
{
	private String name;
	private int id;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
	}

}
