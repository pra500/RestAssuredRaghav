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


public class NewGETTTTTTest {
  @Test
  public void fTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users/7051190").then().statusCode(200);
  }
}
