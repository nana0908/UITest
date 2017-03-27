package homework223.read_xml;

import java.util.*;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
import java.io.*;

public class r_xml {
	public HashMap<String, people> toMap(String sFilepath)
	{
		HashMap<String, people> hs = null;
		try {
				SAXReader reader=new SAXReader();
				Document document = (Document) reader.read(new File(sFilepath));
				Element root = document.getRootElement();
				hs = new HashMap<String,people>();
				for (Iterator i = root.elementIterator("element"); i.hasNext();) 
				{
					Element el = (Element) i.next();
					Attribute nameAttr =el.attribute("name");  //获取element的属性
		            String sName = nameAttr.getValue();           //获取element的属性值
		            Attribute ageAttr = el.attribute("age"); //获取element的属性
		            String sAge = ageAttr.getValue();                 //获取element的属性值
		            Attribute qualificAttr = el.attribute("qualific"); //获取element的属性
		            String sColle = qualificAttr.getValue();           //获取element的属性值
					people sb = new people(sName, sAge, sColle);
					hs.put(el.getStringValue(), sb);
				}	
			}
		catch (Exception e) 
			{	
				e.printStackTrace();
			}
		return hs;
	}
}
