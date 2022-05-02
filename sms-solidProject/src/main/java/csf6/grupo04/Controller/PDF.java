package csf6.grupo04.Controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import java.awt.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDF {
    public static void writePDF(String filePath, String title, String[] data) throws FileNotFoundException, DocumentException{
        Document doc = new Document();
        FileOutputStream fpath = new FileOutputStream(filePath);
        PdfWriter.getInstance(doc, fpath);
        doc.open();
        Paragraph pdftitle = new Paragraph(title,
                FontFactory.getFont("arial",
                        22,
                        Font.BOLD
                )
        );

        doc.add(pdftitle);

        StringBuilder text = new StringBuilder();
        for(int i = 0; i < data.length; i++)
        {
            text.append(data[i]);
        }
        String plaintext = text.toString();

        Paragraph pdfbody = new Paragraph(plaintext,
                FontFactory.getFont("arial",
                        20
                )
        );

        doc.add(pdfbody);
        doc.close();


    }
}
