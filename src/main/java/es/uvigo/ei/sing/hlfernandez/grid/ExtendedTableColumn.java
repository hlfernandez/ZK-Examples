package es.uvigo.ei.sing.hlfernandez.grid;

public class ExtendedTableColumn extends TableColumn {

	private boolean visible = true;

	public ExtendedTableColumn(String name, String description) {
		super(name, description);
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
