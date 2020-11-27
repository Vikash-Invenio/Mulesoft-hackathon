package com.invenio.util.chatbot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonToHashMapKeyValue {
	
	public Map<String, ArrayList<Object>> map = new HashMap<String, ArrayList<Object>>();
	
	public Map<String, ArrayList<Object>> jsonToMap(JSONObject json) throws JSONException {
		Map<String, ArrayList<Object>> retMap = new HashMap<String, ArrayList<Object>>();

		if (json != JSONObject.NULL) {
			retMap = toMap(json);
		}
		return retMap;
	}

	
	
	public Map<String, ArrayList<Object>> toMap(JSONObject object) throws JSONException {

		Iterator<String> keysItr = object.keys();
		while (keysItr.hasNext()) {

			String key = keysItr.next();
			if (map.get(key) == null) {
				map.put(key, new ArrayList<Object>());

			}

			Object value = object.get(key);

			if (value instanceof JSONArray) {

				value = toList((JSONArray) value);

				if (value instanceof List) {
					ArrayList <Object> temp = new ArrayList<Object>();
					temp.add(value);
					map.replace(key, temp);

				} else {
					map.get(key).add(value);
				}

			}

			else if (value instanceof JSONObject) {
				Map<String, ArrayList<Object>> localmap1 = new HashMap<String, ArrayList<Object>>();
				Object value2=value;
				Object value1 = toMap1((JSONObject) value,localmap1);
				map.get(key).add(value1);
				ArrayList <Object> temp = new ArrayList<Object>();
				temp.add(value2)
;				map.replace(key, temp);

			} else if (value instanceof String) {

				map.get(key).add(value);

			} else if (value instanceof Integer) {

				map.get(key).add(value);

			}
			else if(value instanceof Boolean)
			{
				map.get(key).add(value);
			}

		}
		return map;
	}
	
	
	
	
	
	
	public Map<String, ArrayList<Object>> toMap1(JSONObject object,Map<String, ArrayList<Object>> localmap) throws JSONException {

		Iterator<String> keysItr = object.keys();
		while (keysItr.hasNext()) {

			String key = keysItr.next();
			if (map.get(key) == null) {
				map.put(key, new ArrayList<Object>());

			}
			if (localmap.get(key) == null) {
				localmap.put(key, new ArrayList<Object>());

			}

			Object value = object.get(key);

			if (value instanceof JSONArray) {

				value = toList((JSONArray) value);

				
				localmap.get(key).add(value);
				

			}

			else if (value instanceof JSONObject) {
				Map<String, ArrayList<Object>> localmap1 = new HashMap<String, ArrayList<Object>>();
				ArrayList <Object> temp = new ArrayList<Object>();
				Object value1=value;
				value = toMap1((JSONObject) value,localmap1);
				
				map.get(key).add(value);
				localmap.get(key).add(value);
				temp.add(value1);
				map.replace(key, temp);
				localmap.replace(key,temp);

			} else if (value instanceof String) {

				map.get(key).add(value);
				localmap.get(key).add(value);

			} else if (value instanceof Integer) {

				map.get(key).add(value);
				localmap.get(key).add(value);

			}
			else if(value instanceof Boolean)
			{
				map.get(key).add(value);
				localmap.get(key).add(value);
			}
				

		}
		return localmap;
	}
	
	 public List<Object> removeDuplicates(List<Object> list) 
	    { 
	  
	    
		 List<Object> newList = new ArrayList<Object>(); 
	  
	
	        for (Object element : list) { 
	  
	            
	            if (!newList.contains(element)) { 
	  
	                newList.add(element); 
	            } 
	        } 
	  
	   
	        return newList; 
	    }
	

	public List<Object> toList(JSONArray array) throws JSONException {

		Map<String, ArrayList<Object>> localmap = new HashMap<String, ArrayList<Object>>();
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < array.length(); i++) {
			Object value = array.get(i);
			Object value1=value;
			if (value instanceof JSONArray) {

				value = toList((JSONArray) value);
				value1=value;
			}

			else if (value instanceof JSONObject) {
               
				value = toMap1((JSONObject) value,localmap);
			}

			list.add(value1);
		}
		 List<Object> newList = removeDuplicates(list);

		return newList;
	}

}
