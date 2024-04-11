package alwayspracticehere;


import org.hamcrest.core.IsNull;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class NewkTest {
	
		
	
  @Test
  public void fTest() {
	  
	  given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body("data[1].first_name", equalTo("Lindsay"));
	  
  }
  
  
	
  @Test
  public void flTest() {
	  
	  given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body("data[1].first_name", equalTo("Lindsaiy"));
  }
  
	
  @Test
  public void fllTest() {
	  
	  
	  
	  given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body("data[1].id", equalTo(8));
  }
}



