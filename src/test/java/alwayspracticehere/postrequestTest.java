package alwayspracticehere;

import org.hamcrest.core.IsNull;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;





public class postrequestTest {
	
	

	@Test
	public void getTest() {
		
given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).body("data.first_name", equalTo("Janet"));

	
	
	}
	
	
//ll chk later below:
	@Test
	public void postTest() {
			
		
		JSONObject jo=new JSONObject();
		jo.put("id", 33);
		jo.put("email", "janet.weavelr@reqres.in");
		jo.put("id", "Janetl");		
		jo.put("id", "Weaverl");
		jo.put("id", "https://reqres.in/img/faces/33-image.jpg");
		
		
		
		given().body(jo.toString()).when().post("https://reqres.in/").then().statusCode(201);
		
		
		
	}



}
