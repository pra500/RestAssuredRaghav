package alwayspracticehere;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
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




public class NejjjkkTest {
	
	
  @Test
  public void fTest() {
	  
	  //given().when().get("https://restful-booker.herokuapp.com/booking").then().assertThat().statusCode(200);
	  
	  
	  given().when().get("https://restful-booker.herokuapp.com/booking?bookingid=895").then().assertThat().statusCode(200);
	  
  }
  
  
  @Test
  public void eTest() {
	  
	  given().header("Content-Type", "application/json").when().get("https://gorest.co.in/public/v2/users/").then().assertThat()
	  .statusCode(200).log().all();
  }
  
}
