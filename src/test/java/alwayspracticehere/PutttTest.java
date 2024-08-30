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

public class PutttTest {
	
	
  @Test
  public void fTest() {
	  
	  
	  JSONObject jo=new JSONObject();
	  
	  jo.put("name", "c");
	  //jo.put("id", 10);
	  
	 // g
	  
	  
  }
  
  
}
