package dccv;

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

public class Getttt11 {
	
	@Test
	  public void getiTest() {
	
	given().when().get("https://pokeapi.co/api/v2/pokemon/ditto").then().assertThat().statusCode(200);
	
	
	}

}
