package zama.spring.boot;

import java.util.Date;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	private static Logger logger = LoggerFactory.getLogger(Application.class);
	private static String VERSION = "1.0";
	
	@RequestMapping("/")
    public String home() {
    	JSONObject response = new JSONObject();
    	response.put("req-time", new Date());
    	response.put("route", "/");
    	logger.info("Processing request for : / , Sending response back to client: ", response.toString());
    	return response.toString();
    }
	
    @RequestMapping("/version")
    public String version() {
    	JSONObject response = new JSONObject();
    	response.put("req-time", new Date());
    	response.put("version", VERSION);
    	logger.info("Processing request for : / , Sending response back to client: ", response.toString());
    	return response.toString();
    }
    
    @RequestMapping("/event")
    public String event() throws JSONException {
    	JSONObject response = new JSONObject();
    	response.put("route", "/event");
    	response.put("event", "request");
    	response.put("req-time", new Date());
    	logger.info("Processing request for : /event , Sending response back to client: ", response.toString());
        return response.toString();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
