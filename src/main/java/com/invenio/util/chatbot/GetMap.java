package com.invenio.util.chatbot;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;


public class GetMap {

	public Map<String, ArrayList<Object>> getJSONdata() throws MalformedURLException, IOException
	{
		
		
		CloudHubObjectGenerator gen = new CloudHubObjectGenerator();
        String string_to_Be_Parsed = gen.getaccount();
		JSONObject jsonObj;
		Map<String, ArrayList<Object>> result2 = null;
		try {
			jsonObj = new JSONObject(string_to_Be_Parsed);
		
		JsonToHashMapKeyValue json =  new JsonToHashMapKeyValue();
		result2 = json.jsonToMap(jsonObj);
		if(result2.containsKey("name"))
		result2.remove("name");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result2;
		
		
		
	}
	
	public Map<String, Object> getJsonType() throws MalformedURLException, IOException {
		
		CloudHubObjectGenerator gen = new CloudHubObjectGenerator();
        String string_to_Be_Parsed = gen.getaccount();
        Map<String, Object> type=null;
		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(string_to_Be_Parsed);
			type=JsonDataTypeHashMap.jsonToMap(jsonObj);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return type;
	}
	
	
	

}
