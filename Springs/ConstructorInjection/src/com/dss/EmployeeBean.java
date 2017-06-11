package com.dss;

public class EmployeeBean 
{
	private int eid;
	private String ename;
	public EmployeeBean()
	{
		
	}
	public EmployeeBean(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public EmployeeBean(int eid) {
		super();
		this.eid = eid;
	}
	public EmployeeBean(String ename) {
		super();
		this.ename = ename;
	}
	public void show()
	{
		System.out.println("id:"+eid+"name:"+ename);
	}

}
