package alwayspracticehere;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;




public class Get66Test {
  @Test
  public void firstTest() {
	  
	  //https://reqres.in/api/users?page=2
	  
	  //String endpoint = "//https://reqres.in/api/";
	  
	
	  
	  //given().queryParam("page", "2").when().get(endpoint + "users").then().statusCode(200);
	  
	  
	  	/*given().queryParam("page", "2").when().get("//https://reqres.in/api/users").then().statusCode(200);
	  	given().pathParam("page", "2").when().get(endpoint + "users").then().statusCode(200);*/
	  
	  
	  
	  given().when().get("https://reqres.in/api/users?page=3").then().statusCode(200);
	
	  
	  
	  
	  
	  
  }
  
  @Test
  public void secTest() {
	  
	  //https://reqres.in/api/users?page=2
	  
	  //String endpoint = "//https://reqres.in/api/";
	  
	
	  
	  //given().queryParam("page", "2").when().get(endpoint + "users").then().statusCode(200);
	  
	  
	  	/*given().queryParam("page", "2").when().get("//https://reqres.in/api/users").then().statusCode(200);
	  	given().pathParam("page", "2").when().get(endpoint + "users").then().statusCode(200);*/
	  
	  
	  
	  given().when().get("https://reqres.in/api/users?page=4").then().statusCode(200);
	
	  //need to chk below
	  
	 // given().when().get("https://dummy-json.mock.beeceptor.com/todos");
	 // https://dummy-json.mock.beeceptor.com/todos
	  
	  
	  
  } 
  
  @Test
  public void thiTest() {
	  
	  
	  
	  
	  
	  given().when().get("https://reqres.in/api/users?page=4").then().statusCode(200);
	
	  
	  
	  
	  
	  
  }
  @Test
  public void fouTest() {
	  
	  //https://reqres.in/api/users?page=2
	  
	  //String endpoint = "//https://reqres.in/api/";
	  
	
	  
	  //given().queryParam("page", "2").when().get(endpoint + "users").then().statusCode(200);
	  
	  
	  	/*given().queryParam("page", "2").when().get("//https://reqres.in/api/users").then().statusCode(200);
	  	given().pathParam("page", "2").when().get(endpoint + "users").then().statusCode(200);*/
	  
	  
	  
	  given().when().get("https://reqres.in/api/users?page=5").then().statusCode(200);
	
	  
	  
	  
	  
	  
  }
  
  @Test
  public void fivTest() {
	  
	  //https://reqres.in/api/users?page=2
	  
	  //String endpoint = "//https://reqres.in/api/";
	  
	
	  
	  //given().queryParam("page", "2").when().get(endpoint + "users").then().statusCode(200);
	  
	  
	  	/*given().queryParam("page", "2").when().get("//https://reqres.in/api/users").then().statusCode(200);
	  	given().pathParam("page", "2").when().get(endpoint + "users").then().statusCode(200);*/
	  
	  
	  
	  given().when().get("https://reqres.in/api/users?page=6").then().statusCode(200);
	
	  
	  
	  
	  
	  
  }
}
