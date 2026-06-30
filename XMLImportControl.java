package shieldcare;
import java.io.*; import java.util.*; import javax.xml.parsers.*; import org.w3c.dom.*;
public class XMLImportControl {
    public List<InsurerXmlRecord> importInsurerXml(File file) throws Exception {
        List<InsurerXmlRecord> records = new ArrayList<>();
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
        NodeList list = doc.getElementsByTagName("policyRecord");
        for(int i=0;i<list.getLength();i++){
            Element e=(Element)list.item(i);
            records.add(new InsurerXmlRecord(text(e,"policyNumber"), Double.parseDouble(text(e,"premiumAmount")), Double.parseDouble(text(e,"commissionRate")), text(e,"claimReference")));
        }
        return records;
    }
    private String text(Element e,String tag){return e.getElementsByTagName(tag).item(0).getTextContent();}
}
