package com.invenio.util.controller;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.History;
import org.alicebot.ab.MagicBooleans;
import org.alicebot.ab.MagicStrings;
import org.alicebot.ab.utils.IOUtils;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.invenio.util.chatbot.CloudHubObjectGenerator;
@CrossOrigin(origins = "http://localhost:4202")
@RestController
public class ChatBot {
    private static final boolean TRACE_MODE = false;
    static String botName = "super";
    static HashMap<String,Chat> BotMapping = new HashMap<>();
    static HashMap<String,String> CloudMapping = new HashMap<>();
    int count1=0,count2=0;
   @Value("${app.url}")
   String url;
    @RequestMapping(method=RequestMethod.POST,value="/chatRobot")
    public String getRobot(@RequestBody String textLine) {
        String response = "";
        String userId = textLine.substring(textLine.lastIndexOf("@")+1,textLine.length());
        textLine=textLine.substring(0,textLine.lastIndexOf("@"));
        System.out.println(userId);
        System.out.println(textLine);
        System.out.println(BotMapping.get(userId));
    	try {
                if ((textLine == null) || (textLine.length() < 1))
                    textLine = MagicStrings.null_input;
                if (textLine.equals("q")) {
                    System.exit(0);
                } else if (textLine.equals("wq")) {
                	BotMapping.get(userId).bot.writeQuit();
                    System.exit(0);
                } else {
                    String request = textLine;
                    if (MagicBooleans.trace_mode)
                        System.out.println("STATE=" + request + ":THAT=" + ((History) BotMapping.get(userId).thatHistory.get(0)).get(0) + ":TOPIC=" + BotMapping.get(userId).predicates.get("topic"));
                     response = BotMapping.get(userId).multisentenceRespond(request);
                    while (response.contains("&lt;"))
                        response = response.replace("&lt;", "<");
                    while (response.contains("&gt;"))
                        response = response.replace("&gt;", ">");
                   // System.out.println("iGenie : " + response);
                    
                }
           // }
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return response;
    	
    }

    private static String getResourcesPath() {
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path = path.substring(0, path.length() - 2);
        System.out.println(path);
        String resourcesPath = path + File.separator + "src" + File.separator + "main" + File.separator + "resources";
        return resourcesPath;
    }
 @GetMapping("/getRobot")
 public String getRob() {
	 String resourcesPath = getResourcesPath();
     // System.out.println(resourcesPath);
	 String userId=Integer.toString(count1++);
      MagicBooleans.trace_mode = TRACE_MODE;
      Bot bot = new Bot("super", resourcesPath);
      Chat chatSession = new Chat(bot);
      bot.brain.nodeStats();
      BotMapping.put(userId, chatSession);
    //  chatSession.userId=userId;
	// this.chatSession = chatSession;
	 CloudHubObjectGenerator.url1=url;
	 return userId;
	 
 }
    
  @RequestMapping(method=RequestMethod.POST,value="/exit")
  public void exitRobot(@RequestBody String UserId) {
    	BotMapping.remove(UserId);
    	if(CloudMapping.containsKey(UserId))
    		CloudMapping.remove(UserId);		
 	 	 
  }
	
	  @RequestMapping(method=RequestMethod.POST,value="/login")
	  public String login(@RequestBody String loginCredential) throws IOException {
	  CloudHubObjectGenerator ob = new CloudHubObjectGenerator(); 
	  String[] credential = loginCredential.split(" ");
	  System.out.println(credential[0] + "\n" +credential[1] +"\n"+credential[2] );
	  if((ob.login(credential[0], credential[1],credential[2])).equalsIgnoreCase("Authentication sucessful"))
	  {
		  CloudMapping.put(credential[2], credential[0]);
		  BotMapping.get(credential[2]).userId=credential[2];
		  return "Authentication sucessful";
	  }
	  return "Authentication Failed";
	 
}
}