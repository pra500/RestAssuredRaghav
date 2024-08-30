package paassss;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import auth();

import org.hamcrest.core.IsNull;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class GettttttTest {
	
//	
//	{
//	    "email": "eve.holt@reqres.in",
//	    "password": "pistol"
//	}
	
	
  @Test
  public void fTest() {
	  
	given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200);
	  
	  
	  
  }
}
