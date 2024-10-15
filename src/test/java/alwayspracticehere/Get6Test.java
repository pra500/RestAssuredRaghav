package alwayspracticehere;.

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

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


//import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Get6Test {
  @Test
  public void fTest() {
	  
	  
	 //given().when().get("https://reqres.in/api/users/9").then().assertThat().statusCode(200).body("data[2].name", equalTo("Tobias")).log().all();
	 
	  
	  //given().when().get("https://reqres.in/api/users/2").then().statusCode(334);
	  
	  
	  
	  
	  
	 // https://fake-json-api.mock.beeceptor.com/users/1?name=Oswaldo Huels  	  
	  //given().auth().none().queryParam("name", "Oswaldo Huels").when().get("https://fake-json-api.mock.beeceptor.com/users/1")
	 // .then().statusCode(200);
	  
	  
	  
	  
	  //https://fake-json-api.mock.beeceptor.com/users/1?company=Lilyan
	  
	  given().auth().none().queryParam("company", "Lilyan").when().get(" //https://fake-json-api.mock.beeceptor.com/users/1").then().statusCode(200);
	  
  
  }
}
