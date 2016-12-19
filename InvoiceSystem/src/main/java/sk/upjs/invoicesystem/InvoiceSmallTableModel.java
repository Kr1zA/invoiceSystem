package sk.upjs.invoicesystem;

import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class InvoiceSmallTableModel extends AbstractTableModel {

    private InvoicesDao invoicesDao = ObjectFactory.INSTANCE.getInvoicesDao();

    private static final String[] COLUMNS_NAMES = {"Supplier", "Customer", "Exposure date"};

    private static final int COLUMNS_COUNT = COLUMNS_NAMES.length;

    @Override
    public int getRowCount() {
        int i = invoicesDao.getInvoices().size();
        if (i > 5) {
            return 5;
        }
        return i;
    }

    @Override
    public int getColumnCount() {
        return COLUMNS_COUNT;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice invoice = invoicesDao.get5LastInvoices().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return invoice.getSupplier().getCompanyName();

            case 1:
                return invoice.getCustomer().getCompanyName();
            case 2:
                Date exposureDate = invoice.getExposureDate();
                if (exposureDate == null) {
                    return "null";
                } else {
                    return exposureDate;
                }
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
