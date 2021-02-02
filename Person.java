package lecture11;

public class Person {
	private String name;
	private int age;
	private String address;
	private String phone;
	
	public Person( String n, int ag, String ad, String p ) { 
		name = n; age = ag; address = ad; phone = p; 
	}

	public String toString( ) { 
		return getName( ) + " " + getAge( ) + " " + getAddress( ) + " " + getPhoneNumber( ); 
	}

	// getters for all attributes 
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phone;
	}
	
	// setters for address and phone number
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	public void setPhoneNumber(String phoneNumber) {
		phone = phoneNumber;
	}
}
