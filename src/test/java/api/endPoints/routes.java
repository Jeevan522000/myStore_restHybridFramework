package api.endPoints;

public class routes
{
	//base url
		public static String baseURL = "https://petstore.swagger.io/v2";
	
	//user module
		
	// https://petstore.swagger.io/v2/user                          post request to create user
	// https://petstore.swagger.io/v2/user/{username}              get user
	// https://petstore.swagger.io/v2/user/{username}              update user 
	// https://petstore.swagger.io/v2/user/{username}              delete user

	public static String post_user   = baseURL+"/user";
	public static String get_user    = baseURL+"/user/{username}";
	public static String put_user    = baseURL+"/user/{username}";
	public static String delete_user = baseURL+ "/user/{username}";
	
	
	
	//store module
	

	// https://petstore.swagger.io/v2/store/order                      post 
	// https://petstore.swagger.io/v2/store/order/{orderID}            get
	// https://petstore.swagger.io/v2/store/order/{orderID}                      delete
	
	public static String post_order   = baseURL+"/store/order";
	public static String get_order    = baseURL+"/store/order/{orderID}";
	public static String delete_order = baseURL+ "/store/order/{orderID}";
}
