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



public class geeeeeTest {
  @Test(enabled=false)
  public void getsssTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/posts?id=144637").then().statusCode(200);
  }
  
  @Test
  public void getssesTest() {
	  
	  //https://gorest.co.in/public/v2/posts?id=144637&user_id=7167451

	  
	  given().when().get("https://gorest.co.in/public/v2/posts?id=144637&user_id=7167451").then().statusCode(200);
  }
  
  @Test(enabled=false)
  public void getssecsTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/posts?id=144637").then().statusCode(200);
  }
  
  
  @Test(enabled=true)
  public void getssecs2Test() {
	  
	  given().when().get("https://reqres.in/api/unknown/2").then().statusCode(200);
  }
}
