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

import org.testng.annotations.Test;



public class NewddddTest {
  @Test
  public void getTest() {
	  given().when().get("https://gorest.co.in/public/v2/users?email=iyer_gorakhnath@pfannerstill.test").then().statusCode(200);
	  
  }
}
