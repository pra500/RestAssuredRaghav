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


public class GetllTest {
	
	
  @Test
  public void fTest() {
	  
	  
	  given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).log().all();
	  
	
	  
	  
  }
  
	
  @Test
  public void foTest() {
	  
	  
	  given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).body("data.id", equalTo(2)).
	  log().all();
	  
	
	  
	  
  }
  
  

  @Test
  public void fokTest() {
	  
	  
	  given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).body("data.id", equalTo(2)).
	  log().all();
	  
	
	  
	  
  }
  
  

  @Test
  public void fokjTest() {
	  
	  //need to chk below
	  given().when().get("https://reqres.in/api/users?id=8").then().assertThat().statusCode(200).body("data[0].email", equalTo("lindsay.ferguson@reqres.in")).
	  log().all();
	  
	
	  
	  given().when().get("https://reqres.in/api/users?id=8").then().assertThat().statusCode(200).body("data[0].id", equalTo(8)).
	  log().all();
	  
	  
  }
}
