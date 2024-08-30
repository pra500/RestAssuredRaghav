package alwayspracticehere;

import org.testng.annotations.Test;
import org.hamcrest.core.IsNull;
import org.json.JSONObject;
//import org.json.simple.JSONObject;
import org.testng.Assert;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;


/*
 
//naveen:  https://naveenautomationlabs.com/http-post-method-using-restassured/
  
 
{
"name":"Test Automation",
"gender":"Male",
"email":"testAutomation6@gmail.com",
"status":"Active"
}

//https://gorest.co.in/public-api/users
 

*/



public class PosttttTest {
		
	
	
  @Test
  public void fTest() {
	  
	  
	  //while making - 200 status code needs to be given and no assertion should be used
	
	  
	  /*
	  JSONObject jo=new JSONObject();
	  
	  jo.put("name", "Java material");
	  jo.put("gender", "Male");
	  jo.put("email", "java_mat45@hotmail.com");
	  jo.put("status", "Active");
	  
	  
	  given().body(jo.toString()).when().post("https://gorest.co.in/public-api/users").then().assertThat().statusCode(200);
	  
	 */
	  
	  	   
  }
}
