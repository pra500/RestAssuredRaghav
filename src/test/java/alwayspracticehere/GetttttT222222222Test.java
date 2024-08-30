package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


//import org.testng.annotations.Test;

import org.hamcrest.core.IsNull;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class GetttttT222222222Test {
  @Test
  public void fTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users?id=7117827");
  }
  
  
  @Test
  public void flTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users?id=7117827");
  }

  
  @Test
  public void fll0Test() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users?id=7117827");
  }
  
  	
  @Test
  public void fllTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users?name=Laxmi%20Naik").then().assertThat().statusCode(200);
  }
  
  @Test
  public void flljjTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users?email=laxmi_naik@bogisich-koepp.test").then().assertThat().statusCode(200);
  }
  
  @Test
  public void fl000Test() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users?id=7117827");
  }

  
  
  @Test
  public void flkTest() {
	  
	  given().when().get("https://gorest.co.in/public/v2/users?id=7117827");
  }

  
  
  @Test
  public void fl8800Test() {
	  
	  given().when().get("https://gorest.co.in/public/v2/posts?user_id=7343387");
  }

  

}


