package alwayspracticehere;

import org.testng.annotations.Test;




//import org.testng.annotations.Test;

import org.hamcrest.core.IsNull;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;



public class NewdddTest {
  @Test
  public void fTest() {
	  
	  given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).and().body("data[1].id", equalTo(8));
	  
  }
  
  @Test
  public void f1Test() {
	  
	  given().when().get("https://reqres.in/api/users/8").then().assertThat().statusCode(200).log().all();
	  
  }
  
  @Test
  public void f2Test() {
	  
	  given().when().get("https://reqres.in/api/users/7").then().assertThat().statusCode(200).log().all();
	  
  }
}
