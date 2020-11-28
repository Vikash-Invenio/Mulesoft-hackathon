package com.invenio.util.chatbot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


import javax.xml.bind.JAXBException;

public class restController {
	
	public String templateGenerator(String userId) throws IOException
	{
		GetMap  rest = new GetMap();
		Map<String, Object> objectType = rest.getJsonType(userId);
		Map<String, ArrayList<Object>> objectValue = rest.getJSONdata(userId);
		
	    String data = "";
	    try {
			AIMLWriter amlWriter = new AIMLWriter();
			data =  amlWriter.getTemplate(objectType,objectValue);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	   return data;
	}

}
