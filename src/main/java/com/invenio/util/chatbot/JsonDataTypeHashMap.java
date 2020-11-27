package com.invenio.util.chatbot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonDataTypeHashMap {
	
	public static Map<String, Object> maptype = new HashMap<String, Object>();

	public static Map<String, Object> jsonToMap(JSONObject json) throws JSONException {
	    Map<String, Object> retMap = new HashMap<String, Object>();

	    if(json != JSONObject.NULL) {
	        retMap = toMap(json);
	    }
	    return retMap;
	}

	public static Map<String, Object> toMap(JSONObject object) throws JSONException {
	    

	    Iterator<String> keysItr = object.keys();
	    while(keysItr.hasNext()) {
	        String key = keysItr.next();
	        Object value = object.get(key);

	        if(value instanceof JSONArray) {
	        	maptype.put(key.toUpperCase(), "JSONArray");
	            value = toList((JSONArray) value);
	        }

	        else if(value instanceof JSONObject) {
	        	maptype.put(key.toUpperCase(), "JSONObject");
	            value = toMap((JSONObject) value);
	        }
	        else if(value instanceof String) {
	        	maptype.put(key.toUpperCase(), "String");
	        	
	        }
	        else if(value instanceof Integer) {
	        	maptype.put(key.toUpperCase(), "Integer");
	        	
	        }
	        else if(value instanceof Boolean) {
	        	maptype.put(key.toUpperCase(), "Boolean");
	        	
	        }
	        
	        
	    }
	    return maptype;
	}

	public static List<Object> toList(JSONArray array) throws JSONException {
		
	    List<Object> list = new ArrayList<Object>();
	    for(int i = 0; i < array.length(); i++) {
	        Object value = array.get(i);
	        if(value instanceof JSONArray) {
	            value = toList((JSONArray) value);
	        }

	        else if(value instanceof JSONObject) {
	            value = toMap((JSONObject) value);
	        }
	        list.add(value);
	    }
	    return list;
	}

}
