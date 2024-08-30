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




public class GETrrrrTest {
	
	
  @Test
  public void fTest() {
	  
	  given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).body("data.id", equalTo(2));
	  
	 //given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).body("data.first_name[0]", equalTo("2"));
	  
	  
	  
	  //will chk later
	 JSONObject jo=new JSONObject();
	 jo.put("id", "21");
	 jo.put("email", "janet11.weaver@reqres.in");	 
	 jo.put("first_name", "Janet11");	 
	 jo.put("last_name", "Weaver11");	 
	 jo.put("avatar", "https://reqres.in/img/faces/3-image.jpg");
	 
	 
	 
	 
	 
	  
	  
	  
  }
  
  
  
  
	
  @Test
  public void fjTest() {
	  
//	  
//	  
//	  {
//		    "name": "morpheus",
//		    "job": "leader"
//		}
	  

	 
	 
	  
	  
	  
  }
}
