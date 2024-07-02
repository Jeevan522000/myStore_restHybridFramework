package api.endPoints;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.payload.storePayload;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class storeRouteProperties {

	public static ResourceBundle getRouteURL()
	{
		ResourceBundle rb =ResourceBundle.getBundle("routes"); //load routes property file
		return rb;
	}

	public static Response createOrder(storePayload spayLoad)
	{	
		//read data from routes.properties file

		String post_order=getRouteURL().getString("post_order");
		Response response = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body(spayLoad)

				.when()
				.post(post_order);

		return response;


	}

	public static Response getOrder(String orderid)
	{
		//read data from routes.properties file

		String get_order=getRouteURL().getString("get_order");
		Response response = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)

				.when()
				.post(get_order);

		return response;


	}

	public static Response deleteOrder(String order_id)
	{	
		//read data from routes.properties file

		String delete_order=getRouteURL().getString("delete_order");
		Response response = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)

				.when()
				.post(delete_order);

		return response;
	}

}
