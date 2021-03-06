package sk.upjs.invoicesystem;

import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class CompaniesTableModel extends AbstractTableModel {

    private String searched;

    private CompaniesDao companies = ObjectFactory.INSTANCE.getCompanyDao();

    private static final String[] COLUMNS_NAMES = {"Company name", "City",};

    private static final int COLUMNS_COUNT = COLUMNS_NAMES.length;

    @Override
    public int getRowCount() {
        return companies.searchCompaniesByName(searched).size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS_COUNT;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Company company = companies.searchCompaniesByName(searched).get(rowIndex);
        switch (columnIndex) {
            case 0:

                return company.getCompanyName();
            case 1:
                return company.getCity();
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

    public void refresh(String searched) {
        this.searched = searched;
        fireTableDataChanged();
    }

}
