package advanceconcepts;

import org.hamcrest.core.IsNull;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;




public class Oauth1and2Test {
	
	
	
	
  @Test
  public void fTest() {
	  
	  
	    String CONSUMER_KEY = "k0GDexaSGsJzIlQxEwGQAY7su";
		 String CONSUMER_SCERET = "XwfYlclCulFWEvCqczumUTUJYoqGaxKFp6sx7zYQLV8y4UFILJ";
		 String ACCESS_TOKEN = "917811410138152960-itj0vVAYwPNqtzIfjus9xEGdMZFofGh";
		 String ACCESS_SCERET = "xEFi7ADsxdmHi7tXhT8Bqxl3wOisJZJmFyEubpUcmsgjp";
		
	//oauth1.0:
		
	 // given().auth().oauth(consumerKey, consumerSecret, accessToken, tokenSecret).get("your end point URL")
	  given().auth().oauth(CONSUMER_KEY, CONSUMER_SCERET, ACCESS_TOKEN, ACCESS_SCERET).when().post("https://api.twitter.com/1.1/statuses/update.json?status=Maybe%20he%27ll%20finally%20find%20his%20keys.%20%23peterfalk");
	  
	  
	  
	  	  	
	  
	  
	  
	//oauth2.0:
	  
	  //given().auth().oauth2("").when().post("");
	  
	
	  
	  
  }
  
  
}
