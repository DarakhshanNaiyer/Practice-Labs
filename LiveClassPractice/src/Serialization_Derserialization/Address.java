package Serialization_Derserialization;

public class Address {
	
	String street;
	String city;
	String country;
	
	public Address(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
	}
    
	
}
