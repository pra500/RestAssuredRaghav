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

public class NewTest {
	
	
	
	
	
	
	
  @Test
  public void fTest() {
	  
	  
	  
	  given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200);
	  
	  
  }
  
  
	
  @Test
  public void fkTest() {
	  
	  
	  
	  given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).body("data.id", equalTo(2));
	  
	  
  }
}
