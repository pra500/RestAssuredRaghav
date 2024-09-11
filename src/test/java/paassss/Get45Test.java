package paassss;


import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
//import auth();

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



import org.testng.annotations.Test;

public class Get45Test {
  @Test
  public void fTest() {
	  
	  given().when().get("https://reqres.in/api/unknown/2").then().statusCode(200).log().all();
  }
  
  @Test
  public void feTest() {
	  
	

	  given().when().get("https://gorest.co.in/public/v2/users/7396319").then().statusCode(200).log().all();
  }
  @Test
  public void feeTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users/7396320").then().statusCode(200).log().all();
	  
	  
	  
	  
  }
}
