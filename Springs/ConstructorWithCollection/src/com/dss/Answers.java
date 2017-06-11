package com.dss;

public class Answers {
	String ans;
	String by;
	public Answers() {
		// TODO Auto-generated constructor stub
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	@Override
	public String toString() {
		return ans+""+by;
	}
	

}
