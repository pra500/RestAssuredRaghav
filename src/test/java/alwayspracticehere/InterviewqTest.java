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



public class InterviewqTest {
  @Test
  public void fTest() {
	  
	  given().when().get("https://reqres.in/api/users?id=7").then().assertThat().statusCode(200).body("data.first_name", equalTo("Michael"));
	 
	  
  }
}
