import java.io.File;
import java.io.FileOutputStream;

public class Sign {
 public static void main(String[] args) {
 try {
  String input = "src/invoice.xml";
  DocumentBuilderFactory dbf = newInstance();
  dbf.setNamespaceAware(true);   

  // Step 1
  String providerName = System.getProperty("jsr105Provider", 
 	"org.jcp.xml.dsig.internal.dom.XMLDSigRI");
  TransformerFactory tf = TransformerFactory.newInstance();
    trans.transform(new DOMSource(doc), new StreamResult(
  new FileOutputStream(output)));
  } catch (Exception e) {
   e.printStackTrace();
  }
 }
}
