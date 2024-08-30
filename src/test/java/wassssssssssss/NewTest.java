package wassssssssssss;

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

public class NewTest {
	
	
	
  @Test
  public void getTest() {
	 //https://gorest.co.in/public/v2/users?id=7029964
	  
	  given().when().get("https://gorest.co.in/public/v2/users?id=7029964").then().statusCode(200);
  }
  
	
  @Test
  public void getiTest() {
	 //https://gorest.co.in/public/v2/users?id=7029964
	  
	 //given().when().get("https://gorest.co.in/public/v2/users?name=Dwaipayan%20Panicker").then().statusCode(200);
	  
	  given().when().get("https://gorest.co.in/public/v2/users?email=dc_desai_tarun@larkin-abbott.example").then().statusCode(200);

	  
	  
  }
}
