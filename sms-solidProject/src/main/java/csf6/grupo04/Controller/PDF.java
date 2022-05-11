package csf6.grupo04.Controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.StringJoiner;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import java.awt.Font;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDF {
    public static void writePDF(String filePath, String title, String[] data, int action) throws FileNotFoundException, DocumentException{
        Document doc = new Document();
        FileOutputStream fpath = new FileOutputStream(filePath);
        PdfWriter.getInstance(doc, fpath);
        doc.open();
        Paragraph pdftitle = new Paragraph(title,
                FontFactory.getFont("arial",
                        22,
                        Font.BOLD,
                        BaseColor.BLACK
                )
        );

        doc.add(pdftitle);

        StringJoiner text = new StringJoiner(" ");
        String plaintext = null;
        switch (action)
        {
            case 1 ->
                    {
                            text.add("Identificación: " + data[0] + "\n");
                            text.add("Nombre completo: "+ data[1] + " " + data[2] + "\n");
                            text.add("Edad: " + data[3] + "\n");
                            text.add("Teléfono: " + data[5] + "\n");
                            text.add("Dirección: " + data[6] + "\n");
                            text.add("Cargo: " + data[7] + "\n");
                            plaintext = text.toString();

                        Paragraph pdfbody = new Paragraph(plaintext,
                                FontFactory.getFont("arial",
                                        20,
                                        BaseColor.BLACK
                                )
                        );
                        doc.add(pdfbody);
                    }
            case 2 ->
                    {
                            text.add("Identificación: " + data[0] + "\n");
                            text.add("Nombre completo: "+ data[1] + " " + data[2] + "\n");
                            text.add("Edad: " + data[3] + "\n");
                            text.add("Teléfono: " + data[5] + "\n");
                            text.add("Dirección: " + data[6] + "\n");
                            plaintext = text.toString();

                        Paragraph pdfbody = new Paragraph(plaintext,
                                FontFactory.getFont("arial",
                                        20,
                                        BaseColor.BLACK
                                )
                        );
                        doc.add(pdfbody);
                    }

            case 3 ->
                    {
                            text.add("Carnet estudiantil: " + data[0] + "\n");
                            text.add("Nombre completo: "+ data[1] + " " + data[2] + "\n");
                            text.add("Edad: " + data[3] + "\n");
                            text.add("Teléfono: " + data[5] + "\n");
                            text.add("Curso: " + data[6] + "\n");
                            text.add("Estdiante desde: " + data[7] + " hasta: " + data[8] + "\n");
                            plaintext = text.toString();
                    }
        }

        Paragraph pdfbody = new Paragraph(plaintext,
                FontFactory.getFont("arial",
                        20,
                        BaseColor.BLACK
                )
        );
        doc.add(pdfbody);

        doc.close();
    }
}
