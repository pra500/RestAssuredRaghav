package alwayspracticehere;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;




public class Get66Test {
  @Test
  public void fTest() {
	  
	  //https://reqres.in/api/users?page=2
	  
	  //String endpoint = "//https://reqres.in/api/";
	  
	
	  
	  //given().queryParam("page", "2").when().get(endpoint + "users").then().statusCode(200);
	  
	  	  given().queryParam("page", "2").when().get("//https://reqres.in/api/users").then().statusCode(200);
	  	given().pathParam("page", "2").when().get(endpoint + "users").then().statusCode(200);
	  
	  
  }
}
