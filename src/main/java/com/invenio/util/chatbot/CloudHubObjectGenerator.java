package com.invenio.util.chatbot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudHubObjectGenerator {

    public String getaccount() throws IOException {
		URL url = new URL("https://anypoint.mulesoft.com/accounts/login?username=devesh_gaur1&password=Yardnvsi1");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Accept", "application/json");
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String output,access_token = null,org_id=null,id=null;
        while ((output = br.readLine()) != null) {
           // System.out.println(output);
            
            if(output.contains("access_token")) {
                access_token = output.substring(19, (output.length()-2));
                break;
            }
        }
       // System.out.println("Access_token: "+access_token);
        
        ////////////////////////////////////////////////////////////
        
        url = new URL("https://anypoint.mulesoft.com/accounts/api/me");
        HttpURLConnection conn1 = (HttpURLConnection) url.openConnection();
        conn1.setRequestMethod("GET");
        conn1.setRequestProperty("Accept", "application/json");
        conn1.setRequestProperty("Authorization", "Bearer "+access_token);
        BufferedReader br1 = new BufferedReader(new InputStreamReader((conn1.getInputStream())));
        StringBuffer sb= new StringBuffer();
        while ((output = br1.readLine()) != null) {
        	if(output.contains("organizationId")) {
                org_id = output.substring(23, (output.length()-2));
                break;
            }
        }
        
        ///////////////////////////////////////////////////////////////////////
        
        url = new URL("https://anypoint.mulesoft.com/accounts/api/organizations/"+org_id+"/environments");
        HttpURLConnection conn2 = (HttpURLConnection) url.openConnection();
        conn2.setRequestMethod("GET");
        conn2.setRequestProperty("Accept", "application/json");
        conn2.setRequestProperty("Authorization", "Bearer "+access_token);
        BufferedReader br2 = new BufferedReader(new InputStreamReader((conn2.getInputStream())));
        while ((output = br2.readLine()) != null) {
        	if(output.contains("id")) {
        		id = output.substring(13, (output.length()-2));
        		//break;
        	}
        }
        
        /////////////////////////////////////////////////////////////////////////
        
        url = new URL("https://anypoint.mulesoft.com/cloudhub/api/v2/applications");
        HttpURLConnection conn3 = (HttpURLConnection) url.openConnection();
        conn3.setRequestMethod("GET");
        conn3.setRequestProperty("Accept", "application/json");
        conn3.setRequestProperty("Authorization", "Bearer "+access_token);
        conn3.setRequestProperty("X-ANYPNT-ENV-ID", id);
        BufferedReader br3 = new BufferedReader(new InputStreamReader((conn3.getInputStream())));
        
        while ((output = br3.readLine()) != null) {
             sb.append(System.getProperty("line.separator"));
             sb.append(output);
        }
        String sb1 =sb.toString(); 
		 if(sb1.charAt(2)=='[') 
			 return sb1.substring(3, sb.length()-1);
		 
        return sb.toString();
	}
	/*
	 * public String authenticate(String userName, String password) throws
	 * IOException { URL url = new
	 * URL("https://anypoint.mulesoft.com/accounts/login?username="+userName+
	 * "&password="+password); HttpURLConnection conn = (HttpURLConnection)
	 * url.openConnection(); conn.setRequestMethod("POST");
	 * //System.out.println(url); if(conn.getResponseCode()==200) {
	 * this.username=userName; this.password=password; return
	 * "Authentication sucessful!"; } else return
	 * "Authentication Failed ! Please enter valid credentials";
	 * 
	 * }
	 */
}



