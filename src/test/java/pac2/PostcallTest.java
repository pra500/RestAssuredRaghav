package pac2;

import static io.restassured.RestAssured.get;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PostcallTest {
	
	
	
	
  @Test
  public void mypostreqTest() {
	 
		
		  JSONObject jo=new JSONObject ();
		  
		  jo.put("id", "20"); jo.put("email	", "Raj45@gmail.com");
		  jo.put("first_name", "Raj"); jo.put("last_name", "Singh"); jo.put("avatar",
		  "https://reqres.in/img/faces/34-image.jpg");
		  
		  
		 
	  
	  
	 RestAssured.baseURI ="https://reqres.in/api"; 
	    RequestSpecification request = RestAssured.given(); 
	  
	    request.body(jo.toString());
	    Response response = request.put("/users"); 
	    ResponseBody body = response.getBody();
	    
	    
	    
	    
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	     
	 
	  
  }
  
  
  
  
  
}
