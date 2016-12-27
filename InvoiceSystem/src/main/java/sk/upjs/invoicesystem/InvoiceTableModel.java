package sk.upjs.invoicesystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class InvoiceTableModel extends AbstractTableModel {

    private InvoicesDao invoicesDao = ObjectFactory.INSTANCE.getInvoicesDao();

    private static final String[] COLUMNS_NAMES = {"Supplier", "Customer", "Exposure date"};

    private static final int COLUMNS_COUNT = COLUMNS_NAMES.length;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY");

    @Override
    public int getRowCount() {
        return invoicesDao.getInvoices().size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS_COUNT;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice invoice = invoicesDao.getInvoices().get(rowIndex);
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
                    return sdf.format(exposureDate);
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
