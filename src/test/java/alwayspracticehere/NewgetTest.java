package alwayspracticehere;

import org.testng.annotations.Test;


//import org.testng.annotations.Test;

import org.hamcrest.core.IsNull;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;


import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class NewgetTest {
	
	
  @Test
  public void fTest() {
	  
	  given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).and().body("data[1].id", equalTo(8));
	  
	  
  }
  
  
  

  @Test
  public void feeTest() {
	  
	  //https://reqres.in/api/unknown/1
	  given().auth().none().header("Content-Type", "application/type").when().get("https://reqres.in/api/unknown/1").then().assertThat()
	  .statusCode(200);
	  
	  
	  
  }
  
  
}
