package homework223.read_xml;

import java.util.Iterator;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class read_xml{
	public static void main(String[] a) throws Exception{
		SAXReader sr =new SAXReader();
		Document doc = sr.read("E:\\test.xml");
		Element root=doc.getRootElement();
		 // iterate through child elements of root
        for ( Iterator i = root.elementIterator("element"); i.hasNext(); ) {
            Element element = (Element) i.next();
            // do something
            System.out.println(element.getName());
            System.out.println(element.getStringValue());  // 获取element值
            
            Attribute nameAttr = element.attribute("name");  //获取element的属性
            String name = nameAttr.getValue();           //获取element的属性值
            Attribute ageAttr = element.attribute("age"); //获取element的属性
            String age = ageAttr.getValue();                 //获取element的属性值
            Attribute qualificAttr = element.attribute("qualific"); //获取element的属性
            String qualific = qualificAttr.getValue();           //获取element的属性值
        
            System.out.println("name: "+name);   //打印属性值
            System.out.println("age: "+age);
            System.out.println("qualific: "+qualific);
            
            
        }
  // iterate through attributes of root 
        for ( Iterator i = root.attributeIterator(); i.hasNext(); ) {
            Attribute attribute = (Attribute) i.next();
            // do something
            System.out.println(root.getName());
            System.out.println(attribute.getStringValue());  //获取<root>属性值
           
        }
	
	}
}

