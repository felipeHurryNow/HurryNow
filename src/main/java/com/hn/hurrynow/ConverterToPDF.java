/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 *
 * @author juang
 */
public class ConverterToPDF {

    public static final String DEST = "C:/Users/juang/Desktop/HurryNow/src/main/java/com/hn/hurrynow/example.pdf";
    public static final String HTML = "C:/Users/juang/Desktop/HurryNow/src/main/java/com/hn/hurrynow/example.html";
 
    /*public static void main(String[] args) throws IOException, DocumentException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new ConverterToPDF().createPdf(DEST);
    }*/
 
    public void createPdf(String file) throws IOException, DocumentException {
         // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        // step 3
        document.open();
        // step 4
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream(HTML), Charset.forName("cp1252"));
        // step 5
        document.close();;
    }
}
