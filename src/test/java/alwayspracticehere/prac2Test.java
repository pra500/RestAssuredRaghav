package alwayspracticehere;

import org.testng.annotations.Test;


import org.hamcrest.core.IsNull;
import org.json.simple.JSONObject;
import org.testng.Assert;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;





public class prac2Test {
	
	
  @Test
  public void getTest() {
	  
	  given().when().get("https://reqres.in/api/users/2").then().statusCode(200).body("data.id", greaterThan(1)).log().all();
	  
  }
  
  
  
  @Test
  public void get1est() {
	  
	  
	  given().when().get("https://reqres.in/api/users/2").then().statusCode(200).body("data.last_name", equalTo("Weaver")).log().all();
	  
  }
  
  //need to chk below
  
  @Test
  public void postTest() {
	  
	  JSONObject jo=new JSONObject();
	  jo.put("id", 30);
	  jo.put("email", "tom.herry@reqres.in");
	  jo.put("first_name", "Tom");	  
	  jo.put("last_name", "Herry");	  
	  jo.put("avatar", "https://reqres.in/img/faces/8-image.jpg");
	  
	  given().when().post("https://reqres.in/api/users").then().assertThat().statusCode(201);      
	  
  }
  
  
}
