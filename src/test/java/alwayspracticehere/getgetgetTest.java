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





public class getgetgetTest {
  @Test
  public void fTest() {
	  
	  given().contentType("application/json").when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200);
  }
  
  
  
  //@Test
  public void ddfTest() {

	  
	 given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200);
		
	  
  }
}

