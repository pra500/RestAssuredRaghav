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

import java.util.HashMap;
import java.util.Map;


public class AssertionpracagainTest {
	
	
	//https://qaautomation.expert/2023/10/15/assertion-of-json-in-rest-assured-using-hamcrest/
	
	
	//testng assertions:
	//int code=res.getStatusCode();
	//Assert.assertEquals(code, 200);
	
	
	//with the help of hamcrest, we use below assertions:
	//equalTo(), lessThan(), equalToIgnoringCase() and all below
	
	
	
	
	//equalto: we can use with both number and string
	
	
	
	

	
  @Test(priority = 0)
  public void getTest() {
	  
	 
	  /*
	  //__________Number related assertions________________
	  
	
	
	given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].id", equalTo(8));
	given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].id", lessThan(9));	
	
	given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].id", greaterThan(3));
	
	given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].id", greaterThanOrEqualTo(8));
	
	given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].id", lessThanOrEqualTo(8));
	  
	  
	  
	  
	  */
	
	  
	  
	  
	  //___________String related Assertions_____________
	
    //given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].first_name", equalTo("Lindsay"));
	
	//given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].first_name", equalToIgnoringCase("lindsay"));
	
	//given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].first_name", containsString("Lind"));
	
	
	//________________Not - with anything u can use it_________________________
	/*
	given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].first_name", not(equalTo("Ram")));
		
	given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].first_name", not(containsString("Prag")));
	
	  given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].id", not(equalTo(19)));
	  given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[1].id", not(lessThan(2)));  
	 */
	  
	  
	  //____________Multiple Assert Statements - with the help of and() we can do it____________
	    
	 
	  
	  
		given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).and().body("data[1].first_name", equalTo("Lindsay")).
	    and().body("data[1].last_name", equalTo("Ferguson")).and().body("data[1].id", equalTo(8));
	  
	  
	  
	  /*
	given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).and().body("data[1].first_name", equalTo("Lindsay")).
    and().body("data[1].last_name", equalTo("Ferguson")).and().body("data[1].id", equalTo(8));
	*/		
	
	
	
	
/*	  
given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().header("Transfer-Encoding", "chunked").and()	
.body("data[1].first_name", equalTo("Lindsay")).
and().body("data[1].last_name", equalTo("Ferguson")).and().body("data[1].id", equalTo(8));
*/			
	
	
	
	
	  
	 
	  
	  
  }
   
  
  
  
  
  
  

  
}
