package paassss;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
//import auth();

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



public class New333Test {
  //@Test
  public void f1111Test() {
	  given().auth().none().when().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	  
  }
  
  //@Test
  public void f111Test() {
	  given().auth().none().when().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	  
  }
  
  
  @Test
  public void f1Test() {
	  given().auth().none().when().get("https://reqres.in/api/users?delay=3").then().statusCode(200).body("data[0].id", equalTo(1));
	  
  }
}
