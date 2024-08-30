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




public class NewcccTest {
  @Test
  public void fTest() {
	  
	  given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	 
	  
	  given().when().get("https://gorest.co.in/public/v2/todos?title=Aut succurro cohibeo vis consuasor temeritas damnatio.").then().statusCode(200).and()
	  .and().body("[0].id", equalTo(59707));
	  
	  given().when().get("https://reqres.in/api/users/").then().statusCode(200);
	 
	  
  }
}
