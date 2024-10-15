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

import java.util.ArrayList;






public class allrequestTest {
	
  @Test
  public void fTest() {
	  //put
	  
	  
	  /*
	   * 
	   * 
	   * 
	   * {
    "name": "morpheus",
    "job": "zion resident"
}
	   */
	  
	  /*
	  List<Header> h = new ArrayList<Header>();
	  h.add(new Header("header1", "value1"));
	  h.add(new Header("header2", "value2"));
	  Response r = given()
	  .baseUri("https://www.tutorialspoint.com/")
	  .headers(h)
	  .get("/about/about_careers.htm");
	  */
	  
	  
	  /*
	  JSONObject jo=new JSONObject();
	  jo.put("name", "Tommmm");
	  jo.put("job", "Guppp1");
	  
	  given().contentType("application/json").body(jo.toString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
	 */
	  
	  
	  
	 
	  
	  
	  
	  //patch
	  
	  
	  /*
	  {
		    "name": "morpheus",
		    "job": "zion resident"
		}
	  */
	  
	  
	  /*
	  JSONObject jo1=new JSONObject();
	  jo1.put("name", "Tommmmdd");
	  jo1.put("job", "Guppp1dd");
	  
	  given().contentType("application/json").body(jo1.toString()).when().patch("https://reqres.in/api/users/2").then().statusCode(200).log().all();
	 */
	  
	  
	  
	  
	  
	  //delete
	  
	  given().contentType("application/json").when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
	  
	  
	  
  }
}
