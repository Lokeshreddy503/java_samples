package com.dss;

import java.util.Iterator;
import java.util.List;

public class Questions {
	private int id;
	private String Question;
	private List<Answers> answers;
	public Questions() {
		// TODO Auto-generated constructor stub
	}
	public Questions(int id, String question, List<Answers> answers) {
		super();
		this.id = id;
		this.Question = question;
		this.answers = answers;
	}
	public void show()
	{
		System.out.println("the id:"+id);
		System.out.println("the question:"+Question);
		System.out.println("the answers are:");
		Iterator<Answers> iterator = answers.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
