package es.uvigo.ei.sing.hlfernandez.grid;

public class TableColumn {

	private String name;
	private String description;

	public TableColumn(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
}
