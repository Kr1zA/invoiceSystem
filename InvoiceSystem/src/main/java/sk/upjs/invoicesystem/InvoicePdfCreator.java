package sk.upjs.invoicesystem;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

public class InvoicePdfCreator {

    private PDDocument pdf;

    public InvoicePdfCreator() {
        try {
            pdf = PDDocument.load(new File("Faktura1.pdf"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setField(String name, String value) throws IOException {
        PDDocumentCatalog docCatalog = pdf.getDocumentCatalog();
        PDAcroForm acroForm = docCatalog.getAcroForm();
        PDField field = acroForm.getField(name);
        if (field != null) {
            field.setValue(value);
        } else {
            System.err.println("No field found with name:" + name);
        }

    }

    public void saveAndClose() {
        if (pdf != null) {
            try {
                pdf.save("nova.pdf");
                pdf.close();
            } catch (IOException ex) {
                Logger.getLogger(InvoicePdfCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

//    public void fill() {
//
//        try (PDDocument pdf = PDDocument.load(new File("Faktura1.pdf"))) {
//
//            PDAcroForm form = pdf.getDocumentCatalog().getAcroForm();
//            PDField field = form.getField("product1");
//            if (field != null) {
//                field.setValue("nasrac\nnasrac");
//            } else {
//                System.err.println("No field found with name:" + "a");
//            }
//            field = form.getField("product2");
//            if (field != null) {
//                field.setValue("nasrac\nnasrac");
//            } else {
//                System.err.println("No field found with name:" + "a");
//            }
//            pdf.save("vyplnena.pdf");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
}
