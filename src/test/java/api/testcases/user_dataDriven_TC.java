package api.testcases;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endPoints.userEndPoints;
import api.payload.userPayload;
import api.utilities.dataProviders;
import io.restassured.response.Response;

public class user_dataDriven_TC 
{	
	public static Logger logger;

	@Test(priority=1,dataProvider = "AllData", dataProviderClass = dataProviders.class)
	public void testCreateUser(String userId, String UserName, String fname, String lname, String email, String pwd, String phone)
	{

		userPayload userPayload = new userPayload();

		userPayload.setId(Integer.parseInt(userId));
		userPayload.setUsername(UserName);
		userPayload.setFirstName(fname);
		userPayload.setLastName(lname);
		userPayload.setEmail(lname);
		userPayload.setPassword(email);
		userPayload.setPhone(phone);
		Response response = userEndPoints.createUser(userPayload);

		//log response
		response.then().log().all();


		//validation
		Assert.assertEquals(response.getStatusCode(),200);
		
		logger = LogManager.getLogger("RestHybridFramework_Project");
		logger.info("User created");
	}
	
	@Test(priority=2,dataProvider = "usernameData", dataProviderClass = dataProviders.class)
	public void getUser(String username)
	{
		Response response=userEndPoints.getUser(username);

		//log response
		response.then().log().all();

		//validation
		Assert.assertEquals(response.getStatusCode(), 200);	
		
		logger.info("user fetched");
	}

	@Test(priority=3,dataProvider = "usernameData", dataProviderClass = dataProviders.class)
	public void deleteUser(String username)
	{	
		Response response=userEndPoints.deleteUser(username);
		System.err.println("user Deleted");

		//log response
		response.then().log().all();

		//validation
		Assert.assertEquals(response.getStatusCode(), 200);	
		
		logger.info("user deleted");
	}
}
