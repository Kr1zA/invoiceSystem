package sk.upjs.invoicesystem;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProductsTableModel extends AbstractTableModel {

    private List<Product> products;

    private static final String[] COLUMNS_NAMES = {"Name", "Count", "Price"};

    private static final int COLUMNS_COUNT = COLUMNS_NAMES.length;

    public ProductsTableModel(List<Product> products) {
        this.products = products;
    }

    @Override
    public int getRowCount() {
        return products.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS_COUNT;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Product product = products.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return product.getName();

            case 1:
                return product.getCount();
            case 2:
                return product.getPrice();
            default:
                return "???";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {

        return super.getColumnClass(columnIndex);
    }

    @Override
    public String getColumnName(int columnIndex) {
        return COLUMNS_NAMES[columnIndex];
    }

    public void refresh() {
        fireTableDataChanged();
    }

}
