package d222;

import org.testng.annotations.Test;

import org.testng.annotations.Test;

import org.hamcrest.core.IsNull;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;



public class TTest {
	
	
  @Test
  public void getTest() {
	  
//	  
//	  {
//		    "name": "morpheus",
//		    "job": "leader"
//		}
//	  
	  JSONObject jo=new JSONObject();
	  jo.put("name", "josh");	  
	  jo.put("job", "sdet2");
	  
	  given().body(jo.toString()).auth().none().when().post("https://reqres.in/api/users").then().assertThat().statusCode(201);
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
