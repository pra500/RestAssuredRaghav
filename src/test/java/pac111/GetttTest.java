package pac111;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class GetttTest {
	@Test
  public void fTest() {
	  
	  given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200);
	  
	  
	  
  }

}
