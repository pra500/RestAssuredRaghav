package d222;

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

public class NewgeteeeeTest {
  @Test
  public void GTest() {
	  
	  given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
	  
  }
}
