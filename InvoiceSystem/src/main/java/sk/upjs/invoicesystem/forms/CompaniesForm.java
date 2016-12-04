/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem.forms;

import sk.upjs.invoicesystem.CompaniesTableModel;

/**
 *
 * @author kriza
 */
public class CompaniesForm extends javax.swing.JDialog {

    /**
     * Creates new form CompaniesForm
     */
    public CompaniesForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        refreshCompaniesForm();
    }

    private void refreshCompaniesForm() {
        CompaniesTableModel model = (CompaniesTableModel) companiesTable.getModel();
        model.refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteCompaniesButton = new javax.swing.JButton();
        createCompanyButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        companiesTable = new javax.swing.JTable();
        updateCompanyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Companies");

        deleteCompaniesButton.setText("Delete companies");
        deleteCompaniesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCompaniesButtonActionPerformed(evt);
            }
        });

        createCompanyButton.setText("Create company");
        createCompanyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCompanyButtonActionPerformed(evt);
            }
        });

        companiesTable.setModel(new CompaniesTableModel());
        jScrollPane1.setViewportView(companiesTable);

        updateCompanyButton.setText("Update company");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteCompaniesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateCompanyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createCompanyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCompanyButton)
                    .addComponent(deleteCompaniesButton)
                    .addComponent(updateCompanyButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//TO-DO oprav/vymysli iny konstruktor ...
    private void createCompanyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCompanyButtonActionPerformed
        CreateCompanyForm createCompanyForm = new CreateCompanyForm(this, true);
        createCompanyForm.setVisible(true);
    }//GEN-LAST:event_createCompanyButtonActionPerformed

    private void deleteCompaniesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCompaniesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCompaniesButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompaniesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompaniesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompaniesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompaniesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new CompaniesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable companiesTable;
    private javax.swing.JButton createCompanyButton;
    private javax.swing.JButton deleteCompaniesButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateCompanyButton;
    // End of variables declaration//GEN-END:variables
}
