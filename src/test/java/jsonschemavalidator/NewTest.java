package jsonschemavalidator;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;



public class NewTest {
  @Test
  public void getTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users/").then().assertThat().
	 
	  
	  body(matchesJsonSchemaInClasspath("aa.json"))
	  
	  	  
	  .statusCode(200);
  }
}
