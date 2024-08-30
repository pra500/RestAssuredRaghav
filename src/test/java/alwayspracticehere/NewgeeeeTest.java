package alwayspracticehere;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class NewgeeeeTest {
  //@Test
  public void fTest() {
	  

	 
		  
		  given().when().get("https://reqres.in/api/users?id=5").then().assertThat().statusCode(200);
		  
		  
	  }
  
  
  
  @Test
  public void fgTest() {
	  

	 
		  
		  given().when().get("https://api.thecatapi.com/v1/").then().assertThat().statusCode(200);
		  
		  
	  }
  @Test
  public void feeeTest() {
	  

	 
		  
		  given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(200)
		  .body("[0].id", equalTo(1));
		  
		  
	  }
  
  
  @Test
  public void feeerTest() {
	  

	 
		  
		  given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(200)
		  .body("[2].title", equalTo("ea molestias quasi exercitationem repellat qui ipsa sit aut"));
		  
		  
	  }
		  
		  
  
}
