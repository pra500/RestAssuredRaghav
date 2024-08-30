package alwayspracticehere;

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



public class putTest {
  @Test
  public void fTest() {
	  
	  //update:
	  
	 //https://reqres.in/api/users/2
	    
	  /*
	  {
		    "name": "morpheus",
		    "job": "zion resident"
		}
		*/
	  
	  
  
	  JSONObject jo=new JSONObject();
	  jo.put("name", "morpheus444");
	  jo.put("job", "zion resident");
	  
	  
	  given().body(jo.toString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
	  
	  
	  //delete:
	  //https://reqres.in/api/users/2
	  
  }
}
