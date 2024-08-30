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


public class NewhTest {
	

  @Test(priority = 0)
  public void fTest() {
	  
	  given().when().get("https://restful-booker.herokuapp.com/booking/1").then().statusCode(200);
	  
  }
  
  @Test(priority = 1)
  public void fiTest() {
	  
	  given().when().get("https://restful-booker.herokuapp.com/booking/1").then().statusCode(200).log().all();
	  
	  
	  
  }
  
  @Test(priority = 2)
  public void fiiTest() {
	  
	  given().when().get("https://restful-booker.herokuapp.com/booking/1").then().statusCode(200).log().all();  
  }
  
  
  //need to chk below
  @Test(priority = 3)
  public void fioTest() {
	  
	  given().when().get("https://restful-booker.herokuapp.com/booking/").then().assertThat().statusCode(200).body("bookingid", equalTo(1087));
	  
	  
	  
  }
  
}
