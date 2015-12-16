package es.uvigo.ei.sing.hlfernandez.grid;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

public class DinamicTableViewModelWithCustomPopup {

	private List<ExtendedTableColumn> columns;
	private List<TableRow> rows;

	@Init
	public void init() {
		this.columns = Arrays.asList(
			new ExtendedTableColumn[]{
				new ExtendedTableColumn("Column 1", "Tooltip for column 1"),
				new ExtendedTableColumn("Column 2", "Tooltip for column 2"),
				new ExtendedTableColumn("Column 3", "Tooltip for column 3")
			}
		);
		this.rows = new LinkedList<TableRow>();
		for(int i = 1; i < 6; i++) {
			this.rows.add(new TableRow(generateRowValues(i)));
		}
		
	}

	private Map<TableColumn, Object> generateRowValues(int row) {
		Map<TableColumn, Object> rowValues = new HashMap<TableColumn, Object>();
		for(int column = 1; column <= this.columns.size(); column++) {
			rowValues.put(this.columns.get(column-1), new String(row + "," + column));
		}
		return rowValues;
	}

	public List<ExtendedTableColumn> getColumns() {
		return this.columns;
	}
	
	public List<TableRow> getRows() {
		return this.rows;
	}
	
	@NotifyChange({ "columns" })
	@Command
	public void hideColumn(@BindingParam("column") final ExtendedTableColumn column) {
		column.setVisible(!column.isVisible());
	}
}
