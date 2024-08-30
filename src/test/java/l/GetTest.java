package l;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetTest {
  @Test
  public void fTest() {
	  
	  
	  given().when().get("https://jsonplaceholder.typicode.com/posts/1").then().assertThat()
	  .statusCode(200);
	  
	  
	  
	  given().when().get("https://jsonplaceholder.typicode.com/posts/2").then().assertThat()
	  .statusCode(200);
	  
	  
	  
	  
	  given().when().get("https://jsonplaceholder.typicode.com/posts/3").then().assertThat()
	  .statusCode(200);
	  
	  
	  
	
  }
  
  
}
