package alwayspracticehere;

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

import org.testng.annotations.Test;


/*
 
 
 
 
[
 {
   "id": 7336687,
   "name": "Ekaling Sethi",
   "email": "sethi_ekaling@bartoletti-vonrueden.test",
   "gender": "female",
   "status": "inactive"
 }
]



*/




public class NewccTest {
  @Test
  public void getTest() {
	  
	  given().header("Content-Type", "application/json").when().get("https://gorest.co.in/public/v2/users?id=7336687").then().assertThat().statusCode(200).
	  body("[0].name", equalTo("Ekaling Sethi")).and().body("[0].email", equalTo("sethi_ekaling@bartoletti-vonrueden.test")).and().body("[0].id", equalTo(7336687)).log().all();  
  }
  
  
  
  
}
