package com.app.myclass;

public class Todo {
	private String name, description, priority;

	public Todo(String name, String description, String priority) {
		super();
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getPriority() {
		return priority;
	}
}