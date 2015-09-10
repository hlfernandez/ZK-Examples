package es.uvigo.ei.sing.hlfernandez.grid;

import java.util.Map;

public class TableRow {

	private Map<TableColumn, Object> columnValues;

	public TableRow(Map<TableColumn, Object> columnValues) {
		this.columnValues = columnValues;
	}
	
	public Object getColumnValue(TableColumn col) {
		return this.columnValues.get(col);
	}
}
