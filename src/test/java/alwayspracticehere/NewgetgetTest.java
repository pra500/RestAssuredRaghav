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



public class NewgetgetTest {
  @Test
  public void fTest() {
	  
	 given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body("data[0].email", equalTo("michael.lawson@reqres.in"));
	  
  }    
  
   
  @Test
  public void fiTest() {
	  

	  
	  given().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body("data[3].id", equalTo(10));
	  
	  given().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body("data[3].first_name", equalTo("Byron")) ;
		  
	  given().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body("data[3].last_name", equalTo("Fields"));
	  
  }
    
  
  @Test
  public void fiiTest() {
	  
	 given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body("data[0].email", equalTo("michael.lawson@reqres.in"));
	  
  }
    
  

  @Test
  public void fi9Test() {
	  
	 given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body("data[0].email", equalTo("michael.lawson@reqres.in"));
	  
  }
    
  

  @Test
  public void fi7Test() {
	  
	 given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).body("data.first_name", equalTo("Janet"));
	  
  }
    
  
  
  @Test
  public void fi8Test() {
	  
	 given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).body("data.last_name", equalTo("Weaver"));
	  
  }
    
  
  
    
  
  
}
