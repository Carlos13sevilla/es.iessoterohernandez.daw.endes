import java.io;
import com.itextpdf.kernel.pdf;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class HelloWorld {

	  public static void main(String[] args) throws IOException {

	    File file = new File("hello.pdf");

	    PdfWriter pdfWriter = new PdfWriter(file);
	    PdfDocument pdfDocument = new PdfDocument(pdfWriter);

	    Document document = new Document(pdfDocument);

	    Paragraph paragraph = new Paragraph("Hello World");
	    paragraph.add("\n");
	    paragraph.add("Hola mundo");

	    document.add(paragraph);

	    document.close();
	  }
	}
	
}
