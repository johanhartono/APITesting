
package RestAssured;

import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Test;

public class apiGET
{
	String url1 = "https://reqres.in/api/users";
	String url2 = "https://airportgap.com/api/airports";

	@Test
	public void getListOfData() {
		String EndPoint = url1;
		var response = given().when().get(EndPoint).then().assertThat().statusCode(200);
		response.log().all();
	}
	
	@Test	
	public void getaData() {
		String EndPoint = url1 +"/2";
		var response = given().when().get(EndPoint).then().assertThat().statusCode(200);
		response.log().all();
	}

	
	@Test
	public void getQueryaData() {
		String EndPoint = url1;
		var response = given().queryParam("id",3).when().get(EndPoint).then().assertThat().statusCode(200);
		//var response = given().when().get(EndPoint).then();
		
		response.log().all();
	}
}
