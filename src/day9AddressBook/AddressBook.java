package day9AddressBook;

/*
 * Ability to adding a new Contact to Address Book
 */

//import scanner class
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");

		/*
		 * create object of newAddressNook class and add a new contact 
		 */
		newAddressBook person = new newAddressBook();
		person.addContact();

	}

}

class contactDetails {
	private String firstName;
	private String lastName;
	private String addressCity;
	private String state;
	private int zip;
	private String phoneNumber;
	private String email;

	
	/*
	 * here taking the getter setter methods for the contact details
	 */
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

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return " FirstName :" + firstName + " LastName :" + lastName + " Address City : " + addressCity + " State : "
				+ state + " Zip :" + zip + '\'' + " PhoneNumber : " + phoneNumber + " Email : " + email;

	}

}

/*
 * creating a newAddressBook class because using console to add person details from main class AddressBook
 */
class newAddressBook {

	/*
	 * using scanner class for taking details from user input
	 */
	Scanner sc = new Scanner(System.in);

	public void addContact() { 	//calling addContact function from main
		contactDetails person = new contactDetails();
		
		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter last Name: ");
		String lastName = sc.nextLine();
		
		System.out.println("Enter your addressCity: ");
		String addressCity = sc.nextLine();
		
		System.out.println("Enter your state: ");
		String state = sc.nextLine();
		
		System.out.println("Enter zip code : ");
		Long zip = sc.nextLong();
		
		System.out.println("Enter phone number: ");
		String phoneNumber = sc.nextLine();
		
		
		System.out.println("Enter your EMail ID: ");
		String email = sc.nextLine();
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddressCity(addressCity);
		person.setState(state);
		person.setZip(zip.intValue());
		person.setPhoneNumber(phoneNumber);
		person.setEmail(email);
		System.out.println("The Contact Details of " + firstName + "\n" + person);
	}
}
