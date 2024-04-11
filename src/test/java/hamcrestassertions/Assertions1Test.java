package hamcrestassertions;


import org.hamcrest.core.IsNull;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class Assertions1Test {
	
	
	@Test
	public void gTest()
	{
		
given().when().get("https://reqres.in/api/users/2").then().statusCode(200).body("data.email", equalTo("janet.weaver@reqres.in"));
			
	
		
		
	}
	

}
