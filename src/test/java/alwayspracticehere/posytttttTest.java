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

public class posytttttTest {
  @Test
  public void fTest() {
	  
	  
	 
	  
	  /*{
		    "name": "morpheus",
		    "job": "leader"
		}*/
	  
	  
	  JSONObject jo=new JSONObject();
	  jo.put("name", "morpheus10");
	  jo.put("job", "leader10");
	  
	  
	  given().body(jo.toString()).when().post("https://reqres.in/api/users").then().assertThat().statusCode(201);
	  
	  
  }
}
