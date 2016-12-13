/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem.forms;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import org.bson.types.ObjectId;
import sk.upjs.invoicesystem.*;

/**
 *
 * @author kriza
 */
public class CreateInvoiceForm extends javax.swing.JDialog {

    private InvoicePdfCreator invoicePdfCreator = new InvoicePdfCreator();
    private Invoice newInvoice = new Invoice();
    private InvoicesDao invoices = ObjectFactory.INSTANCE.getInvoicesDao();
    private ItemsDao    items = ObjectFactory.INSTANCE.getItemsDao();

    private CreateCompanyForm createSupplier = new CreateCompanyForm(this, true, "supplier");
    private CreateCompanyForm createCustomer = new CreateCompanyForm(this, true, "customer");
    private ChooseCompanyForm chooseSupplier = new ChooseCompanyForm(this, true, "supplier");
    private ChooseCompanyForm chooseCustomer = new ChooseCompanyForm(this, true, "customer");

    private Company supplier;
    private Company customer;

    public void setCustomer(Company Customer) {
        this.customer = Customer;
    }

    public void setSupplier(Company Supplier) {
        this.supplier = Supplier;
    }

    public void setButtonTextChooseCustomer(String name) {
        this.chooseCustomerButton.setText(name);
    }

    public void setButtonTextChooseSupplier(String name) {
        this.chooseSupplierButton.setText(name);
    }

    /**
     * Creates new form CreateCompanyForm
     */
    public CreateInvoiceForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public CreateInvoiceForm(MenuForm menuForm) {
        initComponents();
    }

    public CreateInvoiceForm(InvoicesForm invoicesForm) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        chooseSupplierButton = new javax.swing.JButton();
        chooseCustomerButton = new javax.swing.JButton();
        createSupplierButton = new javax.swing.JButton();
        createCustomerButton = new javax.swing.JButton();
        constantSymbolField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        drewUpByField = new javax.swing.JTextField();
        noteField = new javax.swing.JTextField();
        createInvoiceButton = new javax.swing.JButton();
        newProductField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        newCountField = new javax.swing.JTextField();
        newPriceField = new javax.swing.JTextField();
        addNewProductButton = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        deleteProductButton = new javax.swing.JButton();
        paymentsFormComboBox = new javax.swing.JComboBox<>();
        newUnitOfQuantityField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        variableSymbolField = new javax.swing.JTextField();
        currencyComboBox1 = new javax.swing.JComboBox<>();
        exposureDateJDateChooser = new com.toedter.calendar.JDateChooser();
        deliveryDateJDateChooser = new com.toedter.calendar.JDateChooser();
        paymentsDueDateJDateChooser = new com.toedter.calendar.JDateChooser();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create invoice");

        chooseSupplierButton.setText("Choose supplier");
        chooseSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseSupplierButtonActionPerformed(evt);
            }
        });

        chooseCustomerButton.setText("Choose customer");
        chooseCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCustomerButtonActionPerformed(evt);
            }
        });

        createSupplierButton.setText("Create supplayer");
        createSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSupplierButtonActionPerformed(evt);
            }
        });

        createCustomerButton.setText("Create customer");
        createCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustomerButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Constant symbol");

        jLabel2.setText("Exposure date");

        jLabel3.setText("Delivery date");

        jLabel4.setText("Payment due date");

        jLabel5.setText("Currency");

        jLabel6.setText("Payments form");

        jLabel7.setText("Note");

        jLabel8.setText("Drew up by");

        createInvoiceButton.setText("Create!");
        createInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvoiceButtonActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Product");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Count");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Price");

        addNewProductButton.setText("Add product");
        addNewProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewProductButtonActionPerformed(evt);
            }
        });

        productsTable.setModel(new sk.upjs.invoicesystem.ItemTableModel(newInvoice));
        productsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(productsTable);

        deleteProductButton.setText("Delete product");
        deleteProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductButtonActionPerformed(evt);
            }
        });

        paymentsFormComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Money transfer", "Cash", "Cash on delivery"}));
        paymentsFormComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentsFormComboBoxActionPerformed(evt);
            }
        });

        newUnitOfQuantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUnitOfQuantityFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("Unit of quantity");

        jLabel13.setText("Variable symbol");

        currencyComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "€", "$", "Czk"}));
        currencyComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                            .addComponent(chooseSupplierButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createSupplierButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(constantSymbolField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addComponent(variableSymbolField)
                            .addComponent(exposureDateJDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deliveryDateJDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paymentsDueDateJDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createInvoiceButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newProductField)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newCountField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newUnitOfQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newPriceField)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteProductButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addNewProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(noteField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addComponent(drewUpByField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addComponent(paymentsFormComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(currencyComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chooseSupplierButton)
                            .addComponent(createSupplierButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chooseCustomerButton)
                            .addComponent(createCustomerButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(variableSymbolField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(constantSymbolField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exposureDateJDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(deliveryDateJDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paymentsDueDateJDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(currencyComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(paymentsFormComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drewUpByField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newUnitOfQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newProductField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(newCountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(addNewProductButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProductButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createInvoiceButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseSupplierButtonActionPerformed
        chooseSupplier.setVisible(true);
    }//GEN-LAST:event_chooseSupplierButtonActionPerformed

    private void chooseCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCustomerButtonActionPerformed
        chooseCustomer.setVisible(true);
    }//GEN-LAST:event_chooseCustomerButtonActionPerformed

    private void createSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSupplierButtonActionPerformed
        createCustomer.setVisible(true);

    }//GEN-LAST:event_createSupplierButtonActionPerformed

    private void createCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCustomerButtonActionPerformed
        createSupplier.setVisible(true);
    }//GEN-LAST:event_createCustomerButtonActionPerformed

    private void deleteProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductButtonActionPerformed
        int selectedRow = productsTable.getSelectedRow();
        if (selectedRow > 0) {
            newInvoice.getProducts().remove(newInvoice.getProducts().get(selectedRow));
            refreshMenuForm();
        }
    }//GEN-LAST:event_deleteProductButtonActionPerformed

    private void addNewProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewProductButtonActionPerformed

        String name = newProductField.getText();
        int count = Integer.parseInt(newCountField.getText());
        double price = Double.parseDouble(newPriceField.getText());
        String unitOfQuantity = newUnitOfQuantityField.getText();
        newInvoice.getProducts().add(new Item(name, count, price, unitOfQuantity));
        refreshMenuForm();
    }//GEN-LAST:event_addNewProductButtonActionPerformed

    private void productsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsTableMouseClicked
    }//GEN-LAST:event_productsTableMouseClicked

    private void createInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvoiceButtonActionPerformed
        ObjectId id = new ObjectId();
        newInvoice.setConstantSymbol(Integer.parseInt(constantSymbolField.getText()));
        newInvoice.setCurrency((String) currencyComboBox1.getSelectedItem());
        newInvoice.setCustomer(customer);
        newInvoice.setDeliveryDate(deliveryDateJDateChooser.getDate());
        newInvoice.setDrewUpBy(drewUpByField.getText());
        newInvoice.setExposureDate(exposureDateJDateChooser.getDate());
        newInvoice.setInvoiceNumber(Integer.parseInt(variableSymbolField.getText()));
        newInvoice.setNote(noteField.getText());
        newInvoice.setPaymentDueDate(paymentsDueDateJDateChooser.getDate());
        newInvoice.setPaymentsForm((String) paymentsFormComboBox.getSelectedItem());
        newInvoice.setSupplier(supplier);
        newInvoice.setVariableSymbol(Integer.parseInt(variableSymbolField.getText()));
        newInvoice.setInvoiceId(id);
        invoices.addInvoice(newInvoice);
        
        List<Item> item = newInvoice.getProducts();
        for (Item item1 : item) {
            item1.setInvoiceId(id);
            items.addItem(item1);
        }
        
        
        this.dispose();
        String paymentsForm = (String) paymentsFormComboBox.getSelectedItem();
        String currency = (String) currencyComboBox1.getSelectedItem();
        String invoiceNumber = variableSymbolField.getText();
//        Date datum = paymentsDueDateJDateChooser.getDate();
//        System.out.print(datum);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY");
//        System.out.print(sdf.format(datum));
        String paymentDueDate = sdf.format(paymentsDueDateJDateChooser.getDate());

        String deliveryDate = sdf.format(deliveryDateJDateChooser.getDate());
        String exposureDate = sdf.format(exposureDateJDateChooser.getDate());
        System.out.println(paymentsDueDateJDateChooser.getDate() + "\n" + deliveryDateJDateChooser.getDate() + "\n" + exposureDateJDateChooser.getDate());
        System.out.println(paymentDueDate + "\n" + deliveryDate + "\n" + exposureDate);
        String variableSymbol = variableSymbolField.getText();
        String constantSymbol = constantSymbolField.getText();
        String note = noteField.getText();
        String drewUpBy = drewUpByField.getText();

        String[] itemName = {"product1", "product2", "product3", "product4", "product5", "product6", "product7", "product8", "product9", "product10", "product11", "product12", "product13", "product14", "product15", "product16", "product17", "product18", "product19", "product20", "product21", "product22", "product23", "product24"};
        String[] intemNumber = {"i1", "i2", "i3", "i4", "i5", "i6", "i7", "i8", "i9", "i10", "i11", "i12", "i13", "i14", "i15", "i16", "i17", "i18", "i19", "i20", "i21", "i22", "i23", "i24"};
        String[] unitOfAmount = {"unitOfAmount1", "unitOfAmount2", "unitOfAmount3", "unitOfAmount4", "unitOfAmount5", "unitOfAmount7", "unitOfAmount6", "unitOfAmount8", "unitOfAmount9", "unitOfAmount10", "unitOfAmount11", "unitOfAmount12", "unitOfAmount13", "unitOfAmount14", "unitOfAmount15", "unitOfAmount16", "unitOfAmount17", "unitOfAmount18", "unitOfAmount19", "unitOfAmount20", "unitOfAmount21", "unitOfAmount22", "unitOfAmount23", "unitOfAmount24"};
        String[] price = {"price1", "price2", "price3", "price4", "price5", "price6", "price7", "price8", "price9", "price10", "price11", "price12", "price13", "price14", "price15", "price16", "price17", "price18", "price19", "price20", "price21", "price22", "price23", "price24"};
        String[] pricePerPiece = {"pricePerPiece1", "pricePerPiece2", "pricePerPiece3", "pricePerPiece4", "pricePerPiece5", "pricePerPiece6", "pricePerPiece7", "pricePerPiece8", "pricePerPiece9", "pricePerPiece10", "pricePerPiece11", "pricePerPiece12", "pricePerPiece13", "pricePerPiece14", "pricePerPiece15", "pricePerPiece16", "pricePerPiece17", "pricePerPiece18", "pricePerPiece19", "pricePerPiece20", "pricePerPiece21", "pricePerPiece22", "pricePerPiece23", "pricePerPiece24"};
        String[] countOfItem = {"count1", "count2", "count3", "count4", "count5", "count6", "count7", "count8", "count9", "count10", "count11", "count12", "count13", "count14", "count15", "count16", "count17", "count18", "count19", "count20", "count21", "count22", "count23", "count24"};

        try {
            invoicePdfCreator.setField("paymentsForm", paymentsForm);
            invoicePdfCreator.setField("currency", currency);
            invoicePdfCreator.setField("invoiceNumber", invoiceNumber);
            invoicePdfCreator.setField("paymentDueDate", paymentDueDate);
            invoicePdfCreator.setField("deliveryDate", deliveryDate);
            invoicePdfCreator.setField("exposureDate", exposureDate);
            invoicePdfCreator.setField("variableSymbol", variableSymbol);
            invoicePdfCreator.setField("constantSymbol", constantSymbol);
            invoicePdfCreator.setField("note", note);
            invoicePdfCreator.setField("drewUpBy", drewUpBy);

            invoicePdfCreator.setField("IBAN", supplier.getIBAN());
            invoicePdfCreator.setField("companyName", supplier.getCompanyName());
            invoicePdfCreator.setField("street", supplier.getStreet());
            invoicePdfCreator.setField("city", supplier.getCity() + " " + supplier.getPostalCode());
            invoicePdfCreator.setField("country", supplier.getCountry());
            invoicePdfCreator.setField("email", supplier.getEmail());
            invoicePdfCreator.setField("telephoneNumber", supplier.getTelephoneNumber());
            invoicePdfCreator.setField("ICO", new Long(supplier.getICO()).toString());
            invoicePdfCreator.setField("DIC", new Long(supplier.getDIC()).toString());
            invoicePdfCreator.setField("ICDPH", new Long(supplier.getICDPH()).toString());

            invoicePdfCreator.setField("companyNameC", customer.getCompanyName());
            invoicePdfCreator.setField("streetC", customer.getStreet());
            invoicePdfCreator.setField("cityC", customer.getCity() + " " + customer.getPostalCode());
            invoicePdfCreator.setField("countryC", customer.getCountry());
            invoicePdfCreator.setField("emailC", customer.getEmail());
            invoicePdfCreator.setField("telephoneNumberC", customer.getTelephoneNumber());
            invoicePdfCreator.setField("ICOC", new Long(customer.getICO()).toString());
            invoicePdfCreator.setField("DICC", new Long(customer.getDIC()).toString());
            invoicePdfCreator.setField("ICDPHC", new Long(customer.getICDPH()).toString());

            double priceSum = 0;
            for (int i = 0; i < newInvoice.getProducts().size(); i++) {
                invoicePdfCreator.setField(itemName[i], newInvoice.getProducts().get(i).getDescription());
                invoicePdfCreator.setField(intemNumber[i], Integer.toString(i + 1));
                invoicePdfCreator.setField(unitOfAmount[i], newInvoice.getProducts().get(i).getUnitOfAmount());
                invoicePdfCreator.setField(pricePerPiece[i], Double.toString(round(newInvoice.getProducts().get(i).getPricePerPiece())));
                invoicePdfCreator.setField(countOfItem[i], Integer.toString(newInvoice.getProducts().get(i).getAmount()));
                invoicePdfCreator.setField(price[i], Double.toString(round(newInvoice.getProducts().get(i).getPricePerPiece() * newInvoice.getProducts().get(i).getAmount())));
                priceSum += newInvoice.getProducts().get(i).getPricePerPiece() * newInvoice.getProducts().get(i).getAmount();
            }

            invoicePdfCreator.setField("priceWithoutDPH", Double.toString(round(priceSum)));
            invoicePdfCreator.setField("priceWithDPH", Double.toString(round(priceSum * 0.2)));
            invoicePdfCreator.setField("price", Double.toString(round(priceSum * 1.2)));
            invoicePdfCreator.saveAndClose();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_createInvoiceButtonActionPerformed

    private double round(double d) {
        d = d * 100 + 0.5;
        d = ((int) d) / 100.0;
        return d;
    }

    private void paymentsFormComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentsFormComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentsFormComboBoxActionPerformed

    private void newUnitOfQuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUnitOfQuantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUnitOfQuantityFieldActionPerformed

    private void currencyComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currencyComboBox1ActionPerformed

    private void refreshMenuForm() {
        ItemTableModel model = (ItemTableModel) productsTable.getModel();
        model.refresh();

    }

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
            java.util.logging.Logger.getLogger(CreateInvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateInvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateInvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateInvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new CreateInvoiceForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addNewProductButton;
    private javax.swing.JButton chooseCustomerButton;
    private javax.swing.JButton chooseSupplierButton;
    private javax.swing.JTextField constantSymbolField;
    private javax.swing.JButton createCustomerButton;
    private javax.swing.JButton createInvoiceButton;
    private javax.swing.JButton createSupplierButton;
    private javax.swing.JComboBox<String> currencyComboBox1;
    private javax.swing.JButton deleteProductButton;
    private com.toedter.calendar.JDateChooser deliveryDateJDateChooser;
    private javax.swing.JTextField drewUpByField;
    private com.toedter.calendar.JDateChooser exposureDateJDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField newCountField;
    private javax.swing.JTextField newPriceField;
    private javax.swing.JTextField newProductField;
    private javax.swing.JTextField newUnitOfQuantityField;
    private javax.swing.JTextField noteField;
    private com.toedter.calendar.JDateChooser paymentsDueDateJDateChooser;
    private javax.swing.JComboBox<String> paymentsFormComboBox;
    private javax.swing.JTable productsTable;
    private javax.swing.JTextField variableSymbolField;
    // End of variables declaration//GEN-END:variables
}
