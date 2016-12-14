/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem.forms;

import java.awt.Dialog;
import sk.upjs.invoicesystem.Invoice;
import sk.upjs.invoicesystem.InvoiceTableModel;
import sk.upjs.invoicesystem.InvoicesDao;
import sk.upjs.invoicesystem.ObjectFactory;

/**
 *
 * @author kriza
 */
public class InvoicesForm extends javax.swing.JDialog {

    private InvoicesDao invoicesDAO = ObjectFactory.INSTANCE.getInvoicesDao();

    /**
     * Creates new form InvoicesForm
     */
    public InvoicesForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        refreshInvoiceForm();
    }

    private void refreshInvoiceForm() {
        InvoiceTableModel model = (InvoiceTableModel) invoiceFormTable.getModel();
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

        deleteInvoiceButton = new javax.swing.JButton();
        createInvoiceButton = new javax.swing.JButton();
        updateInvoiceButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceFormTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Invoices");

        deleteInvoiceButton.setText("Delete invoice");
        deleteInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoiceButtonActionPerformed(evt);
            }
        });

        createInvoiceButton.setText("Create invoice");
        createInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvoiceButtonActionPerformed(evt);
            }
        });

        updateInvoiceButton.setText("Update invoice");
        updateInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInvoiceButtonActionPerformed(evt);
            }
        });

        invoiceFormTable.setModel(new InvoiceTableModel());
        jScrollPane1.setViewportView(invoiceFormTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteInvoiceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateInvoiceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteInvoiceButton)
                    .addComponent(createInvoiceButton)
                    .addComponent(updateInvoiceButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvoiceButtonActionPerformed
        CreateInvoiceForm createInvoicesForm = new CreateInvoiceForm(this, true);
        createInvoicesForm.setVisible(true);
        refreshInvoiceForm();
    }//GEN-LAST:event_createInvoiceButtonActionPerformed

    private void deleteInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvoiceButtonActionPerformed
        int selectedRow = invoiceFormTable.getSelectedRow();
        if (selectedRow != -1) {
            Invoice selected = invoicesDAO.getInvoices().get(invoiceFormTable.getSelectedRow());
            if (selected != null) {
                invoicesDAO.deleteInvoice(selected);
                refreshInvoiceForm();
            }
        }
    }//GEN-LAST:event_deleteInvoiceButtonActionPerformed

    private void updateInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInvoiceButtonActionPerformed
        int selectedRow = invoiceFormTable.getSelectedRow();
        if (selectedRow != -1) {
            CreateInvoiceForm createInvoicesForm = new CreateInvoiceForm(this, true, selectedRow);
            createInvoicesForm.setVisible(true);
            refreshInvoiceForm();
        }
    }//GEN-LAST:event_updateInvoiceButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InvoicesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoicesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoicesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoicesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InvoicesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createInvoiceButton;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JTable invoiceFormTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateInvoiceButton;
    // End of variables declaration//GEN-END:variables
}
