package com.invenio.util.controller;
import java.io.File;
import java.io.IOException;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.History;
import org.alicebot.ab.MagicBooleans;
import org.alicebot.ab.MagicStrings;
import org.alicebot.ab.utils.IOUtils;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.invenio.util.chatbot.CloudHubObjectGenerator;

@RestController
public class ChatBot {
    private static final boolean TRACE_MODE = false;
    static String botName = "super";
    private Chat chatSession= null;
 @RequestMapping(method=RequestMethod.POST,value="/chatRobot")
    public String getRobot(@RequestBody String textLine) {
        String response = "";
    	try {
                if ((textLine == null) || (textLine.length() < 1))
                    textLine = MagicStrings.null_input;
                if (textLine.equals("q")) {
                    System.exit(0);
                } else if (textLine.equals("wq")) {
                    chatSession.bot.writeQuit();
                    System.exit(0);
                } else {
                    String request = textLine;
                    if (MagicBooleans.trace_mode)
                        System.out.println("STATE=" + request + ":THAT=" + ((History) chatSession.thatHistory.get(0)).get(0) + ":TOPIC=" + chatSession.predicates.get("topic"));
                     response = chatSession.multisentenceRespond(request);
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
// @RequestMapping(method=RequestMethod.GET,value="/getRobot")
 public void getRob() {
	 String resourcesPath = getResourcesPath();
     // System.out.println(resourcesPath);
      MagicBooleans.trace_mode = TRACE_MODE;
      Bot bot = new Bot("super", resourcesPath);
      Chat chatSession = new Chat(bot);
      bot.brain.nodeStats();
	 this.chatSession = chatSession;
 }
     
    
    
    
	/*
	 * @RequestMapping(method=RequestMethod.POST,value="/login") public String
	 * login(@RequestBody String loginCredential ) throws IOException {
	 * CloudHubObjectGenerator ob = new CloudHubObjectGenerator(); String[]
	 * credential = loginCredential.split(" "); return
	 * ob.authenticate(credential[0], credential[1]); }
	 */
}