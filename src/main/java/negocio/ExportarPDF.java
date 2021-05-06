package negocio;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.apache.pdfbox.pdmodel.interactive.form.PDTextField;

public class ExportarPDF {
    Evento evento;

    public ExportarPDF(){
        // this.evento = evento;
    }

    public void guardarPDF(){
        try{
            PDDocument pDDocument = Loader.loadPDF(new File("src/main/java/imagenes/pdf4.pdf"));
            PDAcroForm pDAcroForm = pDDocument.getDocumentCatalog().getAcroForm();
            // pDAcroForm.
            // pDAcroForm.setDefaultAppearance("/Arial 15 Tf 15 g/");
            PDField field = pDAcroForm.getField("ambito");
            field.setValue("perico");
            // field = pDAcroForm.getField("txt_2");
            // field.setValue("This is a second field printed by Java");
            pDDocument.save("src/main/java/imagenes/pdf2.pdf");
            pDDocument.close();
            System.out.println("Escrito el documento");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
