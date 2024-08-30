package lo;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class getTest {
  @Test
  public void fTest() {
	  
	  given().when().get("https://reqres.in/api/users/3").then().assertThat().statusCode(200);
			 
  }
}
