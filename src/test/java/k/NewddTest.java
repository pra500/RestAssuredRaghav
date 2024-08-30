package k;

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

import java.util.HashMap;
import java.util.Map;



public class NewddTest {
  @Test
  public void fTest() {
	  
	 
	  
	  given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body("data[0].id", lessThan(13));;
  
	  
  }
}
