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

public class Getpost1 {
	
	
	
@Test
public void setTest()
{
	
given().when().get("https://gorest.co.in/public/v2/users/3339772/posts").then().statusCode(200);
		
		
		
}


@Test
public void setdTest()
{
	
given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body("data[2].id", equalTo(9));
		
		
		
}



@Test
public void setd4Test()
{
	
given().when().get("https://kennethreitz.org/music/as-above-so-below").then().assertThat().statusCode(200);
		
		
}

}