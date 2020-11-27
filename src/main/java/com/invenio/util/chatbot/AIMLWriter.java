package com.invenio.util.chatbot;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.xml.transform.StringResult;

import com.invenio.util.aiml.Aiml;
import com.invenio.util.aiml.Category;
import com.invenio.util.aiml.MixedPatternExpression;
import com.invenio.util.aiml.MixedTemplateContentContainer;

public class AIMLWriter {


	public String getTemplate(Map<String, Object> objectType,Map<String, ArrayList<Object>> map) throws JAXBException {
	       
		Aiml aiml1 = new Aiml();
		
		for (Entry<String, ArrayList<Object>> entry : map.entrySet()) {
		   
		    MixedPatternExpression ex= new MixedPatternExpression();
		    ex.getContent().add("# " + entry.getKey().toUpperCase() + " #");
		    MixedTemplateContentContainer temp = new MixedTemplateContentContainer();
		    if(entry.getValue().size()>0) {
		    	StringBuffer br = new StringBuffer("");
		    	for(Object ob:entry.getValue()) {
		    		br.append(ob.toString());
		    		br.append(",");
		    	}
		    	br.delete(br.lastIndexOf(","), br.lastIndexOf(",")+1);
		    temp.getContent().add(br.toString());
		    Category category = new Category();
			category.setPattern(ex);
			category.setTemplate(temp);
			aiml1.getTopicOrCategory().add(category);
		    }
		    
		}
		JAXBContext context = JAXBContext.newInstance(Aiml.class);
        Marshaller m = context.createMarshaller();
        
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_ENCODING, "UTF-16");
		
		  StringResult data = new StringResult();
		  m.marshal(aiml1, data);
		  
		  return data.toString();
		
	}
}