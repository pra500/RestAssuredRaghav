package alwayspracticehere;



import org.testng.annotations.Test;



import org.json.JSONObject;
import org.testng.annotations.Test;
import java.util.*;
import org.hamcrest.core.IsNull;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;




public class ttTest {
  @Test
  public void fTest() {
	  
	  
	  given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
	  
  }
  
  @Test
  public void fiTest() {
	  
	  
	  given().when().get("https://reqres.in/api/users?page=3").then().statusCode(200).log().all();
	  
  }
  
  @Test
  public void fiiTest() {
	  
	  
	  given().when().get("https://reqres.in/api/users?page=4").then().statusCode(200).log().all();
	  
  }
  
  @Test
  public void fiiiTest() {
	  
	  
	  given().when().get("https://reqres.in/api/users?page=5").then().statusCode(200).log().all();
	  
  }
}
