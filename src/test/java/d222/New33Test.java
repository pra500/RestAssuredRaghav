package d222;

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



public class New33Test {
  @Test
  public void fTest() {
	  
	  given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat()
	  .statusCode(200);
  } 
  
    
  
  @Test
  public void fhTest() {
	  given().when().get("https://jsonplaceholder.typicode.com/posts/1").then().assertThat()
	  .statusCode(200);
	  
	  }
}
