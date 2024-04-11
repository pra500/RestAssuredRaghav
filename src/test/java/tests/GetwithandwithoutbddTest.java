package tests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;







//for assertions we need hamcrest dependency
//plz refer: https://qaautomation.expert/2023/10/15/assertion-of-json-in-rest-assured-using-hamcrest/



public class GetwithandwithoutbddTest {
	
	
	
  //get 
	
  @Test
  public void oneTest() {
	  
	 //Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	  
	  //now u can do like that, add static and * - import static io.restassured.RestAssured.*
	 Response res=get("https://reqres.in/api/users?page=2");
	 
System.out.println(res.getStatusCode());
System.out.println(res.getTime());
System.out.println(res.getSessionId());
System.out.println(res.getHeaders());


	 
	 int code=res.getStatusCode();
	 Assert.assertEquals(code,  200);
	 
	 
	 
	 //just for practice:	 
	 
	 String s=res.getSessionId();
	 Assert.assertEquals(s, null);	 
	
	 String c=res.getContentType();
	 Assert.assertEquals(c, "application/json; charset=utf-8");
	  
	 	 
	  
  }
  
  
  //bdd pattern:
  @Test
  public void one11() {
	  
	 
	  given().get("https://reqres.in/api/users/2").then().statusCode(200).body("data[5].first_name", equalTo("Rachel"));
	 //given().get("https://reqres.in/api/users/2").then().statusCode(200).body("data.first_name", hasItems("George, Rachel"));
	  
	  

}
  
  
 
  
  
  //post call
  @Test
  public void secTest() {
	  
	  
	JSONObject jo=new JSONObject();
	jo.put("tom", "qa");
	jo.put("tom1", "dev");
		
			
	given().body(jo.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	

	
		  
	  
  }
}
