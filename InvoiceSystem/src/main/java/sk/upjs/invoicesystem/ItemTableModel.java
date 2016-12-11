package sk.upjs.invoicesystem;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ItemTableModel extends AbstractTableModel {

    private Invoice invoice;

    private static final String[] COLUMNS_NAMES = {"Name", "Count", "Unit of quantity", "Price"};

    private static final int COLUMNS_COUNT = COLUMNS_NAMES.length;

    public ItemTableModel(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public int getRowCount() {
        return invoice.getProducts().size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS_COUNT;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Item product = invoice.getProducts().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return product.getDescription();
            case 1:
                return product.getAmount();
            case 2:
                return product.getUnitOfAmount();
            case 3:
                return product.getPricePerPiece();
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
