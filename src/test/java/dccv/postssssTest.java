package dccv;


import org.hamcrest.core.IsNull;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;




public class postssssTest {
  @Test
  public void fTest() {
	  
//	  
//	  {
//		    "name": "morpheus",
//		    "job": "leader"
//		}
	  
	  JSONObject jo=new JSONObject();
	  jo.put("name", "Tom111");
	  jo.put("job", "Dev1");
	  
	

	 
	  given().body(jo.toString()).
	  
	  when().post("https://reqres.in/api/users").then().assertThat().statusCode(201).log().all();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
