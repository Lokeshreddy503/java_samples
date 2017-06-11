package entities;
public class ToDo {
	private String name, description, priority;

	public ToDo(String name, String description, String priority) {
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