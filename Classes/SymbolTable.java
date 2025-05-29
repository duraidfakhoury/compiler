package Classes;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {

    List <Row> rows = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public void print() {
        for (Row row : rows) {
            System.out.println(row.getType() + "\t\t\t\t" + row.getValue());
        }
    }
}

