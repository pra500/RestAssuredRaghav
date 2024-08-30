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

public class pathparaqueryparaTest {
	
	
  @Test
  public void fTest() {
	  given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).log().all();
	  
  }
  
  @Test
  public void fjkTest() {
	  given().when().get("https://reqres.in/api/users/").then().assertThat().statusCode(200).body("data[0].email", equalTo("george.bluth@reqres.in"));
	  
  }    
  
  
  
  @Test
  public void fjkhTest() {
	  given().when().get("https://reqres.in/api/users?id=4").then().assertThat().statusCode(200).body("data.last_name", equalTo("Holt"));
	  
  }
  
  
 
}
