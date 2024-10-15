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







public class Gettt33est {
	
	
	
	
	
  @Test
  public void fTest() {
	  
	  given().auth().none().when().get("https://dummy-json.mock.beeceptor.com/continents").then().and()
	  .statusCode(200);
	  
  }
  
  
  @Test
  public void fcfTest() {
	  
	  given().auth().none().when().get("https://dummy-json.mock.beeceptor.com/continents").then().and()
	  .statusCode(200);
	  
  }
  
  
  @Test
  public void ffffffTest() {
	  
	  given().auth().none().when().get("https://dummy-json.mock.beeceptor.com/continents").then().and()
	  .statusCode(200);
	  
  }
  
}
