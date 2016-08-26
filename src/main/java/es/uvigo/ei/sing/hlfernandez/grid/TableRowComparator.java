package es.uvigo.ei.sing.hlfernandez.grid;

import java.io.Serializable;
import java.util.Comparator;

public class TableRowComparator implements Comparator<TableRow>, Serializable {
    private static final long serialVersionUID = -2127053833562854322L;
     
    private boolean ascending = true;
    private TableColumn tablecolumn;
 
    public TableRowComparator(boolean ascending) {
        this.ascending = ascending;
    }
 
    public TableColumn getColumn() {
        return tablecolumn;
    }
 
    public void setColumn(TableColumn tc) {
        this.tablecolumn = tc;
    }

	public int compare(TableRow t1, TableRow t2) {
		String s1 = t1.getColumnValue(getColumn()).toString();
		String s2 = t2.getColumnValue(getColumn()).toString();

		return ascending ? s1.compareTo(s2) : s2.compareTo(s1);
	}
 
}