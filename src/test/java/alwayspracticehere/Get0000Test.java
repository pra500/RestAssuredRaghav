package alwayspracticehere;

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




public class Get0000Test {	
	
	
  //@Test
  public void fTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users?id=6930048").then().assertThat().statusCode(200).body("name", equalTo("Rep. Bandhu Bharadwaj")).log().all();
	  
  }
  
  
  
	
  @Test
  public void fkTest() {
	  
	  given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).body("data.id", equalTo(2));
	  
  }
  
  
  
	
  @Test
  public void frTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users?id=6930048").then().assertThat().statusCode(200).body("name", equalTo("Rep. Bandhu Bharadwaj")).log().all();
	  
  }
  
  
}
