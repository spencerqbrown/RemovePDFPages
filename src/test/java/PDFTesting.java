
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spencer
 */
public class PDFTesting {
    
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spencer\\Desktop\\HW1_W19.pdf");
        
        try {
            PDDocument testDoc = PDDocument.load(file);
            PDFRenderer rend = new PDFRenderer(testDoc);
            int curPage = 0;
            BufferedImage bim = rend.renderImageWithDPI(curPage, 300, ImageType.RGB);
            ImageIOUtil.writeImage(bim, "test.png", 300);
            testDoc.close();
        } catch (IOException io) {
            System.out.println("Failed");
        }
        
    }
    
}
