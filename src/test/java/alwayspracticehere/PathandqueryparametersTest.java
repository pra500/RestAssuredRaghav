package alwayspracticehere;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

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

public class PathandqueryparametersTest {
	
  @Test
  public void hTest() {
	  
	  given().auth().none().queryParam("company", "Lilyan").when().get(" //https://fake-json-api.mock.beeceptor.com/users/1").then().statusCode(200);

  }
}
