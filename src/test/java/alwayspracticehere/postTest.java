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

import java.util.ArrayList;


public class postTest {
	
	
	
	
  @Test
  public void fTest() {
	
	  
	  
	  given().header("Content-Type", "application/json").header("connection", "keep-alive").when().get("https://reqres.in/api/users/2").then().statusCode(200);
  }
}
