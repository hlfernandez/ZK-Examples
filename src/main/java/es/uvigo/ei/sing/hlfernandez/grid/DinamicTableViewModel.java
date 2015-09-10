package es.uvigo.ei.sing.hlfernandez.grid;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.zkoss.bind.annotation.Init;

public class DinamicTableViewModel {

	private List<TableColumn> columns;
	private List<TableRow> rows;

	@Init
	public void init() {
		this.columns = Arrays.asList(new TableColumn[]{
				new TableColumn("Column 1", "Tooltip for column 1"),
				new TableColumn("Column 2", "Tooltip for column 2"),
				new TableColumn("Column 3", "Tooltip for column 3")
		});
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

	public List<TableColumn> getColumns() {
		return this.columns;
	}
	
	public List<TableRow> getRows() {
		return this.rows;
	}
}
