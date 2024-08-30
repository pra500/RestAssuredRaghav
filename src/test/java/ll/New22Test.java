package ll;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
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




public class New22Test {
  @Test
  public void fTest() {
	  
	  
	  given().when().get("https://reqres.in/api/users?page=2").then().assertThat()
	  .statusCode(200);
	  
	  
	  
  }
  

}
