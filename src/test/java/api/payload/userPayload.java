package api.payload;

public class userPayload 
{
	//pojo class - plain old java object
		int Id;
		String username;
		String firstName;
		String lastName;
		String email;
		String password;
		String phoneNo;
		int userStatus;
		
		
		public int getId() {
			return Id;
		}
		public void setId(int Id) {
			this.Id = Id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPhone() {
			return phoneNo;
		}
		public void setPhone(String phone) {
			this.phoneNo = phone;
		}
		public int getUserStatus() {
			return userStatus;
		}
		public void setUserStatus(int userStatus) {
			this.userStatus = userStatus;
		}
		
		
}
