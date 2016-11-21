package sk.upjs.invoicesystem;

import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class CompaniesTableModel extends AbstractTableModel {

    private CompaniesDao companies = CompaniesList.INSTANCE;

    private static final String[] COLUMNS_NAMES = {"Company name", "Firstname", "Surname", "City",};

    private static final int COLUMNS_COUNT = COLUMNS_NAMES.length;

    @Override
    public int getRowCount() {
        return companies.getCompanies().size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS_COUNT;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Company company = companies.getCompanies().get(rowIndex);
        switch (columnIndex) {
            case 0:
                if (company.getCompanyName() == "") {
                    return "-";
                } else {
                    return company.getCompanyName();
                }

         /*   case 1:
                if (company.getFirstName() == "") {
                    return "-";
                } else {
                    return company.getFirstName();
                }
            case 2:
                if (company.getSurName() == "") {
                    return "-";
                } else {
                    return company.getSurName();
                }*/
            case 3:
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

    public void refresh() {
        fireTableDataChanged();
    }

}
